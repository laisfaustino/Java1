package atividade1;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		// Exercicio 3- Elabore um algoritmo em Java, que leia o Salário Bruto, o Adicional Noturno, as Horas Extras e os Descontos de um Colaborador, em variáveis do tipo float e exiba na tela o Salário Líquido.

float salarioBruto,adicionalNoturno,horaExtra,descontos;
		
		System.out.println("Digite o valor do seu Salario:");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor de Adicional Noturno:");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor de Hoars Extras:");
		horaExtra = leia.nextFloat();
		
		System.out.println("Digite os Descontos :");
		descontos = leia.nextFloat();
		
		System.out.println("Seu Salário Liquido é:" + (salarioBruto + adicionalNoturno + (horaExtra *5) - descontos));

	}

}
