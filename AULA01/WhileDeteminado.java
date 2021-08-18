package fundamentos;

public class WhileDeteminado {
	public static void main(String[] args) {
		byte contador = 0;

		// USO ERRADO
		// Underflow de variavvel: transborda por baixo
		System.out.println("Underflow de variavel");
		while (contador < 10) {
			System.out.println(contador);
			contador--;
		}
		System.out.println(contador);

		// USO ERRADO
		contador = 11;
		System.out.println("Overflow de variavel");
		// Overflow va variavel: transborda por cima
		while (contador > 10) {
			System.out.println(contador);
			contador++;
		}
		System.out.println(contador);

		// USO CERTO
		System.out.println("Incremento de 1 em 1");
		contador = 0;
		while (contador <= 8) {
			System.out.println(contador);
			contador++;
		}

		// USO CERTO
		System.out.println("Incremento de 4 em 4");
		contador = 0;
		while (contador <= 8) {
			System.out.println(contador);
			contador += 4;
		}

	}

}
