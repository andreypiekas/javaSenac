package classes;

public class Produto {
	String nome;
	double preco;
	double desconto;
	
	
	//Construtor Padrao - nao tem retorno
	/*
	Produto(){
		
	}
	*/
	
	//Construtor definido pelo dev
	Produto(String nomeInserido, double precoInserido, double descontoInserido){
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
	double precoComDesconto() {
		return preco * desconto;
	}

	double precoComDesconto(double precoInserido, double descontoInserido) {
		return precoInserido * descontoInserido;
		
	}
}
