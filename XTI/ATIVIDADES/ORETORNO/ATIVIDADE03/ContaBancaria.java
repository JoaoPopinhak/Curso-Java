package ATIVIDADES.ORETORNO.ATIVIDADE03;

//arrumar o if do sacar APÓS O SAQUE O SALDO FICA < 0 REVERTE AÇÃO
//Criar exceções 


public class ContaBancaria {
	
	protected String titular;
	protected double saldo;
	
	
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
	
	public void depositar(double valorDeposito){
		if(valorDeposito <= 0){
			//lança exception
		}
		saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque){
		if(valorSaque <= 0){
			//lança exception
		}else if(valorSaque > saldo){
			//lanca exception
		}
		saldo -= valorSaque;
	}
	
	public void mostrarInformacoes(int posicaoLista){
		System.out.println("ID: " + posicaoLista + "\n" 
				          +"Nome Titular: " + getTitular()+"\n"
				          +"Saldo Disponível: " + getSaldo()+"\n");
	}
}
