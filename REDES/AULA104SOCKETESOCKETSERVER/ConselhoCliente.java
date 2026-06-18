package REDES.AULA104SOCKETESOCKETSERVER;

import java.net.Socket;
import java.util.Scanner;

public class ConselhoCliente {

	public static void main(String[] args) throws Exception {
		
		/*A classe 'Socket' representa uma conexão. No construtor do socket, é preciso informar por parametro o (string)IP da máquina que vai rodar o programa 
		 * e o numero da porta TCP que vai roder o programa 
		 * Ex: new Socket("IP", TCP).
		 * 
		 * As portas TCP entre 0 - 1023 são portas reservadas*/
		
		Socket socket = new Socket("26.93.102.48", 5000);
		
		Scanner s = new Scanner(socket.getInputStream());
		
		System.out.println("Enviado do servidor: "+s.nextLine());
		
		s.close();
	}

}
