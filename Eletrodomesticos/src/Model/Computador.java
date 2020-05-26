package Model;

public class Computador extends Eletrodomesticos {
	
	private boolean teclado;
	private boolean mouse;
	private boolean monitor;
	
	
	public boolean isTeclado() {
		return teclado;
	}
	public void setTeclado(boolean teclado) {
		this.teclado = teclado;
	}
	public boolean isMouse() {
		return mouse;
	}
	public void setMouse(boolean mouse) {
		this.mouse = mouse;
	}
	public boolean isMonitor() {
		return monitor;
	}
	public void setMonitor(boolean monitor) {
		this.monitor = monitor;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	private String tipo;
	
	public void acessando() {
		System.out.println("O" + getModelo() + " está acessando a internet");
	}
	
	public void enviandoEmail() {
		System.out.println("O" + getModelo() + " está enviando um E-mail");
	}

}
