package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class Caminhao extends Veiculo{
	private double capacidadeCarga;

	public Caminhao(String marca, String modelo, int ano, double valorDiaria, double capacidadeCarga){
		super(marca,modelo,ano,valorDiaria);
		this.capacidadeCarga = capacidadeCarga;
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	
	@Override
	void exibirInformacoes(){
		System.out.println(
				"Marca: "+getMarca()+"\n"+
		        "Modelo: "+getModelo()+"\n"+
				"Ano: "+getAno()+"\n"+
		        "Valor Diaria: "+getValorDiaria()+"\n"+
				"Capacidade de carga: "+getCapacidadeCarga()+" Toneladas"+"\n");
	}
}
