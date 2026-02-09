package THREADS.AULA94THREADSRUNNABLE;

import THREADS.AULA93THREADSSTARSLEEPCICLODEVIDA.PingPong;

public class PingPongRunable implements Runnable{

		String palavra;
		long tempo;
		
		public PingPongRunable(String palavra, long tempo){
			this.palavra = palavra;
			this.tempo = tempo;
		}
		
		
		@Override
		public void run(){
			
			    try{
					for(int i=0; i<100; i++){
						System.out.print(palavra);
						Thread.sleep(tempo);//.sleep(tempo) com esse método você informa por parametro o tempo em ms que deseja que ele aguarde para executar novamente
					}
				}catch (InterruptedException e){
					return;//Assim que o metodo run executar uma exeção é retornado algo no metodo run. Ao retornar algo o metodo Run é finalizado. Finalizando sua thread. (Esse meétodo lança uma excpetion)
				}
			    
		}
		

		public static void main(String[] args) {
			
			PingPongRunable ping = new PingPongRunable("ping", 1500);//.start() Esse método altera o estado do thread para pronto.
			Runnable pong = new PingPongRunable("pong", 2000);
			
			new Thread(ping, "ping").start();;
			new Thread(pong, "pong").start();;
			
			
			
			System.out.println("Ver Thread");
			
			/*Nesta aula apresenta que podemos estar criando Threads utilzando a classe Thread como implementando a interface Runnable*/
 
		}

	}
 