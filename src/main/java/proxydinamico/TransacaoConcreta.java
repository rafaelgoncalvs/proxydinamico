package proxydinamico;

public class TransacaoConcreta implements Transacao {

	public void iniciar() {
		System.out.println("Iniciando transa��o.");
	}

	public void finalizar() {
		System.out.println("Finalizando transa��o.");
	}

	public void desfazer() {
		System.out.println("Desfazendo altera��es.");
	}

}
