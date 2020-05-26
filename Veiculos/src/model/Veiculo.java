package model;

public class Veiculo {
	
	private int numRodas;
	private String nome;
	private String modelo;
	private int ano;
	private int numPassageiros;
	private String cor;
	private String porte;
	private int velocidade;
	
	
	public int getNumRodas() {
		return numRodas;
	}
	public void setNumRodas(int numRodas) {
		this.numRodas = numRodas;
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
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getNumPassageiros() {
		return numPassageiros;
	}
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void darPartida() {
		System.out.println("O " + this.modelo + " está dando partida!" );
	}
	
	public void desligar() {
		System.out.println("O " + this.modelo + " está desligando!");
	}
	
	public int acelerar() {
		
		return this.velocidade;
	
		
	}
	
	public void frear() {
		
	}

}
