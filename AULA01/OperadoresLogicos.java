package fundamentos;

public class OperadoresLogicos {
	public static void main(String[] args) {
		// ou ||, e &&, nao !, ou exclusivo (xor) ^
		// Scanner entrada = new Scanner (System.in);
		int idade = 17;
		boolean amigoDoDono = false;

		if (!(idade >= 18) && !amigoDoDono) {
			System.out.println("Pode entrar");
		} else {
			System.out.println("Não pode entrar!");
		}

	}

}
