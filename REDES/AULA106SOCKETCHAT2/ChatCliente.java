package REDES.AULA106SOCKETCHAT2;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class ChatCliente extends JFrame{
	
	JTextField textoEnvio;
	PrintWriter escritor;
	Socket socket;
	String nome;
	JTextArea textoRecebido;
	Scanner leitor;
	
	private class EscutaServer implements Runnable{
		@Override
		public void run() {
			try {
				String texto;
				while((texto = leitor.nextLine()) != null){
					textoRecebido.append(texto + "\n");
				}
			}catch(Exception e) {}
		}
	}
	
	private void configurarRede() throws Exception{
		
		try {
			socket = new Socket("26.93.102.48",5000);
			escritor = new PrintWriter(socket.getOutputStream());
			leitor = new Scanner(socket.getInputStream());
			new Thread(new EscutaServer()).start();
		}catch(Exception e) {}
		
	}
	
	
	public ChatCliente (String nome) throws Exception{
		super("Chat : " + nome);
		this.nome = nome;	
		
		Font fonte = new Font("Serif", Font.PLAIN, 26);
		
		textoEnvio = new JTextField();
		textoEnvio.setFont(fonte);
		
		textoRecebido = new JTextArea();
		textoRecebido.setFont(fonte);
		JScrollPane scroll = new JScrollPane(textoRecebido);
		
		
		JButton btnEnvio = new JButton("Enviar");
		btnEnvio.setFont(fonte);
		btnEnvio.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				escritor.println(nome + " : " + textoEnvio.getText());
				escritor.flush();
				textoEnvio.setText("");
				textoEnvio.requestFocus();
			}
			
		});
		
		Container envio = getContentPane();
		envio.setLayout(new BorderLayout());
		
		envio.add(BorderLayout.SOUTH,textoEnvio);
		envio.add(BorderLayout.EAST,btnEnvio);
		envio.add(BorderLayout.CENTER, scroll);
		
		/**/
		
		configurarRede();
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	
	public static void main(String[] args) throws Exception {

		new ChatCliente("João");
		new ChatCliente("Sofia");

	}
}

