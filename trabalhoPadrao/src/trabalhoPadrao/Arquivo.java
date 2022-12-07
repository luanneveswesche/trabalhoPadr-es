package trabalhoPadrao;
// classe static e singleton
import java.util.ArrayList;


// classe fiicara resposavel pelo departamento pessoal da empresa 
public class Arquivo {
	
	
	private String nome;
	private String setor;
	private ArrayList<Documento>ArrayList;//  array vai armazenar todos os documentos destacado por atributos  na classe 
	private static Arquivo arquivo;//só existe um objeto para a classe ,armazena o arquivo caso ele tenha sido criado

	
	
	public Arquivo(String nome, String setor, ArrayList<Documento> arrayList) {
		super();
		this.nome = nome;
		this.setor = setor;
		ArrayList = arrayList;
	}

	//construtor privado ajuda na classe singleton
	private Arquivo(String nome) {
		this.nome = nome;
		this.setor = "";
		this.ArrayList = null;
	}


	// cria se método statico para criar objetos mais diretamente da classe arquivo
	//mn
	public static Arquivo criaNome(String nome) {
		if (arquivo != null) {//S= verrifica se o arq. é igual ou diferente de nulo
			arquivo.setNome(nome);
			return arquivo;// S=se ele ja  estiver sido criado so retorna o arquivo
		}

		if (!valida(nome))// verifico se o nome foi validado
			return null;// se nao validar retorna nulo
		Arquivo a = new Arquivo(nome);// se validar cria o objeto
		a.setNome(nome);
		return a;
	}

	public static Arquivo criaSetor(String nome, String setor) {
		if (arquivo != null) {//verifico se o nome foi validado
			arquivo.setNome(nome);
			arquivo.setSetor(setor);
			return arquivo;
		}

		if (!valida(nome))
			return null;
		if (!valida(setor))

			return new Arquivo(nome);// ja retorna o arquivo criando o objeto
		return arquivo;
		
	}

	public static Arquivo criadocumento(String nome, String conteudo, ArrayList<Documento> arrayList) {
		if (arquivo != null) { // ao criar documento verifica se o arquivo é igual ou diferente de nulo
			arquivo.setNome(nome);
			arquivo.setArrayList(arrayList);
			return arquivo;// se ja estiver criado retorna o arquivo 
		}

		if (!valida(nome))
			return null;
		Arquivo a = new Arquivo(nome);// inicializo com o nome o objeto
		
		
		return a;// retorno ao objeto criado
	}

	public static Arquivo cria(String nome, String setor, ArrayList<Documento> arrayList) {
		if (arquivo != null) {
			arquivo.setNome(nome);
			arquivo.setSetor(setor);
			arquivo.setArrayList(arrayList);
		
			return arquivo;
		}

		if (!valida(nome))
			return null;
		if (!valida(setor))
			return null;
		return new Arquivo(nome,setor,arrayList);// cria o construtor com os 3 atributoos
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (!valida(nome))
			return;
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if (!valida(setor))
			return;
		this.setor = setor;
	}

	public ArrayList<Documento> getArrayList() {
		return ArrayList;
	}

	public void setArrayList(ArrayList<Documento> arrayList) {
		ArrayList = arrayList;
	}

	private static boolean valida(String nome2) {
		return !nome2.contains(" ");// método para realizar uma negação
	}


}
