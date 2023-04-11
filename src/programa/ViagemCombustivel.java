package programa;

import java.util.Scanner;

public class ViagemCombustivel {

	public static void main(String[] args) {
		
		double autonomia = 12.0;
		double distancia, qtdeCombustivel, tempo, velocidade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a velocidade média da viagem?");
		velocidade = sc.nextDouble();
		System.out.println("Quanto tempo a viagem vai durar?");
		tempo = sc.nextDouble();
		
		distancia = velocidade * tempo;
		qtdeCombustivel = distancia / autonomia;
		
		System.out.printf("Serão necessários %.3f de litros de combustível para a viagem ser realizada!", qtdeCombustivel);
		
		sc.close();
		
	}

}
