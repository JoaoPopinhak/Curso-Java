package ATIVIDADES.ORETORNO.ATIVIDADE02;

public interface CadastroFuncionarioService {
	Funcionario cadastrarNovoFuncionario(String nome, double salarioBase) throws SalarioInvalidoException;
	
	Funcionario cadastrarNovoGerente(String nome, double salarioBase, double bonus)throws SalarioInvalidoException;
	
	Funcionario cadastrarNovoEstagiario(String nome, double salarioBase)throws SalarioInvalidoException;
}
