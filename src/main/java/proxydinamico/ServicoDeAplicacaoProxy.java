package proxydinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServicoDeAplicacaoProxy implements InvocationHandler {

	private Object obj;
	private Transacao transacao;

	private ServicoDeAplicacaoProxy(Object obj, Transacao transacao) {
		this.obj = obj;
		this.transacao = transacao;
	}
	
	public static Object criarProxy(Object obj, Transacao transacao) {
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new ServicoDeAplicacaoProxy(obj, transacao));
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object n = null;
		try {
			transacao.iniciar();
			if(method.getReturnType() == void.class) {
				method.invoke(obj, args);
			} else {			
				n = method.invoke(obj, args);			
			}
			transacao.finalizar();
		} catch(InvocationTargetException e) {
			transacao.desfazer();
			throw e.getTargetException();
		}
		return n;
	}

}
