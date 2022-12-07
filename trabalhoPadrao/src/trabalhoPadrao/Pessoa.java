package trabalhoPadrao;
// padrao fluent
public class Pessoa {
	
	//classe responsavel para gerir o cadastro de gestores da empresa
	private String name;
	private String admissao;
	private String nivel;
	private Cargo cargo;// faz uma associação a classe cargo 

	public Pessoa isNamed(String name) {// método que chama a instancia
		this.name = name;//destaca o atibuto
		return this;//método this retrona a instancia para o proprio objo
	}
	 
	public Pessoa isBormnedOn(String admissao) {// referencia para chamar otrro método
		this.admissao = admissao;
		return this;
	}
	public Pessoa islevel(String nivel) {
		this.nivel = nivel;
		return this;	
	}
	public Pessoa isNamed(Cargo cargo) {
		this.cargo = cargo;
		return this;
	}
//
	public String named() {
		return name;
	}
	public String getBirthDate() {
		return admissao;
	}
	public String getNivel() {
		return nivel;
	}

	public Cargo getRole() {
		return cargo;
	}

}
