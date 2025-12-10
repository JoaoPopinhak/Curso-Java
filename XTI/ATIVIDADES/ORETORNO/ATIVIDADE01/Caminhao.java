package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class Caminhao extends Veiculos{
	private double capacidadeCarga;

	public Caminhao(String marca, String modelo, int ano, double valorDiaria, double capacidadeCarga){
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setValorDiaria(valorDiaria);
		this.setCapacidadeCarga(capacidadeCarga);
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	void exibirInformacoes(){
		System.out.println(getMarca()+"\n"+getModelo()+"\n"+getAno()+"\n"+getValorDiaria()+"\n"+getCapacidadeCarga());
	}

}
