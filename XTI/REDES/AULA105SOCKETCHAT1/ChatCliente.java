package REDES.AULA105SOCKETCHAT1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class ChatCliente extends JFrame{
	
	JTextField textoEnvio;
	PrintWriter escritor;
	Socket socket;
	String nome;
	
	
	private void configurarRede() throws Exception{
		
		try {
			socket = new Socket("26.93.102.48",5000);
			escritor = new PrintWriter(socket.getOutputStream());
		}catch(Exception e) {}
		
	}
	
	

	
	public ChatCliente (String nome) throws Exception{
		super("Chat : " + nome);
		this.nome = nome;	
		
		Font fonte = new Font("Serif", Font.PLAIN, 26);
		
		textoEnvio = new JTextField();
		textoEnvio.setFont(fonte);
		
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
		
		envio.add(BorderLayout.CENTER,textoEnvio);
		envio.add(BorderLayout.EAST,btnEnvio);
		
		/**/
		
		configurarRede();
		
		setSize(500,90);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) throws Exception {

		new ChatCliente("João");
		new ChatCliente("Sofia");
	}
}
