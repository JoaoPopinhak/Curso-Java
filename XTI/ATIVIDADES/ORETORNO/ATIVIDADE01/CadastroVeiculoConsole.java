package ATIVIDADES.ORETORNO.ATIVIDADE01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroVeiculoConsole{
	
	private Scanner scan = new Scanner(System.in);
	private VeiculoService veiculoService;
	
	public CadastroVeiculoConsole(VeiculoService veiculoService){
		this.veiculoService = veiculoService;
	}
	
	void cadastrarCarro(){
		while(true){
			try{
				System.out.println("Digite a marca do veículo: ");
				String marca = scan.nextLine();		
				System.out.println("Digite o modelo do veículo: ");
				String modelo = scan.nextLine();
				System.out.println("Digite o ano do veículo: ");
				int ano = scan.nextInt();
				System.out.println("Digite o valor da diária do veículo: ");
				double valorDiaria = scan.nextDouble();
				System.out.println("Digite o número de portas do veículo: ");
				int quantidadePortas = scan.nextInt();
				System.out.println("Ar condicionado (true/false): ");
				boolean arCondicionado = scan.nextBoolean();
				
				veiculoService.cadastrarCarro(marca,modelo,ano,valorDiaria,quantidadePortas,arCondicionado);
				
				System.out.println("Veículo cadastrado com sucesso!");
				
				break;
			}catch(InputMismatchException e1){
				System.err.println("Digito inválido. Tente novamente!");
				scan.nextLine();
			}
		}
	}
	
	void cadastrarMoto(){	
		while(true){
			try{
				System.out.println("Digite a marca da moto: ");
				String marca = scan.nextLine();
				System.out.println("Digite o modelo da moto: ");
				String modelo = scan.nextLine();
				System.out.println("Digite o ano da moto: ");
				int ano = scan.nextInt();
				System.out.println("Digite o valor da diária da moto: ");
				double valorDiaria = scan.nextDouble();
				System.out.println("Digite as cilindradas da moto: ");
				int cilindradas = scan.nextInt();

				veiculoService.cadastrarMoto(marca, modelo, ano, valorDiaria, cilindradas);
				
				System.out.println("Veículo cadastrado com sucesso!");
				
				break;
			}catch(InputMismatchException e1){
				System.err.println("Digito inválido. Tente novamente!");
				scan.nextLine();
			}
		}
	}
	
	void cadastrarCaminhao(){
		while(true){
			try{
				System.out.println("Digite a marca do caminhão: ");
				String marca = scan.nextLine();
				System.out.println("Digite o modelo do caminhão: ");
				String modelo = scan.nextLine();
				System.out.println("Digite o ano do caminhão: ");
				int ano = scan.nextInt();
				System.out.println("Digite o valor da diária do caminhão: ");
				double valorDiaria = scan.nextDouble();
				System.out.println("Digite a capacidade de carga do caminhão: ");
				int capacidadeCarga = scan.nextInt();
				
				veiculoService.cadastrarCaminhao(marca, modelo, ano, valorDiaria, capacidadeCarga);
				
				break;
			}catch(InputMismatchException e1){
				System.err.println("Digito inválido. Tente novamente!");
				scan.nextLine();
			}
		}
	}

	int mostrarMenuPrincipal(){
		while(true){
			try {
				System.out.println("===== CADASTRO DE VEÍCULOS =====");
				System.out.println("Para cadastrar um carro digite 1: \n"
								 + "Para cadastrar uma moto digite 2: \n"
								 + "Para cadastrar um caminhão digite 3: \n"
								 + "Para mostrar carros cadastrados digite 4: \n"
								 + "Para realizar um orçamento do alugel do carro digite 5: \n"
								 + "Para encerrar digite 5: ");
				int opcao = scan.nextInt();
				scan.nextLine();
				return opcao;
			}
			catch(InputMismatchException e1){
				System.err.println("Digito inválido. Tente novamente!");
				scan.nextLine();
			}
		}
	}
}
