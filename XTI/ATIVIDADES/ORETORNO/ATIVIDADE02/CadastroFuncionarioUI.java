package ATIVIDADES.ORETORNO.ATIVIDADE02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroFuncionarioUI{
	private Scanner scan = new Scanner(System.in);
	private CadastroFuncionarioService cadastroFuncionarioService;
	private int opcao;
	
	public CadastroFuncionarioUI(CadastroFuncionarioService service){
		this.cadastroFuncionarioService = service;
	}
	
	void cadastrarFuncionario()throws SalarioInvalidoException, InputMismatchException{
		
		do {
			try {
				System.out.println("===== CADASTROS FUNCIONÁRIOS =====\n");
				System.out.println("Digite 1 para cadastrar Funcionário: \n"
				                  +"Digite 2 para cadastrar Gerente: \n"
						          +"Digite 3 para cadastrar Estagiario: \n"
				                  +"Digite 4 para encerrar o programa.: \n");
				this.opcao = scan.nextInt();
				if(opcao > 4 || opcao < 1){
					throw new OpcaoInexistenteException();
				}
			}
			catch(InputMismatchException | OpcaoInexistenteException e1){
				System.err.println("Opção inválida. Tente novamente!");
			}

			scan.nextLine();
			
			seletor();
		}while(opcao!=4);
		
	}
	
	private void seletor()throws SalarioInvalidoException, InputMismatchException{
		switch(opcao){
		case 1:
			cadastrarNovoFuncionario();
			break;
		case 2:
			cadastrarGerente();
			break;
		case 3:
			cadastrarEstagiario();
			break;
		}	
	}
	
	private void cadastrarNovoFuncionario()throws SalarioInvalidoException, InputMismatchException{
		do {
			try {
				System.out.println("Digite o nome: ");
				String nome = scan.nextLine();
				
				System.out.println("Digite o salário base: ");
				double salarioBase = scan.nextDouble();
				
				Funcionario novoFuncionario = cadastroFuncionarioService.cadastrarNovoFuncionario(nome, salarioBase);
				
				double salario = novoFuncionario.calcularSalario();
				
				System.out.println("O salario total é " + salario +" R$");
				
				break;
				
			}catch(SalarioInvalidoException e1){
				System.err.println(e1.getMessage());
				scan.nextLine();
			}catch(InputMismatchException e2){
				System.err.println("Dígito inválido. Tente novamente!");
				scan.nextLine();
			}
			
		}while(true);
		
	}
	
	private void cadastrarGerente()throws SalarioInvalidoException, InputMismatchException{
		do {
			try {
				System.out.println("Digite o nome: ");
				String nome = scan.nextLine();
				
				System.out.println("Digite o salário base: ");
				double salarioBase = scan.nextDouble();
				
				System.out.println("Digite o bônus: ");
				double bonus = scan.nextDouble();
				
				Funcionario novoFuncionario = cadastroFuncionarioService.cadastrarNovoGerente(nome, salarioBase, bonus);
				
				double salario = novoFuncionario.calcularSalario();
				
				System.out.println("O salario total é " + salario + " R$");
				
				break;
				
			}catch(SalarioInvalidoException e1){
				System.err.println(e1.getMessage());
				scan.nextLine();
				
			}catch(InputMismatchException e1){
				System.err.println("Dígito inválido. Tente novamente!");
				scan.nextLine();
			}
		}while(true);
		
		
	}
	
	private void cadastrarEstagiario()throws SalarioInvalidoException{
		do{
			try {
				System.out.println("Digite o nome: ");
				String nome = scan.nextLine();
				
				System.out.println("Digite o salário base: ");
				double salarioBase = scan.nextDouble();
				
				Funcionario novoFuncionario = cadastroFuncionarioService.cadastrarNovoEstagiario(nome, salarioBase);
				
				double salario = novoFuncionario.calcularSalario();
				
				System.out.println("O salario total é " + salario +" R$");
				
				break;
				
			}catch(SalarioInvalidoException e1){
				System.err.println(e1.getMessage());
				scan.nextLine();
			}catch(InputMismatchException e2){
				System.err.println("Dígito inválido. Tente novamente!");
				scan.nextLine();
			}
		}while(true);
	}
}
