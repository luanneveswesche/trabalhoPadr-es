package comand;

public class Controle {

	private Comand[] comand;// duas listas de comando no caso as execuções de inicio
	private Comand ultimoComando;
	
	
	public Controle(Comand abrir, Comand fechar) {
		
		this.comand = new Comand[2];
		comand[0] = abrir;
		comand[1] =  fechar;
		
	}
	
	public void abrirPortao() {
		comand[0].execute();
		ultimoComando = comand[0];
	}
	
	public void fecharPortao() {
		comand[1].execute();
		ultimoComando = comand[1];
	}
	
	public void desfazer() {
		ultimoComando.inicio();
	}
	
	
	
}
