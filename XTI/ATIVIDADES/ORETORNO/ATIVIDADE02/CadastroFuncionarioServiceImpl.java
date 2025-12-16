package ATIVIDADES.ORETORNO.ATIVIDADE02;

public class CadastroFuncionarioServiceImpl implements CadastroFuncionarioService{

	@Override
	public Funcionario cadastrarNovoFuncionario(String nome, double salarioBase)throws SalarioInvalidoException {
		return new Funcionario(nome,salarioBase);
	}

	@Override
	public Funcionario cadastrarNovoGerente(String nome, double salarioBase, double bonus)throws SalarioInvalidoException{
		return new Gerente(nome,salarioBase,bonus);
	}

	@Override
	public Funcionario cadastrarNovoEstagiario(String nome, double salarioBase) throws SalarioInvalidoException {
		return new Estagiario(nome, salarioBase);
	}
}
