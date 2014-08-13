package proxydinamico;

public class Exemplo {
	public static void main(String[] args) {
		Transacao transacao = new TransacaoConcreta();
		ServicoDeAplicacao servicoDeAplicacao = (ServicoDeAplicacao) ServicoDeAplicacaoProxy.criarProxy(new ServicoDeAplicacaoConcreto(), transacao);
		
		servicoDeAplicacao.salvar();
		
		long codigo = 1;
		String usuario = servicoDeAplicacao.buscar(codigo);
		
		System.out.println(usuario);
	}
}
