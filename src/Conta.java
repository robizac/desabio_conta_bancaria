
public abstract class Conta implements IConta {

	protected int agencia;
	protected int conta;
	protected double saldo;

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta =SEQUENCIAL++;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato Conta Corrente");
		
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


}
