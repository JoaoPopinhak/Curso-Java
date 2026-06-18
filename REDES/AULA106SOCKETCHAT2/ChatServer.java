package REDES.AULA106SOCKETCHAT2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ChatServer {
	
	List<PrintWriter> escritores = new ArrayList<>();
	
	
	public ChatServer()  {
		ServerSocket server;
		
		try {
			server = new ServerSocket(5000);
			while(true){
				Socket cliente = server.accept();
				new Thread(new EscutaCliente(cliente)).start();
				PrintWriter print = new PrintWriter(cliente.getOutputStream());
				escritores.add(print);
			}	
		}catch(IOException e){}
	}
	
	private void encaminharTodos(String texto){
		for (PrintWriter printWriter : escritores) {
			try {
				printWriter.println(texto);
				printWriter.flush();
			}catch(Exception e) {}
		}
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
					encaminharTodos(texto);
				}
				
			}catch(Exception e1) {}
	
		}	
	}

	public static void main(String[] args) throws Exception {
		
		new ChatServer();

	}
}
