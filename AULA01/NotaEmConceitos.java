package fundamentos;

import java.util.Scanner;

public class NotaEmConceitos {
	public static void main(String[] args) {
		//A, B, C, D, E
		/*
		 * Nota 0 a 2 - E
		 * Nota 2 ... ate 4 - D
		 * Nota 4 ... ate 6 - C
		 * Mota 6 ... ate 8 - B
		 * Nota 8 ... ate 10 - A
		 */
		
		Scanner entrada = new Scanner (System.in);
		
		double nota = 0.0;
		char conceito;
		
		System.out.println("Digite a primeira nota: ");
		double notaUm = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double notaDois = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double notaTres = entrada.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double notaQuatro = entrada.nextDouble();
		System.out.println("Digite a quinta nota: ");
		double notaCinco = entrada.nextDouble();
		
		if (nota > 8.0 && nota <= 10.00) {
			conceito = 'A';
			
		}else if (nota > 6 && nota <=8.00 ) {
			conceito = 'B';
		}else if (nota > 4 && nota <=6) {
			conceito = 'C';
		}else if (nota > 2 && nota <=4) {
			conceito = 'D';
		}
		
		
		
		
		
		nota = (notaUm + notaDois + notaTres + notaQuatro + notaCinco) / 5;
		
		
		
		
		entrada.close();
	}
	
	
}
