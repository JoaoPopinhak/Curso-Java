package ATIVIDADES.ORETORNO.ATIVIDADE02;

public class Funcionario {
	
	private String nome;
	private double salarioBase;
	
	public Funcionario(String nome, double salarioBase)throws SalarioInvalidoException{
		if(salarioBase <= 0){
			throw new SalarioInvalidoException("Valor do salário base inválido. Tente novamente!");
		}
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getSalarioBase(){
		return salarioBase;
	}
	
	public void setSalarioBase(double salarioBase){
		this.salarioBase = salarioBase;
	}
	
	
	public double calcularSalario(){
		return salarioBase;
	}

}
