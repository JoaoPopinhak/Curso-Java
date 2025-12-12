package ATIVIDADES.ORETORNO.ATIVIDADE01;

public interface VeiculoService {
	
	
	//Carro(marca,modelo,ano,valorDiaria,quantidadePortas,arCondicionado);
	
	void cadastrarCarro(String marca, String modelo, int ano, double valorDiaria, int quantidadePortas, Boolean arCondicionado);
	void cadastrarMoto(String marca, String modelo, int ano, double valorDiaria, int cilindradas);
	void cadastrarCaminhao(String marca, String modelo, int ano, double valorDiaria, double capacidadeCarga);
	void listarTodos();
	void listarAcima();
}
