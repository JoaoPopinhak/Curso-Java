package ATIVIDADES.ORETORNO.ATIVIDADE03;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancariaUI {
	private Scanner scan = new Scanner(System.in);
	private ContaBancariaService service;
	
	public ContaBancariaUI(ContaBancariaService service){
		this.service = service;
	}
	
	public void contaBancaria()throws SaldoInsuficienteException,ValorInvalidoException, IOException{
		boolean opcao = true;
		service.lerConta();
		do {
			try {
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
				case 5:
					transferirValor();
					break;
				case 6:
					service.salvarConta();
					opcao = false;
					break;
				default:
					System.err.println("Opção Inválida.");
				}
			}catch(SaldoInsuficienteException e1){
				System.err.println(e1.getMessage());
			}catch(InputMismatchException e2){
				System.err.println("Digíto inválido.");
				scan.next();
			}catch(IndexOutOfBoundsException e3){
				System.err.println("Conta inválida.");
			}catch(ValorInvalidoException e4){
				System.err.println(e4.getMessage());
			}
		}while(opcao == true);
	}
	
	private Integer menuPrincipal(){
			System.out.println("===== Cadastro De Contas =====\n"+
		                       "Digite uma das opçõs abaixo: \n"+
					           "1 Para cadastrar uma nova conta\n"+
		                       "2 Para depositar valor\n"+
					           "3 Para sacar valor\n"+
		                       "4 Para listar contas\n"+
					           "5 Para transferência\n"+
		                       "6 Para encerrar.");
			
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
		
		if(opcaoCadastroConta == 1 || opcaoCadastroConta == 2){
			cadastrandoConta(opcaoCadastroConta);
		}else{
			System.err.println("Opção Inválida.");
		}
		
	}
	
	private void cadastrandoConta(int opcaoConta){
		
		System.out.println("Digite o nome do títular da conta: \n");
		String titular = scan.nextLine();
		
		System.out.println("Digite o saldo da conta: \n");
		double saldo = scan.nextDouble();
		
		service.cadastrarConta(opcaoConta, titular, saldo);
		
		System.out.println("Sua conta foi cadastrada!");
	}
	
	private void sacarValor()throws SaldoInsuficienteException,ValorInvalidoException{
		
				System.out.println("Digite o ID da conta que deseja sacar: \n");
				service.listarConta();
				int idConta = scan.nextInt();
				
				System.out.println("Digite o valor do saque: \n");
				double valorSaque = scan.nextDouble();
				
				service.sacar(idConta, valorSaque);
				
				System.out.println("Saque realizado!");		
	}
	
	private void depositarValor()throws ValorInvalidoException{
		System.out.println("Digite o ID da conta que deseja depositar: \n");
		service.listarConta();
		int idConta = scan.nextInt();
		
		System.out.println("Digite o valor do deposito: \n");
		double valorDeposito = scan.nextDouble();
		
		service.depositar(idConta, valorDeposito);
		
		System.out.println("Depósito realizado!");	
	}
	
	
	private void transferirValor() throws SaldoInsuficienteException, ValorInvalidoException{
		System.out.println("Selecione a conta de origem da transferência: ");
		service.listarConta();
		int contaOrigem = scan.nextInt();
		
		
		System.out.println("Selecione a conta de destino da transferência: ");
		service.listarConta();
		int contaDestino = scan.nextInt();
		
		
		System.out.println("Digite o valor da transferência: ");
		double valorTrans = scan.nextDouble();
		
		service.transferir(contaOrigem, contaDestino, valorTrans);
		
		System.out.println("Transferência realizada.\n");
	}	
}
