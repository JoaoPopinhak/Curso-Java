package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class Moto extends Veiculo{
	
	private int cilindradas;

	public Moto(String marca, String modelo, int ano, double valorDiaria, int cilindradas){
		super(marca,modelo,ano,valorDiaria);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	void exibirInformacoes(){
		System.out.println(
				"Marca: "+getMarca()+"\n"+
		        "Modelo: "+getModelo()+"\n"+
				"Ano: "+getAno()+"\n"+
		        "Valor Diaria: "+getValorDiaria()+"\n"+
				"Cilindradas: "+getCilindradas()+"\n");
	}
}
