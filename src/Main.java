
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton, 200);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		try {
			cc.transferir(100, poupanca);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
