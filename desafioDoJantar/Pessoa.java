package desafioDoJantar;

public class Pessoa {
	//Atributos
	String nome = "";
	double peso = 0; //em Kg
	
	
	//Construtor
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
		
	}
	
	
	//Argumento chamado "comida" do tipo objeto da classe "Comida".
	void comer(Comida comida) {
		peso += comida.peso;
	
	}
	


	

}
