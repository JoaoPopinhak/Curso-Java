package ATIVIDADES.ORETORNO.ATIVIDADE01;
import java.util.ArrayList;

public class ListaVeiculos implements VeiculoService{
	
		private ArrayList<Veiculo> ListaVeiculos = new ArrayList<Veiculo>();

		@Override
		public void cadastrarCarro(String marca, String modelo, int ano, double valorDiaria, int quantidadePortas, Boolean arCondicionado){
			ListaVeiculos.add(new Carro(marca,modelo,ano,valorDiaria,quantidadePortas,arCondicionado));
		}

		@Override
		public void cadastrarMoto(String marca, String modelo, int ano, double valorDiaria, int cilindradas){
			ListaVeiculos.add(new Moto(marca,modelo,ano,valorDiaria,cilindradas));
		}

		@Override
		public void cadastrarCaminhao(String marca, String modelo, int ano, double valorDiaria, double capacidadeCarga){
			ListaVeiculos.add(new Caminhao(marca,modelo,ano,valorDiaria,capacidadeCarga));
		}

		@Override
		public void listarTodos(){
			for(Veiculo veiculo : ListaVeiculos){
				veiculo.exibirInformacoes();
			}	
		}

		@Override
		public void listarAcima(){
			for(Veiculo veiculo : ListaVeiculos){
				if(veiculo.getValorDiaria()>200){
					veiculo.exibirInformacoes();
				}
			}
			
		}
}


