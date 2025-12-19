package ATIVIDADES.ORETORNO.ATIVIDADE03;

public class ContaPoupanca extends ContaBancaria{
	
	public ContaPoupanca(String titular,double saldo){
		super(titular, saldo);
	}
	
	public void renderJuros(){
		double saldo = getSaldo();
		double percentRenda = 0.5;
		double valorRenda = saldo * (percentRenda / 100);
		saldo += valorRenda;
	}
}
