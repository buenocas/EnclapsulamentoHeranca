package Model;

public class Aeronaves {
	
	private String nome;
	private String modelo;
	private boolean pousoVertical;
	private String porte;
	
	
	
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
	public boolean isPousoVertical() {
		return pousoVertical;
	}
	public void setPousoVertical(boolean pousoVertical) {
		this.pousoVertical = pousoVertical;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	
	public void voar() {
		System.out.println("A Aeronave do tipo " + this.modelo + " está realizando uma voando!!");
	}
	
	public void guinada() {
		System.out.println("A Aeronave do tipo " + this.modelo + " está realizando uma guinada!!");
	}
	
	public void arfagem() {
		System.out.println("A Aeronave do tipo " + this.modelo + " está realizando uma arfagem");
	}
	
	public void rolagem() {
		System.out.println("A Aeronave do tipo " + this.modelo + " está realizando uma rolagem");
	}
	

}
