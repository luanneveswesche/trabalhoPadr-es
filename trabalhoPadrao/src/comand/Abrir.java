package comand;



public class Abrir implements Comand{

	private Portao portao;

	public Abrir(Portao portao) {// recebe um construtor
		super();
		this.portao = portao;
	}

	
	@Override
	public void execute() {// implementa no metodo execute e chama a função abrir ou fechar
		portao.fechar(); // esse metodo sera implementado na classe portao
		
	}
	
	@Override
	public void inicio() {// implementa no metodo execute e chama a função abrir ou fechar
		portao.abrir();// esse metodo sera implementado na classe portao
		
	}
	
}
