package ATIVIDADES.ORETORNO.ATIVIDADE01;

/*
 * Atividade 1 — Sistema de Cadastro de Veículos
 * Conceitos principais: Herança, modificadores de acesso, encapsulamento
 * Descrição:Implemente uma hierarquia de classes para representar veículos em uma locadora:
 * 
 * Classe base: Veiculo
 * Atributos: marca, modelo, ano, valorDiaria
 * Métodos: calcularDiaria(), exibirInformacoes()
 * 
 * Subclasses: 
 * Carro (adiciona numeroPortas, arCondicionado)
 * Moto (adiciona cilindradas)
 * Caminhao (adiciona capacidadeCarga)
 * Use modificadores de acesso adequados (private, protected, public) e garanta encapsulamento.
 * 
 * Tarefa extra:
 * Crie um método que recebe uma lista de veículos e imprime apenas os que têm valor de diária acima de R$ 200,00.
 */

public class Veiculo {
	
	private String marca;
	private String modelo;
	private int ano;
	private double valorDiaria;
	
	public Veiculo(String marca, String modelo, int ano, double valorDiaria){
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorDiaria = valorDiaria;
	}
	
	public String getMarca(){
		return marca;
	}
	public void setMarca(String marcaNova){
		this.marca = marcaNova;
	}
	public String getModelo(){
		return modelo;
	}
	public void setModelo(String modelo){
		this.modelo = modelo;
	}
	public int getAno(){
		return ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}
	public double getValorDiaria(){
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria){
		this.valorDiaria = valorDiaria;
	}
	
	/**
	 * @param diasLocados
	 * @return O valor total da locação (valorDiaria x diasLocados)
	 */
	double calcularDiaria(int diasLocados){
		return valorDiaria * diasLocados;
	}
	
	/**
	 * Exibe as informações do veiculo
	 */
	void exibirInformacoes(){
		System.out.println("Marca: "+getMarca()+"\n"
	                      +"Modelo: "+getModelo()+"\n"
				          +"Ano: "+getAno()+"\n"+
	                       "Valor Diaria: "+getValorDiaria()+"\n");
	}

}
