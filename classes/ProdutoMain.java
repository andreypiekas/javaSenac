package classes;

public class ProdutoMain {
	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		
		
		produto1.nome = "Notebook";
		produto1.preco = 3000;
		produto1.desconto = 0.80;
		
		
		produto2.nome = "Celular";
		produto2.preco = 1700;
		produto2.desconto = 0.85;
		
		//System.out.println(produto2.nome.toUpperCase());
		
		
		
	}

}
