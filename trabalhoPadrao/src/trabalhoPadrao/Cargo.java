package trabalhoPadrao;

// padrao fluent
public class Cargo {
	
	// classe responsavel por nomear o cargo
	private String name;
	
	public Cargo isNamed(String name) {//crio método named como chamado para o construtor 
		this.name = name;//seta o atributo
		return this;// retorna a instancia do proprio objeto
	}
}
