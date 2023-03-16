package atividade1;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Exercicio 4- Leia quatro valores float (n1, n2, n3, n4). A seguir, calcule e mostre a diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4

float n1,n2,n3,n4;
		
		System.out.println("Digite o numero 1:");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o numero 2:");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o numero 3:");
		n3 = leia.nextFloat();
		
		System.out.println("Digite o numero 4 :");
		n4 = leia.nextFloat();
		
		
		System.out.println("A Diferença é:" + ((n1*n2)-(n3*n4)));
	}

}
