package fundamentos;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		// boolean perguntouParaSair = false;
		String texto = "";

		Scanner entrada = new Scanner(System.in);

		// equal é o equivalente ao == para string
		while (!texto.equalsIgnoreCase("sair")) {
			System.out.println("Digite um texto: ");
			texto = entrada.nextLine();
			System.out.println(texto);
		}

		int numero = 0;

		while (numero != -1) {
			System.out.println("Digite um numero: ");
			numero = entrada.nextInt();

			System.out.println(numero);
		}

		entrada.close();

	}

}
