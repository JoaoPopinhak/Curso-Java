package ATIVIDADES.ORETORNO.ATIVIDADE01;

public class CadastroVeiculosExe {
	public static void main(String[] args){
		
		VeiculoService veiculoService = new ListaVeiculos();
		CadastroVeiculoConsole interfaceConsole = new CadastroVeiculoConsole(veiculoService);	
		int opcao;
		do{
			opcao = interfaceConsole.mostrarMenuPrincipal();
			
			switch(opcao){
			case 1:
				interfaceConsole.cadastrarCarro();
				break;
			case 2:
				interfaceConsole.cadastrarMoto();
				break;
			case 3:
				interfaceConsole.cadastrarCaminhao();
				break;
			case 4:
				veiculoService.listarTodos();
				break;
			case 5:
				interfaceConsole.mostrarMenuOrcamento();
			}
		}while(opcao!=6);
		veiculoService.listarAcima();
	}
}
