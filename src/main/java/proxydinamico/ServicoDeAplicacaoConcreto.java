package proxydinamico;

public class ServicoDeAplicacaoConcreto implements ServicoDeAplicacao {

	public void salvar() {
		System.out.println("Dados salvo com sucesso");
	}

	public String buscar(long id) {
		System.out.println("Buscando usuário com código " + id);
		return "Código " + id + " - Usuário Rafael Gonçalves";
	}

}
