package ATIVIDADES.JOGODAVELHA;

public class JogoDaVelhas {
	
	String[][] tabuleiro = {
			{"","",""},
			{"","",""},
			{"","",""}
	};
	
	String jogador = "X";
	boolean vencedor = false;
	int tentativas = 0;
	int posicaoLinha;
	int posicaoColuna;
	
	
	void Mostrartabuleiro(){
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j < 3; j++) {
				System.out.print("|");
				System.out.print("   " + tabuleiro[i][j] + "   ");
				System.out.print("|");
			}
			System.out.println("\n+-------++-------++-------+");
		}
	}
	
	void jogar(int posicaoLinha, int posicaoColuna)throws ArrayIndexOutOfBoundsException, PosicaoOcupadaException{
		
		this.posicaoLinha = posicaoLinha;
		this.posicaoColuna = posicaoColuna;
		
		if(tabuleiro[posicaoLinha][posicaoColuna].isEmpty() == false){
			throw new PosicaoOcupadaException("A posicao ja foi escolhida");
		}else{
			
			tabuleiro[posicaoLinha][posicaoColuna] = jogador;
			jogador = (jogador == "X")? "O":"X";
			tentativas++;	
		}
	}
	
	
	void validacaoVitoria(){
		
		if(tabuleiro[0][0].equals("X") && tabuleiro[0][1].equals("X") && tabuleiro[0][2].equals("X") || 
		   tabuleiro[1][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[1][2].equals("X") ||
	       tabuleiro[2][0].equals("X") && tabuleiro[2][1].equals("X") && tabuleiro[2][2].equals("X") ||   
		   tabuleiro[0][0].equals("X") && tabuleiro[1][0].equals("X") && tabuleiro[2][0].equals("X") ||
		   tabuleiro[0][1].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][1].equals("X") ||
		   tabuleiro[0][2].equals("X") && tabuleiro[1][2].equals("X") && tabuleiro[2][2].equals("X") ||  
		   tabuleiro[0][2].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][0].equals("X") ||
		   tabuleiro[0][0].equals("X") && tabuleiro[1][1].equals("X") && tabuleiro[2][2].equals("X") ){
			
			vencedor=true;
			System.out.println("VITORIA X");
		}else if(tabuleiro[0][0].equals("O") && tabuleiro[0][1].equals("O") && tabuleiro[0][2].equals("O") || 
				 tabuleiro[1][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[1][2].equals("O") ||
				 tabuleiro[2][0].equals("O") && tabuleiro[2][1].equals("O") && tabuleiro[2][2].equals("O") ||		   
				 tabuleiro[0][0].equals("O") && tabuleiro[1][0].equals("O") && tabuleiro[2][0].equals("O") ||
				 tabuleiro[0][1].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][1].equals("O") ||
				 tabuleiro[0][2].equals("O") && tabuleiro[1][2].equals("O") && tabuleiro[2][2].equals("O") ||		   
				 tabuleiro[0][2].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][0].equals("O") ||
				 tabuleiro[0][0].equals("O") && tabuleiro[1][1].equals("O") && tabuleiro[2][2].equals("O")){
			
			vencedor=true;
			System.out.println("VITORIA O");
		}else if(tentativas > 8){	
			
			System.out.println("DEU VELHA");
			vencedor = true;	
			
		}else{	
			vencedor = false;
		} 
		
		
		
	}
	
	
	

}
