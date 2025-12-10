package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class Carro extends Veiculos{
	
	private int quantidadePortas;
	private String arCondicionado;
	
	public Carro(String marca, String modelo, int ano, double valorDiaria, int quantidadePortas, String arCondicionado){
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setAno(ano);
		this.setValorDiaria(valorDiaria);
		this.setQuantidadePortas(quantidadePortas);
		this.setArCondicionado(arCondicionado);
	}
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public String getArCondicionado() {
		return arCondicionado;
	}
	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}
	
	
	void exibirInformacoes(){
		System.out.println(getMarca()+"\n"+getModelo()+"\n"+getAno()+"\n"+getValorDiaria()+"\n"+getQuantidadePortas()+"\n"+getArCondicionado());
	}
	
}
