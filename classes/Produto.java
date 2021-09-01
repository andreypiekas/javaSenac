package classes;

public class Produto {
	//Atributos
	String nome;
	double preco;
	double desconto;
	
	
	//Construtor Padrao - nao tem retorno e nem argumentos
	///argumento � o que vai dentro do parenteses
	//retorno � o que vai na frente do metodo
	
	Produto(){
		
	}
	
	
	//Construtor definido pelo dev
	//Argumentos s�o salvos dentro dos atributos da classe
	Produto(String nomeInserido, 
			double precoInserido, 
			double descontoInserido){
		nome = nomeInserido;
		preco = precoInserido;
		desconto = descontoInserido;
	}
	
	
	/*
	//double precoComDesconto;
	 	
	double precoComDesconto() {
		//precoComDesconto = preco * desconto;
		return preco * desconto;
	}
	*/
	//metodo tem o tipo de retorno na frente do nome
	double precoComDesconto() {
		return preco * desconto;
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (desconto - descontoDoGerente);
	}
	//metodo com mesmo nome mas com assinatura diferente
	//asstinatura � o conjunto de nome de metodo e quantidade de argumentos
	static double precoComDesconto(double precoInserido, double descontoInserido) {
		return precoInserido * descontoInserido;
		
	}
}