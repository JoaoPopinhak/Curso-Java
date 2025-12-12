package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class Carro extends Veiculo{
	
	private int quantidadePortas;
	private Boolean arCondicionado;
	
	public Carro(String marca, String modelo, int ano, double valorDiaria, int quantidadePortas, Boolean arCondicionado){
		super(marca,modelo,ano,valorDiaria);
		this.quantidadePortas = quantidadePortas;
		this.arCondicionado = arCondicionado;
	}
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public Boolean istArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(Boolean arCondicionado2) {
		this.arCondicionado = arCondicionado2;
	}
	
	@Override
	void exibirInformacoes(){
		System.out.println(
				"Marca: "+getMarca()+"\n"+
		        "Modelo: "+getModelo()+"\n"+
			    "Ano: "+getAno()+"\n"+
		        "Valor Diaria: "+getValorDiaria()+"\n"+
			    "Quantiade de portas: "+getQuantidadePortas()+"\n"+
		        "Ar condicionado: "+istArCondicionado()+"\n");
	}	
}
