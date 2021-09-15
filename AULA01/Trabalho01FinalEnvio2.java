package fundamentos;

import java.util.Scanner;

public class Trabalho01FinalEnvio2 {
	public static void main(String[] args) {
		//DECLARACAO DE VARIAVEIS
		int total = 0;
		double nota = 0.0, calculo = 0.0, nFinal = 0.0;
		//COMO VOU UTILIZAR FOR, NAO HÁ NECESSIDADE DE INICIAR UM CONTADOR
		Scanner entrada = new Scanner(System.in);
		
		//SEM MENSAGEM DE BOAS VINDAS
		
		System.out.println("Informe a quantia de notas a ser informada: ");
		total = entrada.nextInt();

		for (int i = 1; i != total; i++) { // INICIEI MEU INT EM 1, OCASIONANDO A PERCA DE 1 NOTA, VISTO QUE INICIAVA EM 1 E NAO 0. DEVERIA SER 0.
			System.out.printf("Informe a nota %d: ", i); 
			//NAO FOI EFETUADO UMA VERIFICACAO DE NUMERO MAIOR QUE ZERO E MENOR OU IGUAL A 10, TAO QUANTO A VERIFICACAO SE
			//ENTROU CARACTERES
			nota = entrada.nextDouble();
			calculo += nota;
			//SEM NECESSIDADE DE CONTADOR, VISTO QUE O PROPRIO FOR JA FAZ ISSO A CADA CICLO.
			//COMO NAO FOI VERIFICADO SE A NOTA ERA VALIDA OU NAO, FALTOU UM ELSE INFORMANDO QUE NOTA ERA INVALIDA
		}
		nFinal = calculo / total;
		System.out.println("A nota final é de: " + nFinal);//NAO FOI FEITO UMA FORMATACAO PARA DEFINIR NUMERO DE CASAS DECIMAIS NA SAIDA, PODERIA TER UTILIZADO PRINTF
		///SEM MENSAGEM DE DESPEDIDA???
		//NAO VI A NECESSIDADE DE UMA MENSAGEM DE BOAS VINDAS OU DESPEDIDA, PENSANDO QUE O USUARIO
		//IRIA PARA A PARTE PRATICA DE UMA VEZ.
		
		entrada.close();
	}

}
