package ATIVIDADES.JOGODAVELHA;

import java.util.Scanner;

public class JogoDaVelha {
	
	
	public static boolean validacaoVitoria(String tabuleiro[][], boolean vencedor, int tentativas){
		
		if(tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X") || 
		   tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X") ||
		   tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X") ||   
		   tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X") ||
		   tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X") ||
		   tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X") ||  
		   tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X") ||
		   tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X") ){		
			
			System.out.println("VITORIA X");
			return vencedor = true;	
			
		}else if(tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O") || 
				 tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O") ||
				 tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O") ||		   
				 tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O") ||
				 tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O") ||
				 tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O") ||		   
				 tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O") ||
				 tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O") ){
			
			System.out.println("VITORIA O");
			return vencedor = true;	
			
		}else if(tentativas > 8){	
			System.out.println("DEU VELHA");
			return vencedor = true;	
			
		}else{	
			
			return vencedor = false;
		} 
	}
	
	public static void main(String[] args){

			Scanner scan = new Scanner(System.in);
			String jogador = "X";
			
			String[][] tabuleiro = {
					{" "," "," "},
					{" "," "," "},
					{" "," "," "}
			};
			
			
			for(int i = 0; i < 3; i++){
				
				for(int j = 0; j < 3; j++) {
					System.out.print("|");
					System.out.print("   " + tabuleiro[i][j] + "   ");
					System.out.print("|");
				}
				System.out.println("\n+-------++-------++-------+");
			}
			
			boolean vencedor = false;
			int tentativas = 0;
			
			while(vencedor == false){
				
				System.out.println("Escolha a posição linha: ");
				
				int posicaoLinha = scan.nextInt();
				int posicaoColuna = scan.nextInt();
				tabuleiro[posicaoLinha][posicaoColuna] = jogador;
				
				jogador = (jogador == "X")? "O":"X";
				
				for(int i = 0; i < 3; i++){
					
					for(int j = 0; j < 3; j++) {
						System.out.print("|");
						System.out.print("   " + tabuleiro[i][j] + "   ");
						System.out.print("|");
					}
					System.out.println("\n+-------++-------++-------+");
				}
				
				tentativas++;
				vencedor = validacaoVitoria(tabuleiro, vencedor, tentativas);
				
			}
			
			
			
			
			
		
		
		
		
		
	
		
	}
}
