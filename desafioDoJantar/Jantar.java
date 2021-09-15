package desafioDoJantar;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Andrey", 64);
		Comida feijao = new Comida("feijao", 0.300);
		Comida arroz = new Comida("arroz", 0.150);
		
		
		System.out.println(p1.peso);
		
		p1.comer(feijao);
		p1.comer(arroz);
		
		System.out.println(p1.peso);
		
		
		
	}

}
