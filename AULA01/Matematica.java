package fundamentos;

public class Matematica {
	public static void main(String[] args) {
		// OPERADORES ARITIMETICOS
		// + - * / %

		int numero = 3;
		System.out.println(numero * numero * numero);

		System.out.println(Math.random() * numero);

		System.out.println(Math.pow(numero, 4));

		System.out.println(Math.round(2.69));

		// (int) é um CAST para inteirom onde cast é conversao
		int numeroArredondado = (int) Math.round(3_000_000_157L);
		System.out.println(numeroArredondado);

	}

}
