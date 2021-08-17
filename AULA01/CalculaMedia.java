package fundamentos;

//import java.util.Locale;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		// Locale.setDefault(new Locale("en", "US");

		// Declaracao de variaveis
		double notaUm = 0.0, notaDois = 0.0, media = 0.0;
		Scanner entrada = new Scanner(System.in);

		// ENTRADA DE DADOS
		// Metodo para pegar os valores que o usuario digita
		System.out.println("Bem vindo. Digite a primeira nota: ");
		notaUm = entrada.nextDouble();

		System.out.println("Agora digite a segunda nota: ");
		notaDois = entrada.nextDouble();

		// Logica para calcular a média
		media = (notaUm + notaDois) / 2;

		// Testar se o usuario foi aprovado ou reprovado
		if (media >= 7) {
			System.out.println("Aluno aprovado!");
		} else
			System.out.println("Aluno reprovado!");

		// SAIDA DE DADOS
		// Metodo de mostrar a media para o usuario
		System.out.println("A média é " + media);

		// Desligar o scanner
		entrada.close();
	}
}
