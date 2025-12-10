package ATIVIDADES.ORETORNO.ATIVIDADE01;
import java.util.ArrayList;

public class ListaVeiculos {
	
		ArrayList<Veiculos> ListaVeiculos = new ArrayList<Veiculos>();

		void adicionarLista(Veiculos veiculo){
			ListaVeiculos.add(veiculo);	
		}
			
		
		void mostrarLista(){
			for(Veiculos veiculos : ListaVeiculos){
				veiculos.exibirInformacoes();
				System.out.println("");
			}
		}
		
		void mostrarListaDiariaAcima(){
			for(Veiculos veiculos : ListaVeiculos){
				if(veiculos.getValorDiaria() > 200){
					veiculos.exibirInformacoes();
					System.out.println("");
				}
			}
			
		}
			

}

