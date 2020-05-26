package main;

import java.util.Scanner;

import model.Carro;
import model.Moto;

public class main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		boolean check = false;
		String decisao;

		Carro car = new Carro();
		
		car.setAno(2020);
		car.setCor("Azul");
		car.setModelo("Carro");
		car.setNome("Fusca");
		car.setNumPassageiros(5);
		car.setNumPortas(4);
		car.setPorte("Médio");
		car.setTamanhoPortaMalas("Grande");
		
		car.abrirPortas();
		car.darPartida();
		car.desligar();
		
		System.out.println("-------------------------------------");
		
		Moto moto = new Moto();
		
		moto.setAno(2020);
		moto.setCategoria("City");
		moto.setCor("Roxa");
		moto.setModelo("Moto");
		moto.setNumPassageiros(2);
		moto.setNumRodas(2);
		moto.setPorte("Pequeno");
		moto.setNome("Motocicleta");
		
		moto.darPartida();
		moto.empinar();
		moto.desligar();
		
		System.out.println("-------------------------------------");
		
		/*do {
			
			System.out.println("Escolha um veículo (c para Carro , m para moto)");
			decisao = in.nextLine();
			if(decisao.equals("c")) {
				System.out.println("Você escolheu Carro!");
			}else if(decisao.equals("m")) {
				System.out.println("Você escolheu Moto!");
			}else {
				System.out.println("Opção inválida! Simulação encerrada!");
				check = true;
			}
			
		}while(check == false);*/
		
		
		
	}

}
