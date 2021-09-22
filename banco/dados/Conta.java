package banco.dados;

public class Conta {
	//Atributos
	//Conta tem um objeto da classe cliente
	//Isso é composição
	private Cliente titular;
	private int conta;
	private int agencia;
	private double saldo;
	private double limite;
	//um atributo para armazenar quantas contas o banco tem
	//cada vez que uma conta é criada eu aumento esse atributo
	private static int numeroContas;
	
	//Construtor
	public Conta(Cliente titular, int conta, int agencia, double saldo, double limite){
		this.titular = titular;
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.limite = limite;
		numeroContas++;
	}
	
	//Metodos
	protected void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
			System.out.println("Deposito - Operação realizada com sucesso!");
		}
		else {
			System.out.println("Deposito - Valor não permitido para deposito!");
		}

	}
	
	protected void sacar(double valor) {
		if(valor > 0) {
			if (valor <= saldo + limite) {
				saldo -= valor;
				System.out.println("Saque - Operação realizada com sucesso!");
			}
			else {
				System.out.println("Saque - Saldo insuficiente para saque!");
			}
		}
		else {
			System.out.println("Saque - Valor nao permitido para saque!");			
		}
		
	}

	//Metodos getters
	public double getSaldo() {
		//Lógica do negócio do banco
		//Enganar que tu tem saldo quando não tem
		return saldo+limite;
		
	}
	
	public static int getNumeroContas() {
		return numeroContas;
	}
	
	//Metodos setters
	//Nao faz sentido para meu negocio do sistemade um banco
	//As outras partes do programa nao devem setar o saldo
	/*public void setSaldo(double valor) {
		saldo = valor;
		
	}*/
	
}
