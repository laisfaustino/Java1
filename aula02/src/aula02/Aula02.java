package aula02;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 2, n2 = 2, n3 = 5;
		//System.out.println(n1 == n2);
		//System.out.println(n1== n2 && n2 < n3);
		//System.out.println(n1== n2 ^ n2 < n3);
		//System.out.println(n1== n2 ^ n2 > n3);
		//System.out.println(n1 != n2 ^ n2 > n3);
		//System.out.println(n1 != n2 && n2 > n3);
		
		
		System.out.println("Variavel n1:" + n1);
		System.out.println("Variavel n1:" + (++ n1));
		
		System.out.println("Variavel n2:" + n2);
		System.out.println("Variavel n2:" + (n2 ++));
		System.out.println("Variavel n2:" + n2);
		
		System.out.println("Variavel n2:" + (n2+=2));
		
		
		
	}

}
