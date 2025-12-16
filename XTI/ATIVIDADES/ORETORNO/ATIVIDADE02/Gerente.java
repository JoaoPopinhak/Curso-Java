package ATIVIDADES.ORETORNO.ATIVIDADE02;

public class Gerente extends Funcionario{
	
	private double bonus;
	
	public Gerente(String nome, double salarioBase, double bonus)throws SalarioInvalidoException{
		super(nome,salarioBase);
		this.bonus = bonus;
	}
	
	@Override
	public double calcularSalario(){
		bonus = getSalarioBase() * (bonus /100);
		return getSalarioBase() + bonus;
	}
}
