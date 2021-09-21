package banco;

public class Conta {
	//Atributos
	private Cliente titular;
	private int conta;
	private int agencia;
	private double saldo;
	private double limite;
	
	//Construtor
	public Conta(Cliente titular, int conta, int agencia, double saldo, double limite){
		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	
	//Metodos
	void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Operação realizada com sucesso!");
		}
		else {
			System.out.println("Valor não permitido para deposito!");
			
		}

	}
	
	void sacar(double valor) {
		if(valor > 0) {
			if (valor <= saldo + limite) {
				saldo -= valor;
				System.out.println("Operação realizada com sucesso!");
			}
			else {
				System.out.println("Saldo insuficiente para saque!");
			}
		}
		else {
			System.out.println("Valor nao permitido para saque!");
			
			
		}
		
		
	}


	
	//Metodos getters
	public double getSaldo() {
		//Lógica do negócio do banco
		//Enganar que tu tem saldo quando não tem
		return saldo+limite;
		
	}
	
	//Metodos setters
	//Nao faz sentido para meu negocio do sistemade um banco
	//As outras partes do programa nao devem setar o saldo
	/*public void setSaldo(double valor) {
		saldo = valor;
		
	}*/
	
	
	
	
}
