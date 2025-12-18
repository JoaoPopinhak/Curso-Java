package ATIVIDADES.ORETORNO.ATIVIDADE03;

public interface ContaBancariaService{
	
	public void cadastrarConta(int opcao, String titular, double saldo);
	public void sacar(int idConta, double valorSaque);
	public void depositar(int idConta, double valorDeposito);
	public void renderJuros(ContaPoupanca conta);
	public void listarConta();
}
