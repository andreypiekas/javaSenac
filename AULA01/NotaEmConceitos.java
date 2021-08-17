package fundamentos;

import java.util.Scanner;

public class NotaEmConceitos {
	public static void main(String[] args) {
		// A, B, C, D, E
		/*
		 * Nota 0 a 2 - E Nota 2 ... ate 4 - D Nota 4 ... ate 6 - C Mota 6 ... ate 8 - B
		 * Nota 8 ... ate 10 - A
		 */

		// Declaracao de variaveis
		double nota = 0.0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma nota:");
		nota = entrada.nextDouble();

		String conceito;
		if (nota > 8.0 && nota <= 10.0) {
			conceito = "A";
		} else if (nota > 6.0 && nota <= 8.0) {
			conceito = "B";
		} else if (nota > 4.0 && nota <= 6.0) {
			conceito = "C";
		} else if (nota > 2.0 && nota <= 4.0) {
			conceito = "D";
		} else if (nota >= 0.0 && nota <= 2.0) {
			conceito = "E";
		} else {
			conceito = "Nota inv�lida";
		}

		System.out.println(conceito);

		entrada.close();
	}

}
