package JDBC.AULA112JDBCCRUDCREATREADUPDATEDELETE;

public class Conta {
	int numero;
	String nomeCliente;
	double saldoConta;
	
	public Conta(int numero, String nomeCliente, double saldoConta){
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldoConta = saldoConta;
	}
	
	@Override
	public String toString() {
		return numero + "," + nomeCliente + "," + saldoConta;
	}
	
	
	
	

}
