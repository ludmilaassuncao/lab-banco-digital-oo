
public class ContaCorrente extends Conta {
	private double limite;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public ContaCorrente(Cliente cliente, double limite) {
		super(cliente);
		this.setLimite(limite);
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws SaldoInsuficienteException {
		super.transferir(valor, contaDestino);
	}

	public void setLimite(double limite) {
		if (limite > 0) {
			this.limite = limite;
		} else {
			System.out.println("O Limite deve ser maior do que zero");
		}
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Limite: %.2f", this.limite));
		System.out.println(String.format("Saldo com Limite: %.2f", (this.saldo + this.limite)));
	}
	
}
