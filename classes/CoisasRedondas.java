package classes;

public class CoisasRedondas {
	//atributos
	static double pi = 3.14;
	double raio;
	
	//construtores
	public CoisasRedondas(double raioInserido) {
		raio = raioInserido;
	}
	
	//métodos
	
	double perimetroCircuferencia() {
		return 2 * pi * raio;
	}
	
	double areaCirculo() {
		//return pi * (raio * raio);
		//Utilizados um atributo e um método estático da classe Math
		return Math.PI * Math.pow(raio, 2);
	}
	
	double volumeEsfera() {
		return 4/3 * pi * (raio * raio * raio);
	}

}
