package classes;

public class ProdutoMain {
	public static void main(String[] args) {
		Produto produto1 = new Produto("Notebook", 3000, 0.80);
		Produto produto2 = new Produto("Celular", 1700, 0.85);
		Produto produto3 = new Produto("null", 0, 0);
		
		
		produto1.nome = "Notebook";
		produto1.preco = 3000;
		produto1.desconto = 0.80;
		
		
		produto2.nome = "Celular";
		produto2.preco = 1700;
		produto2.desconto = 0.85;
		
		produto3.nome = "Caixa de Abelha";
		produto3.preco = 700;
		produto3.desconto = 0.90;
		
		
		
		
		System.out.println(produto1.precoComDesconto());
		System.out.println(produto2.precoComDesconto());
		System.out.println(produto3.precoComDesconto());
		
		/*
		
		System.out.println(produto1.precoComDesconto(produto1.preco, produto1.desconto));
		System.out.println(produto2.precoComDesconto(produto2.preco, produto2.desconto));
		
		System.out.println(produto3.precoComDesconto(produto3.preco, produto3.desconto));
		
		*/
		//System.out.println(produto2.nome.toUpperCase());
		
		
		
	}

}
