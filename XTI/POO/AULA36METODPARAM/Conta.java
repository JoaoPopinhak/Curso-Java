package POO.AULA36METODPARAM;

public class Conta implements java.io.Serializable{
	String cliente;
	double saldo;
	
	public Conta(String cliente, double saldo){
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	public void exibeSaldo (){
		System.out.println(cliente + " seu saldo é " + saldo);
	}
	
	public void saca(double valor){
		
		saldo -= valor;
	}
	
	public void deposito(double valor){
		saldo += valor;
	}
	
	public void transfere(Conta destino, double valor) {
		this.saca(valor);
		destino.deposito(valor);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
