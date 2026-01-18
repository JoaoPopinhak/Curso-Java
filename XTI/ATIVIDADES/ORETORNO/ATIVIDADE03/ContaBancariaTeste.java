package ATIVIDADES.ORETORNO.ATIVIDADE03;

import java.io.IOException;

public class ContaBancariaTeste {

	public static void main(String[] args)throws SaldoInsuficienteException,ValorInvalidoException, IOException{
		ContaBancariaService service = new ContaBancariaImpl();
		ContaBancariaUI ui = new ContaBancariaUI(service);
		
		ui.contaBancaria();
	}
}
