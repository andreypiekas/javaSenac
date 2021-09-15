package fundamentos;

import java.util.Scanner;

public class Trabalho01comTryECatch {
	public static void main(String[] args) {
		
		double numero = 0;
		int contadorNota = 0;
		double somaTotal = 0.0;
		double media = 0.0;
		String textoInserido = "";
		//flag ou bandeira
		boolean textoInseridoEstaErrado = false;
		

		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao programa de calular média!");
		
		///loop infinito proposital
		while(true) {
			System.out.println("Digite a nota " + (contadorNota + 1) + " ou digite SAIR:");
			textoInserido = entrada.next();
			
			if(textoInserido.equalsIgnoreCase("sair")) {
				break;
			} else {
				
				try {
					numero = Double.parseDouble(textoInserido.replace(',', '.'));
				}catch(NumberFormatException e) {
					//levantei a bandeira do erro
					textoInseridoEstaErrado = true;			
				}
				if(numero >= 0 && numero <= 10 && textoInseridoEstaErrado == false) {
					somaTotal += numero;
					contadorNota++; 
				}else { 
					System.out.println("Nota inválida.");
			
				}
				textoInseridoEstaErrado = false;
			}
		}
		

		media = somaTotal/contadorNota;
		
		System.out.println("Foram inseridas "+contadorNota+" notas.");
		System.out.println("A média das notas é: ");

		System.out.println(String.format("%.2f", media));
		System.out.println("Obrigado por utilizar o programa!");
		
		entrada.close();
	}

}
