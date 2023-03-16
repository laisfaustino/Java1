package atividade1;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//Exercicio 2- Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela a média final do participante.
		
		float nota1,nota2,nota3,nota4;
		
		System.out.println("Digite Nota 1:");
		nota1 = leia.nextFloat();
		
		System.out.println("Digite Nota 2:");
		nota2 = leia.nextFloat();
		
		System.out.println("Digite Nota 3:");
		nota3 = leia.nextFloat();
		
		System.out.println("Digite Nota 4:");
		nota4 = leia.nextFloat();
		
		System.out.println("Sua Media Final é:" + (nota1 + nota2 + nota3 + nota4)/4);


	}

}
