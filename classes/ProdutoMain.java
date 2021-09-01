package classes;

public class ProdutoMain {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 3000, 0.80);
		Produto produto2 = new Produto("Celular", 1700, 0.85);
		//nao existe mais construtor padrao que nao tem argumento
		Produto produto3 = new Produto();
		
		/*
		produto1.nome = "Notebook";
		produto1.preco = 3000;
		produto1.desconto = 0.80;
		
		
		produto2.nome = "Celular";
		produto2.preco = 1700;
		produto2.desconto = 0.85;
		
		*/
		
		double precoFinal1 = produto1.precoComDesconto();
		double precoFinal2 = produto2.precoComDesconto();
		//double precoFinal3 = produto3.precoComDesconto();


		//quando utiliza-se o printf o % � um lugar para trocar po um atributo
		//$s � trocado por uma String
		//%.2f � trocado por um numero de ponto flutuante (floate ou double) com 2 casas decimais
		System.out.printf("O pre�o final do %s � R$%.2f \n", produto1.nome, precoFinal1);
		System.out.printf("O pre�o final do %s � R$%.2f \n", produto2.nome, precoFinal2);

		//System.out.printf("O pre�o final do %s � R$%.2f \n", produto3.nome, precoFinal3);
		
		precoFinal1 = produto1.precoComDesconto(0.3);
		System.out.printf("O pre�o final do %s � R$%.2f \n", produto1.nome, precoFinal1);
	
		System.out.println(Produto.precoComDesconto(4000, 0.90));
		//System.out.println(produto2.nome);
		//System.out.println(produto3.precoComDesconto(5000, 0.1));
		
		/* Cuidado com construtores padr�o!
		 * Explicar acesso por c�pia e acesso por refer�ncia
		 */
		//System.out.println(produto3.nome.toUpperCase());
		
		System.out.println(produto3.nome);
		System.out.println(produto3.preco);
		System.out.println(produto3.desconto);
		
		//int numero;
		//System.err.println(numero);
		
		for (int i = 0; i< 3; i++) {
			System.out.println(i);
		}
		
		
	}

}