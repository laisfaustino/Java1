package atividade1;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		// Exercicio 1- Dado o Fluxograma abaixo, desenvolva o algoritmo abaixo na Linguagem Java
		float valor1,valor2;
		
		System.out.println("Digite seu salario:");
		valor1 = leia.nextFloat();
		
		System.out.println("Digite o Abono:");
		valor2 = leia.nextFloat();
		
		System.out.println("O seu novo salario é:" + (valor1 + valor2));

	}
 
}
