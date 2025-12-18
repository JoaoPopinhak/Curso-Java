package ATIVIDADES.ORETORNO.ATIVIDADE03;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancariaService service = new ContaBancariaImpl();
		ContaBancariaUI ui = new ContaBancariaUI(service);
		
		ui.contaBancaria();
		

	}

}
