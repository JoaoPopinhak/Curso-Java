package ATIVIDADES.ORETORNO.ATIVIDADE03;

public class ContaCorrente extends ContaBancaria{
	
	public ContaCorrente(String titular, double saldo){
		super(titular,saldo);
	}
	
	
	@Override
	public void sacar(double valorSaque){
		if(valorSaque <= 0){
			//lança exception
		}else if(valorSaque > saldo){
			//lanca excpetion
		}
		saldo -= valorSaque;
		saldo -= 2.50; 
	}
}
