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

		//System.out.println("Sua idade é: " + idade);
		//System.out.println("Sua altura é: " + altura);
		//System.out.println("Seu nome é: " + nome);
		//System.out.println("Seu sobrenome é: " + sobrenome);

		//System.out.println("Sua idade é: " + idade + " " + "Sua altura é: " + altura + " " + "Seu nome é: " + nome + " "
		//		+ "Seu sobrenome é: " + sobrenome + " ");
		System.out.println(nome + " " + sobrenome 
				+ " Idade: " + idade + 
				" Altura: " + altura + "");

		entrada.close();
	}


}
