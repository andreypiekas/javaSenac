package fundamentos;

public class SwitchCaseBreak {
	public static void main(String[] args) {
		int numero = 3;

		switch (numero) {
		case 1:
			System.out.println("� o numero um.");
			break;

		case 2:
			System.out.println("� o numero dois.");
			break;
		case 3:
			System.out.println("� o numero tr�s.");
			break;

		default:
			System.out.println("N�o � nenhum caso");

		}

	}
}
