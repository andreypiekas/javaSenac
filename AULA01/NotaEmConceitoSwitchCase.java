package fundamentos;

import java.util.Scanner;

public class NotaEmConceitoSwitchCase {
	public static void main(String[] args) {

		// variaveis
		double nota = 0.0;
		int notaArredondada = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma nota: ");
		// nota = (int) Math.round(entrada.nextDouble());

		nota = entrada.nextDouble();
		notaArredondada = (int) Math.round(nota);

		System.out.println(nota);

		switch (notaArredondada) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
		case 7:
			System.out.println("B");
			break;
		case 6:
		case 5:
			System.out.println("C");
			break;
		case 4:
		case 3:
			System.out.println("D");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("E");
			break;
		default:
			System.out.println("Nota Inv�lida");
			break;
		}

		entrada.close();
	}

}
