package fundamentos;

import java.util.Scanner;

public class ParticularidadeNext {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escreva sua idade: ");
		int idade = entrada.nextInt();

		System.out.println("Escreva sua altura: ");
		double altura = entrada.nextDouble();

		System.out.println("Digite seu nome: ");
		//clearBuffer(entrada);
		/*o metodo next ele deleta todos os espacos e caracteres nao imprimiveis
		 * antes e apos um texto para ficar no formato valido 
		 * Todos os next desconsideram essas coisas, exceto o nextLine
		 * 
		 */
		String nome = entrada.nextLine();

		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		//System.out.println("Sua idade �: " + idade);
		//System.out.println("Sua altura �: " + altura);
		//System.out.println("Seu nome �: " + nome);
		//System.out.println("Seu sobrenome �: " + sobrenome);

		//System.out.println("Sua idade �: " + idade + " " + "Sua altura �: " + altura + " " + "Seu nome �: " + nome + " "
		//		+ "Seu sobrenome �: " + sobrenome + " ");
		System.out.println(nome + " " + sobrenome 
				+ " Idade: " + idade + 
				" Altura: " + altura + "");

		entrada.close();
	}


}
