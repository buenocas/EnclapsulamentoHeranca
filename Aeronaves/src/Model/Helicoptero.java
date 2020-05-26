package Model;

public class Helicoptero extends Aeronaves{
	
	private boolean helices;

	public boolean isHelices() {
		return helices;
	}

	public void setHelices(boolean helices) {
		this.helices = helices;
	}
	
	public void pousoVertical() {
		System.out.println("O " + getModelo() + " irá realizar um pouso vertical!" );
	}

}
