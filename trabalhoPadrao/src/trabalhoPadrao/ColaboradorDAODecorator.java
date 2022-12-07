package trabalhoPadrao;

// usando o decorator
public class ColaboradorDAODecorator implements ColaboradorDAOInterface {
	//implementa a interface 
	
	private static ColaboradorDAOInterface colaboradorDAO;// tem um atributo statico
// adiciona novas funcionalidades

	
	private ColaboradorDAOInterface getDAO() {// ao iniciar o  getdao verifica se é nulo
		if (colaboradorDAO == null)// se for nulo ->
			colaboradorDAO = new ColaboradorDAOProxy(); // cria a se um colaborador
		return colaboradorDAO;// ou retorna usuario dao
	}
	
	
	
	
	public void addColaborador(String nome, String cidade) throws ColaboradorException {
		
		if (nome.isEmpty())// verifica se o nome é verdadeiro caso ele tenha sido pré defonido no argumeno instanciado
			throw new ColaboradorException("Digite um nome de usuário válido!");
		if (cidade.isEmpty())// compara se a cidade é verdadeira e se ela essta definida no argumento instanciado
		    throw new ColaboradorException("Digite uma cidade  válida!");
		
		getDAO().addColaborador(nome, cidade);
		
	}

	@Override
	public Colaborador getColaborador(String nome, String cidade) throws ColaboradorException {
		if (nome.isBlank())//verifica o nome que foi passado como string
			throw new ColaboradorException("Digite um nome de um colaborador válido!");
		if (cidade.isBlank())//verifica o cidade que foi passado como string
			throw new ColaboradorException("Digite um nome de uma cidade válida!");
		
		Colaborador co = getDAO().getColaborador(nome, cidade); //cria se um objeto para recuperar o colaborador 
		if (co == null)//verifica se é nulo e lança uma excessao
			throw new ColaboradorException("Digite um nome de colaborador válido!");
		if (co == null)//verifica se é nulo e lança uma excessao   
		throw new ColaboradorException("Digite um nome de uma cidade válida!");
		    
		    return co;// ou retorna o usuario
	}
	
}