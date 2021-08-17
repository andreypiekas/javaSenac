package fundamentos;

public class SwitchCaseBreak {
	public static void main(String[] args) {
		int numero = 3;

		switch (numero) {
		case 1:
			System.out.println("É o numero um.");
			break;

		case 2:
			System.out.println("É o numero dois.");
			break;
		case 3:
			System.out.println("É o numero três.");
			break;

		default:
			System.out.println("Não é nenhum caso");

		}

	}
}
