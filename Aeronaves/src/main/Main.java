package main;

import Model.Aviao;
import Model.Helicoptero;

public class Main {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		
		aviao.setAsas(true);
		aviao.setModelo("Avião");
		aviao.setPorte("Grande");
		aviao.setPousoVertical(false);
		aviao.setTurbina(true);
		aviao.setNome("A320");
		
		aviao.voar();
		aviao.arfagem();
		aviao.guinada();
		aviao.rolagem();
		aviao.vooComercial();
		
		System.out.println("------------------------------");
		
		Helicoptero helix = new Helicoptero();
		
		helix.setHelices(true);
		helix.setModelo("Helicóptero");
		helix.setPorte("Pequeno");
		helix.setPousoVertical(true);
		helix.setNome("Algum Helicóptero");
		
		helix.voar();
		helix.arfagem();
		helix.guinada();
		helix.rolagem();
		helix.rolagem();
		helix.pousoVertical();
		
	}

}
