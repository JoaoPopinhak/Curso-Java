package GUI.AULA79GUIJTEXTFIELDJPASSWORDFIELDINNERCLASS;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleText extends JFrame implements ActionListener{
	
	
	JButton buttonOK,buttonCancel;
	JTextField login;
	JPasswordField senha;

	
	public ControleText() {
		super("Título app");
		
		buttonOK = new JButton("OK");
		buttonOK.addActionListener(new BotaoOkListener());//new BotaoOkListener() Instanciar Escolhendo a classe própria responsável pelo tratamento deste botão
		/**/
		buttonCancel = new JButton("Cancel");
		buttonCancel.addActionListener(this);
		
		
		login = new JTextField();
		senha = new JPasswordField();
		
		
		
		
		
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		
		c.add(new JLabel("Login"));
		c.add(login);
		c.add(new JLabel("Senha"));
		c.add(senha);
		
		
		
		
		c.add(buttonOK);
		c.add(buttonCancel);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
	}
	
	/**/
	
	class BotaoOkListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("Clicou OK");
			
			String s = "Login: " + login.getText() + "\nSenha: " + new String(senha.getPassword());//login.getText() retorna o texto informado
			JOptionPane.showMessageDialog(null, s); 
			
			login.setText("");//Limpando o texto digitado 
			senha.setText("");
		}	
	}
	
	
	
	/**/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttonOK){//ActionEvent e.getSource() Retorna o objeto que deu origem a esse evento 

			
		}else{
			System.out.println("Clicou Cancel");
			
			login.setText("");//Limpando o texto digitado 
			senha.setText("");
		}
		
		
/**/	
		
	}
	
	
	public static void main(String[] args) {
		new ControleText();
	}














}
