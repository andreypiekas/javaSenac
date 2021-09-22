package banco;

import banco.funcionarios.*;



public class Sistema {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("José", "Silva", 12345678999L);
		Cliente cliente2 = new Cliente("José", "Silva", 12345678999L);
		Cliente cliente3 = new Cliente("José", "Silva", 12345678999L);
		Conta conta1 = new Conta(cliente1, 1, 1, 0, 1000);
		Conta conta2 = new Conta(cliente2, 0, 0, 0, 0);
		Conta conta3 = new Conta(cliente3, 0, 0, 0, 0);
		
		
		//Como ver quantas contas foram criadas
		//Static fez com que o gerente  --------- terminar o comentario
		System.out.println("Hoje temos cadastrado "+ Conta.getNumeroContas() + " contas em nosso sistema");
		
		//Metodos de interface
		conta1.depositar(200);
		conta1.sacar(100);
		
		System.out.println("R$ "+conta1.getSaldo());
		System.out.println(cliente1.getNomeESobrenome());
		
		Funcionario funcionario1 = new Funcionario("Maria", "Rocha", 12345678998L, 1000);
		System.out.printf("Salario de %s é de R$ %.2f \n", funcionario1.getNomeESobrenome(), funcionario1.getSalario());
		//Um gerente é um funcionario, por isso acessa os metodos de funcionario
		Gerente gerente1 = new Gerente("Fabio", "Silva", 12345678997L, 10000, 15, "fabio123");
		System.out.printf("Salario de %s é de R$ %.2f \n", gerente1.getNomeESobrenome(), gerente1.getSalario());
		
		System.out.println(gerente1.valida("senha"));
		System.out.println(gerente1.valida("fabio123"));
		
		
	
	}

}
