package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class Moto extends Veiculos{
	
	private int cilindradas;

	public Moto(String marca, String modelo, int ano, double valorDiaria, int Cilindradas){
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setValorDiaria(valorDiaria);
		this.setCilindradas(Cilindradas);
	}
	
	public int getCilindradas() {
		return cilindradas;
	}
	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	void exibirInformacoes(){
		System.out.println(getMarca()+"\n"+getModelo()+"\n"+getAno()+"\n"+getValorDiaria()+"\n"+getCilindradas());
	}

}
