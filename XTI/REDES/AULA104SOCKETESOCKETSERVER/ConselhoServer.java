package REDES.AULA104SOCKETESOCKETSERVER;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ConselhoServer {

	public static void main(String[] args) throws Exception {
		
		/*A classe 'ServerSocket' representa uma conexão. No construtor do ServerSocket, é preciso informar por parametro o (string)IP da máquina que vai rodar o programa 
		 * e o numero da porta TCP que vai roder o programa 
		 * Ex: new Socket("IP", TCP).
		 * 
		 * Neste exemplo como estamos criando o servidor vamos informar somente a porta TCP
		 * 
		 * As portas TCP entre 0 - 1023 são portas reservadas*/
		
		
		
		ServerSocket serverSocket = new ServerSocket(5000);//Servidor e cliente estão respondendo na mesma porta
		
		while(true){
			Socket socketCliente = serverSocket.accept();//Esse método aguarda a chegada de cliente. E quando o método localiza um cliente ele retorna um Socket.
			
			try(PrintWriter w = new PrintWriter(socketCliente.getOutputStream())){
				w.println("Aprenda JAVA e seja contratado!");
			}
			
		}
	}
}
