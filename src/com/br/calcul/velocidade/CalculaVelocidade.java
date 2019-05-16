package com.br.calcul.velocidade;
import java.util.Scanner;

public class CalculaVelocidade {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double tempo;
		double velocidadMedia;;
		double distancia;
		double litrosGastos;
		
		
		System.out.println("informe o tempo gasto");
		
		tempo = s.nextDouble();
		
		System.out.println("informe velocidade media");
	
		velocidadMedia = s.nextDouble();
		
		
		distancia = tempo * velocidadMedia;
		
		litrosGastos = distancia/12;
		
		System.out.println("Esta foi sua media de velocidade:" + velocidadMedia+"km hora");
		System.out.println("Este foi o tempo gasto:" + tempo);
		System.out.println("Esta foi a diatancia percorrida:" + distancia);
		System.out.println("Quantidade gasta de combustivel:" + litrosGastos);
		
		
		
		

	}

}
