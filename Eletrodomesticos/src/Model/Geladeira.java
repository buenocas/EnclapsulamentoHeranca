package Model;

public class Geladeira extends Eletrodomesticos {

	private boolean congelar;
	private int numPortas;
	
	
	public boolean isCongelar() {
		return congelar;
	}
	public void setCongelar(boolean congelar) {
		this.congelar = congelar;
	}
	public int getNumPortas() {
		return numPortas;
	}
	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	public void refrigerando() {
		System.out.println("A " + getModelo() + " está refrigerando!");
	}
	
}
