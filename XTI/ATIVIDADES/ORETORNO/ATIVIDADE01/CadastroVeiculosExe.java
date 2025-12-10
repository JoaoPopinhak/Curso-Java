package ATIVIDADES.ORETORNO.ATIVIDADE01;

import java.util.Scanner;

public class CadastroVeiculosExe {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ListaVeiculos listaVeiculos = new ListaVeiculos();
		
		System.out.println("Para cadastrar um carro digite 1\nPara cadastrar uma moto digite 2\nPara cadastrar um caminhão digite 3\nPara sair digite 4");
		int opcao = scan.nextInt();
		
		
		while(opcao != 4){
			
			switch(opcao){
			
			case 1:
				System.out.println("Digite a marca do veículo");
				String marca = scan.next();
				System.out.println("Digite o modelo do veículo");
				String modelo = scan.next();
				System.out.println("Digite o ano do veículo");
				int ano = scan.nextInt();
				System.out.println("Digite o valor da diária do veículo");
				double valorDiaria = scan.nextDouble();
				System.out.println("Digite a quantidade de portas do veículo");
				int qtdPortas = scan.nextInt();
				System.out.println("O veículo possui ar condicionado? SIM ou NÃO");
				String arCondicionado = scan.next();
				
				Carro novoCarro = new Carro(marca,modelo,ano,valorDiaria,qtdPortas,arCondicionado);
				
				novoCarro.getModelo();
				
				listaVeiculos.adicionarLista(novoCarro);
				
				break;
			
			case 2:
				System.out.println("Digite a marca da moto");
				marca = scan.next();
				System.out.println("Digite o modelo da moto");
				modelo = scan.next();
				System.out.println("Digite o ano da moto");
				ano = scan.nextInt();
				System.out.println("Digite o valor da diária da moto");
				valorDiaria = scan.nextDouble();
				System.out.println("Digite o valor das cilindradas da moto");
				int cilindradas = scan.nextInt();
				
				Moto novaMoto = new Moto(marca, modelo, ano, valorDiaria, cilindradas);
				
				listaVeiculos.adicionarLista(novaMoto);
				
				break;	
				
			case 3:
				System.out.println("Digite a marca do caminhão");
				marca = scan.next();
				System.out.println("Digite o modelo do caminhão");
				modelo = scan.next();
				System.out.println("Digite o ano do caminhão");
				ano = scan.nextInt();
				System.out.println("Digite o valor da diária do caminhão");
				valorDiaria = scan.nextDouble();
				System.out.println("Digite o valor da capacidade de carga do caminhão");
				double capacidadeCarga = scan.nextDouble();
				
				Caminhao novoCaminhao = new Caminhao(marca,modelo,ano,valorDiaria,capacidadeCarga);
				
				listaVeiculos.adicionarLista(novoCaminhao);
				
				
				break;
			}
			
			
			System.out.println("Para cadastrar um carro digite 1\nPara cadastrar uma moto digite 2\nPara cadastrar um caminhão digite 3\nPara sair digite 4");
			opcao = scan.nextInt();
		}
		
		
		listaVeiculos.mostrarListaDiariaAcima();
		
		
		scan.close();
	}
}
