package banco;

public class Sistema {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("José", "Silva", 12345678999L);
		
		Conta conta1 = new Conta(cliente1, 1, 1, 0, 1000);

		
		//Metodos de interface
		conta1.depositar(200);
		conta1.sacar(100);
		
		
	
		System.out.println("R$ "+conta1.getSaldo());
		System.out.println(cliente1.getNome() + cliente1.getSobrenome());
		
	}

}
