package trabalho01Alunos;

import java.util.Scanner;

public class AndreyPiekas {
	public static void main(String[] args) {
		int total = 0;
		double nota = 0.0, calculo = 0.0, nFinal = 0.0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a quantia de notas a ser informada: ");
		total = entrada.nextInt();

		for (int i = 1; i != total; i++) {
			System.out.printf("Informe a nota %d: ", i);
			nota = entrada.nextDouble();
			calculo += nota;
		}
		nFinal = calculo / total;
		System.out.println("A nota final é de: " + nFinal);
		entrada.close();
	}
}
/*
 * Muito bem! Está no caminho!
 * Ideia interessante para não utilizar o while.
 * Acredito que faltaram testes para notas válidas, seu
 * programa aceita notas negativas e maiores que 10.
 * */
