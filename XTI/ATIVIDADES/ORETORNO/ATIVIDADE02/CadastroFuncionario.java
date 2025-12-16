package ATIVIDADES.ORETORNO.ATIVIDADE02;

public class CadastroFuncionario {

	public static void main(String[] args)throws SalarioInvalidoException{
		CadastroFuncionarioService service = new CadastroFuncionarioServiceImpl();
		CadastroFuncionarioUI interfaceUI = new CadastroFuncionarioUI(service);
		interfaceUI.cadastrarFuncionario();
	}
}
