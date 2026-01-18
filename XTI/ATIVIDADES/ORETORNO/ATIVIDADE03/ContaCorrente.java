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
	
	public void transferir(ContaBancaria contaDestino, double valor) throws SaldoInsuficienteException, ValorInvalidoException{
		if(this.getSaldo() < valor){
			throw new SaldoInsuficienteException("Seu saldo é insuficiente para completar essa operação.");
		}else{
			this.setSaldo(getSaldo() - valor);
			contaDestino.depositar(valor);
		}
		
	}

	
}
