package classes;

public class CoisasRedondasMain {
	public static void main(String[] args) {
		CoisasRedondas rabico = new CoisasRedondas(2);
		CoisasRedondas pizza = new CoisasRedondas(20);
		CoisasRedondas bola = new CoisasRedondas(10);
		
		System.out.println("O rabico tem o comprimento: " + rabico.perimetroCircuferencia());
		System.out.printf("O rabido tem o comprimento: %.2f \n", rabico.perimetroCircuferencia());
		
		System.out.println("A pizza tem �rea: " + pizza.areaCirculo());
		System.out.printf("A pizza tem �rea pizza tem a �rea: %.2f \n", pizza.areaCirculo());
		
		System.out.println("A pizza tem �rea: " + bola.volumeEsfera());
		System.out.printf("A pizza tem �reaA pizza tem a �rea: %.2f \n", bola.volumeEsfera());
		
		CoisasRedondas.pi = 3.1;
		if (rabico.pi == pizza.pi) {
			System.out.println("Os valores de pi s�o iguais.");
		}else
			System.out.println("Os valores de pi n�o n�o iguais.");
		
		
		
	
	}

}
