package Main;

import Model.Computador;
import Model.Geladeira;

public class main {

	public static void main(String[] args) {
		
		Computador cp = new Computador();
		
		cp.setModelo("Notebook");
		cp.setNome("Acer");
		cp.setMonitor(false);
		cp.setTipo("Computador");
		cp.setTeclado(false);
		cp.setMouse(false);
		cp.setVoltagem(220);
		
		cp.ligar();
		cp.funcionando();
		cp.acessando();
		cp.enviandoEmail();
		cp.desligar();
		
		System.out.println("------------------------------------------------");
		
		Geladeira gela = new Geladeira();
		
		gela.setModelo("Freezer");
		gela.setNumPortas(1);
		gela.setCongelar(true);
		gela.setVoltagem(220);
		gela.setNome("Consul");
		
		gela.ligar();
		gela.funcionando();
		gela.refrigerando();
		gela.desligar();
	}

}
