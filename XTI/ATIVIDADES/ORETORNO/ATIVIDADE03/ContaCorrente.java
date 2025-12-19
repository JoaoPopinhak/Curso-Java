package ATIVIDADES.ORETORNO.ATIVIDADE03;

public class ContaCorrente extends ContaBancaria{
	
	public ContaCorrente(String titular, double saldo){
		super(titular,saldo);
	}
	
	@Override
	public void sacar(double valorSaque)throws SaldoInsuficienteException,ValorInvalidoException{
		double valorComTaxa = valorSaque + 2.50;
		super.sacar(valorComTaxa);
	}

	
}
