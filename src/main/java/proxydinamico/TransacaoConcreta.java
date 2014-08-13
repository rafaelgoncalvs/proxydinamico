package proxydinamico;

public class TransacaoConcreta implements Transacao {

	public void iniciar() {
		System.out.println("Iniciando transação.");
	}

	public void finalizar() {
		System.out.println("Finalizando transação.");
	}

	public void desfazer() {
		System.out.println("Desfazendo alterações.");
	}

}
