package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String nome = "Andrey";
		String sobrenome = "Piekas";

		
		//Concatenacao de strings
		System.out.println(nome + " " + sobrenome);
		System.out.println(nome.concat(sobrenome));
		
		
		
		//Metodo lenght da a quantidade de catacteres de uma palavra
		System.out.println("abacaxi".length());
		
		
		
		System.out.println("  abacaxi");
		System.out.println("  abacaxi".trim());
		System.out.println("  abacaxi".trim().toUpperCase());

		
		System.out.println("Olá esse é um texto"
				+ " muito comprido mesmo ashuashuashuashuashuashusahusa"
				+ "sahuashusahusahuashusahusahusahuashuas"
				+ "shusahuashuashusahusahusa"
				+ "sauhshuashuas");
		
		System.out.print("Esse é o print\n");//print nao poe um \n no final 
		System.out.print("O print é bem legal");
		
	}

}
