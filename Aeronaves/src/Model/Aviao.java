package Model;

public class Aviao extends Aeronaves{
	
	private boolean turbina;
	private boolean asas;
	
	public boolean isTurbina() {
		return turbina;
	}
	public void setTurbina(boolean turbina) {
		this.turbina = turbina;
	}
	public boolean isAsas() {
		return asas;
	}
	public void setAsas(boolean asas) {
		this.asas = asas;
	}
	
	
	public void vooComercial() {
		System.out.println("O " + getModelo() + " irá fazer um voo comercial ");
	}
	
	

}
