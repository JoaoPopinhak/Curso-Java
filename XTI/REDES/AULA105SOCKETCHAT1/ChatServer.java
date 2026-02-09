package REDES.AULA105SOCKETCHAT1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatServer {

	public ChatServer()  {
		ServerSocket server;
		Scanner scaner;
		
		try {
			server = new ServerSocket(5000);
			while(true){
				Socket cliente = server.accept();
				new Thread(new EscutaCliente(cliente)).start();
			}	
		}catch(IOException e){}
	}
	
	private class EscutaCliente implements Runnable{
		Scanner scanner;
		
		public EscutaCliente(Socket socketCliente){
			try {
				scanner = new Scanner(socketCliente.getInputStream());	
			} catch (Exception e) {}
		}
		
		@Override
		public void run() {
			try {
				String texto;
				while((texto = scanner.nextLine()) != null) {
					System.out.println(texto);
				}
				
			}catch(Exception e1) {}
	
		}	
	}

	public static void main(String[] args) throws Exception {
		
		new ChatServer();

	}
}
