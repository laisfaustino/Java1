package aula_01;

import java.util.Scanner;


public class Aula01 {
	

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		
		double numero1, numero2;
		String nome;
		
		System.out.println("Digite seu nome:");
		nome = leia.nextLine();
		
		System.out.println("Digite o primeiro numero");
		numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo numero");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma:" + (numero1+numero2));
		System.out.println("subtração:" + (numero1-numero2));
		System.out.println("Multiplicão:" +(numero1*numero2));
		System.out.println("Divisão:" + (numero1/numero2));
		System.out.println("Potência:" + Math.pow(numero1,numero2));
		System.out.println("Raiz Quadrada:" + Math.sqrt(numero1));
		System.out.println("Nome:" + nome);
		
		
	}
	

}
