package THREADS.AULA93THREADSSTARSLEEPCICLODEVIDA;

public class PingPong extends Thread{
	
	String palavra;
	long tempo;
	
	public PingPong(String palavra, long tempo){
		this.palavra = palavra;
		this.tempo = tempo;
	}
	
	
	public void run(){
		
		    try{
				for(int i=0; i<5; i++){
					System.out.print(palavra);
					Thread.sleep(tempo);//.sleep(tempo) com esse método você informa por parametro o tempo em ms que deseja que ele aguarde para executar novamente
				}
			}catch (InterruptedException e){
				return;//Assim que o metodo run executar uma InterruptedException é retornado algo no metodo run. Ao retornar algo o metodo Run é finalizado. Finalizando sua thread
			}
		    
	}
	

	public static void main(String[] args) {
		
		new PingPong("ping", 1500).start();//.start() Esse método altera o estado do thread para pronto.
		new PingPong("pong", 2000).start();
		
		
		System.out.println("Ver Thread");

	}

}
