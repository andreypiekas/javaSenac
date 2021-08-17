package fundamentos;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		// (F -32) * 5/9 = C
		/*
		 * int fahrenheit = 77; int soma = (fahrenheit - 32) *5/9; int celsius = soma;
		 * System.out.println(celsius);
		 * 
		 */
		final int AJUSTE32 = 32;
		/*
		 * para atribuir um valor a uma variavel do tipo double colocamos um valor
		 * explicito em double com a casa decimal
		 */

		final double FATORDEMULTIPLICACAO = 5.0 / 9;
		// final double FATORDIVISAO = 9;

		double tempFarenheit = 77;
		double tempCelsius;
		tempCelsius = (tempFarenheit - AJUSTE32) * FATORDEMULTIPLICACAO;
		// tempCelsius = (tempFarenheit - AJUSTE32) * FATORDEMULTIPLICACAO /
		// FATORDIVISAO;
		System.out.println(tempCelsius);

	}

}
