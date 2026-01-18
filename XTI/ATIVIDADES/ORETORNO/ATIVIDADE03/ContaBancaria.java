package ATIVIDADES.ORETORNO.ATIVIDADE03;

public class ContaBancaria {
	
	private String titular;
	private double saldo;
	
	
	public ContaBancaria(String titular, double saldo){
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular(){
		return titular;
	}
	
	public void setTitular(String titular){
		this.titular = titular;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setSaldo(double novoSaldo){
		this.saldo = novoSaldo;
	}
	
	public void depositar(double valorDeposito)throws ValorInvalidoException{
		if(valorDeposito <= 0){
			throw new ValorInvalidoException("Valor de depósito inválido");
		}
		saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque)throws SaldoInsuficienteException,ValorInvalidoException{
		saldo -= valorSaque;
		if(saldo < 0){	
			saldo += valorSaque;
			throw new SaldoInsuficienteException("Seu saldo é insuficiente para completar essa operação.");
		}else if(valorSaque <= 0){
			throw new ValorInvalidoException("Valor de saque inválido");
		}
	}
	
	public void transferir(ContaBancaria contaDestino, double valor) throws SaldoInsuficienteException, ValorInvalidoException{
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	public void mostrarInformacoes(int posicaoLista){
		System.out.println("ID: " + posicaoLista + "\n" 
				          +"Nome Titular: " + getTitular()+"\n"
				          +"Saldo Disponível: " + getSaldo()+" R$\n");
	}
	
	
}
