package ATIVIDADES.ORETORNO.ATIVIDADE03;
import java.util.ArrayList;

public class ContaBancariaImpl implements ContaBancariaService{
	
	ArrayList <ContaBancaria> listContaBancaria = new ArrayList<ContaBancaria>();

	@Override
	public void cadastrarConta(int opcaoConta, String titular, double saldo){
		switch(opcaoConta){
		case 1:
			listContaBancaria.add(new ContaCorrente(titular,saldo));
			break;
		case 2:
			listContaBancaria.add(new ContaPoupanca(titular,saldo));
			break;
		}
	}

	@Override
	public void sacar(int idConta, double valorSaque) throws SaldoInsuficienteException,ValorInvalidoException{
		ContaBancaria conta = listContaBancaria.get(idConta);
		conta.sacar(valorSaque);
	}

	@Override
	public void depositar(int idConta, double valorDeposito)throws ValorInvalidoException{
		ContaBancaria conta = listContaBancaria.get(idConta);
		conta.depositar(valorDeposito);
	}

	@Override
	public void renderJuros(int idConta){
		ContaPoupanca conta =(ContaPoupanca)listContaBancaria.get(idConta);
		conta.renderJuros();
	}
	
	@Override
	public void listarConta(){
		for(ContaBancaria conta : listContaBancaria){
			int posicaoLista = listContaBancaria.indexOf(conta);
			conta.mostrarInformacoes(posicaoLista);
		}
	}
	
}
