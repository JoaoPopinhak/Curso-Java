package ATIVIDADES.ORETORNO.ATIVIDADE03;

import java.util.Scanner;

public class ContaBancariaUI {
	private Scanner scan = new Scanner(System.in);
	private ContaBancariaService service;
	
	public ContaBancariaUI(ContaBancariaService service){
		this.service = service;
	}
	
	public void contaBancaria(){
		do {
			int opcaoMenuPrincipal = menuPrincipal();
			
			switch(opcaoMenuPrincipal){
			case 1:
				menuCadastroConta();
				break;
			case 2: 
				depositarValor();
				break;
			case 3:
				sacarValor();
				break;
			case 4:
				service.listarConta();
				break;
			}
			
		}while(true);
	}
	
	private Integer menuPrincipal(){
			System.out.println("===== Cadastro De Contas =====\n"+
		                       "Digite uma das opçõs abaixo: \n"+
					           "1 Para cadastrar uma nova conta\n"+
		                       "2 Para depositar valor\n"+
					           "3 Para sacar valor\n"+
		                       "4 Para listar contas\n");
			
			int opcaoMenuPrincipal = scan.nextInt();
			scan.nextLine();
			
			return opcaoMenuPrincipal;
	}
	
	private void menuCadastroConta(){
		System.out.println("Escolha uma opção para cadastrar\n"+
	                       "1 para cadastrar uma Conta Corrente\n"+
				           "2 para cadastrar uma Conta Poupança\n");
		
		int opcaoCadastroConta = scan.nextInt();
		scan.nextLine();
		
		cadastrandoConta(opcaoCadastroConta);
	}
	
	private void cadastrandoConta(int opcaoConta){
		System.out.println("Digite o nome do títular da conta: \n");
		String titular = scan.nextLine();
		
		System.out.println("Digite o saldo da conta: \n");
		double saldo = scan.nextDouble();
		
		service.cadastrarConta(opcaoConta, titular, saldo);
		
		System.out.println("Sua conta foi cadastrada!");
	}
	
	private void sacarValor(){
		System.out.println("Digite o ID da conta que deseja sacar: \n");
		service.listarConta();
		int idConta = scan.nextInt();
		
		System.out.println("Digite o valor do saque: \n");
		double valorSaque = scan.nextDouble();
		
		service.sacar(idConta, valorSaque);
	}
	
	private void depositarValor(){
		System.out.println("Digite o ID da conta que deseja depositar: \n");
		service.listarConta();
		int idConta = scan.nextInt();
		
		System.out.println("Digite o valor do deposito: \n");
		double valorDeposito = scan.nextDouble();
		
		service.depositar(idConta, valorDeposito);
	}
	

	

}
