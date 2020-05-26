package Model;

public class Eletrodomesticos {
	
	private int voltagem;
	private String nome;
	private String modelo;
	
	
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void ligar() {
		System.out.println("O " + this.modelo + " está ligando!");
	}
	
	public void desligar() {
		System.out.println("O " + this.modelo + " está desligando!");
	}
	
	public void funcionando() {
		System.out.println("O " + this.modelo + " está funcionando!");
	}

}
