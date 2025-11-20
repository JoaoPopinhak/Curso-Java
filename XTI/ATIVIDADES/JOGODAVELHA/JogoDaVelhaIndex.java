package ATIVIDADES.JOGODAVELHA;

import java.util.Scanner;

public class JogoDaVelhaIndex {
	
	public static void main(String[] args)throws ArrayIndexOutOfBoundsException, PosicaoOcupadaException{
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.println("------ JOGO DA VELHA ------");
		JogoDaVelhas novoJogo = new JogoDaVelhas();
		
		
		
		
		while(true){
			novoJogo.Mostrartabuleiro();
			
			System.out.println("Digite de 0 a 2 para escolher a linha: ");
			int linha = scan.nextInt();
			
			System.out.println("Digite de 0 a 2 para escolher a coluna: ");
			int coluna = scan.nextInt();
			
			
			
			try {
				novoJogo.jogar(linha, coluna);
				
			}catch(ArrayIndexOutOfBoundsException e1){
				System.err.println("A posicao escolhida nao existe");
			}catch(PosicaoOcupadaException e2){
				System.err.println(e2.getMessage());
			}
			
		}
		
		

		

		
		
		
		
		
		
		
		
		
		
		
	}
}
