package ATIVIDADES.ORETORNO.ATIVIDADE02;

public class Estagiario extends Funcionario{
	
	public Estagiario(String nome, double salarioBase)throws SalarioInvalidoException{
		super(nome,salarioBase);
	}
	@Override
	public double calcularSalario(){
		return getSalarioBase() / 2;
	}
}
