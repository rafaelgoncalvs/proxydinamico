package proxydinamico;

public interface Transacao {
	void iniciar();
	void finalizar();
	void desfazer();
}
