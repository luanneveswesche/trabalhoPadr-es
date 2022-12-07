package trabalhoPadrao;

public interface ColaboradorDAOInterface {

// interface proxi 
	
	public void addColaborador(String nome, String cidade) throws ColaboradorException;
// adiciona o funcioario e pode lançar uma excessão no throws exception
	
	public Colaborador getColaborador(String nome, String cidade) throws ColaboradorException;
}// recupera o funcionario

	
	

