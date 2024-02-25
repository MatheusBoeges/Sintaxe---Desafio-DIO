package ContaBanco;

public class Conta {
	
	int numero;
	String agencia;
	String nomeCliente;
	double saldo;
	
	//Construtores com parametros e seus tipos
	
	public void numero(int numero) {
		this.numero = numero;
	}
	
	public void agencia(String agencia) {
		this.agencia = agencia;
	}
	
	public void nomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public void saldo(double saldo) {
		this.saldo = saldo;
	}
	
}
