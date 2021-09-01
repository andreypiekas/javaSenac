package classes;

public class ValorVsReferencia {
	public static void main(String[] args) {
		int a = 2;
		int b = a;
		
		a++; //incremento de 1
		//b--; //decremento de 1
		
		System.out.println(a);
		System.out.println(b);
		
		Produto p1 = new Produto("Banana", 2, 0.5);
		Produto p2 = p1;
		
		p1.nome = "mamao";
		
		System.out.printf("Produto: %s custa %.2f e o desconto "
				+ "é %.2f \n", p2.nome, p2.preco, p2.desconto);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
	}

}
