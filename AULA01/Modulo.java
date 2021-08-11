package fundamentos;

import java.util.Scanner;

public class Modulo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero: ");
		int numero = entrada.nextInt();
		
		if (numero%3== 0) {
			System.out.println("Multiplo de 3!");
		}else {
			System.out.println("Não é multiplo de 3!");
		}
	
		entrada.close();
	}

}
