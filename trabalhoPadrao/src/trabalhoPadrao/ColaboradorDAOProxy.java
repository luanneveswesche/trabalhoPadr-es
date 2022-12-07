package trabalhoPadrao;
import java.util.HashMap;
import java.util.Map;


// proxy centraliza o acesso aos dados 
public class ColaboradorDAOProxy implements ColaboradorDAOInterface {
	private Map<String, Colaborador> colaboradores;
	
// colaboradores estao armazenados em um map
	public ColaboradorDAOProxy() {
		super();
		this.colaboradores = new HashMap<>();
	}

@Override
public void addColaborador(String nome, String cidade) throws ColaboradorException {
	this.colaboradores.put(nome,new Colaborador(nome,cidade));
	
}

@Override
public Colaborador getColaborador(String nome, String cidade) throws ColaboradorException {
	// pega o map onde esta aarmazenado passa como parametro e retorna os métodos get dos atributos 
	return  ((Map<String, Colaborador>) colaboradores.get(nome)).get(cidade);
}

	
}
