package proxydinamico;

public class ServicoDeAplicacaoConcreto implements ServicoDeAplicacao {

	public void salvar() {
		System.out.println("Dados salvo com sucesso");
	}

	public String buscar(long id) {
		System.out.println("Buscando usu�rio com c�digo " + id);
		return "C�digo " + id + " - Usu�rio Rafael Gon�alves";
	}

}
