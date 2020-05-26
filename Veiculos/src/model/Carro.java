package model;

public class Carro extends Veiculo {

	private int numPortas;
	private String tamanhoPortaMalas;
	
	
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	public String getTamanhoPortaMalas() {
		return tamanhoPortaMalas;
	}
	public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
		this.tamanhoPortaMalas = tamanhoPortaMalas;
	}
	
	public void abrirPortas() {
		System.out.println("O " + getModelo() + " abriu as portas");
	}
	
	public void fecharPortas() {
		System.out.println("O " + getModelo() + " fechou as portas");
	}
	
}
