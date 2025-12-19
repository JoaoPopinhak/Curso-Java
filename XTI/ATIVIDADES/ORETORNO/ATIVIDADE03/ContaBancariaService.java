package ATIVIDADES.ORETORNO.ATIVIDADE03;

public interface ContaBancariaService{
	
	public void cadastrarConta(int opcao, String titular, double saldo);
	public void sacar(int idConta, double valorSaque) throws SaldoInsuficienteException,ValorInvalidoException;
	public void depositar(int idConta, double valorDeposito)throws ValorInvalidoException;
	public void renderJuros(int idConta);
	public void listarConta();
}
