package comand;

public class Portao {

	public final static int ABERTO = 0;
	public final static int FECHADO = 0;
	
	private int estado = 0;

	
	
	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	
	public void abrir() {// método abrir
		this.estado =  ABERTO;
		System.out.println("O portao esta  aberto");
	
	}
	
	public void fechar() {// método fechar
		this.estado =  ABERTO;
		System.out.println("O portao esta  fechado");
	
	}
	
	
	public String verEstado() {
		
		if(estado == ABERTO) {
			return "o portao esta aberto";
		}else {
			return "o portao esta fechado";
		}
	}
	
	
	
}
