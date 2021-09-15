package desafioDoJantar;

public class Jantar {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Paulo", 64);
		Pessoa p2 = new Pessoa("Joana", 50);
		Comida feijao = new Comida("feijao", 0.300);
		Comida arroz = new Comida("arroz", 0.150);
		
		
		System.out.println("Paulo antes da janta pesava: "+p1.peso);
		System.out.println("Joana antes da dieta pesava: "+p2.peso);

		
		p1.comer(feijao);
		p1.comer(arroz);
		
		p2.comerDuranteSemana(feijao);
		p2.comerDuranteSemana(arroz);
		
		System.out.printf("Paulo após da janta pesara: %.2f\n", p1.peso);
		System.out.printf("Joana após da janta pesara: %.2f\n", p2.peso);

		
		
		
		
	}

}
