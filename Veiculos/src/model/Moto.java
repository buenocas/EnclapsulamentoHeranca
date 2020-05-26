package model;

public class Moto extends Veiculo {
	
	public String categoria;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public void empinar() {
		System.out.println("A " + getModelo() + " está sendo empinada!!");
	}
	

}
