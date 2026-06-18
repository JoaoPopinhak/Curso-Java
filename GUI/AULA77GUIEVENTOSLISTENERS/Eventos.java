package GUI.AULA77GUIEVENTOSLISTENERS;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener{
	
	JButton button;
	
	public Eventos(){
		super("Eventos");

		Container c = getContentPane();
		
		button = new JButton("Clica aqui");
		
		c.add(button);
		
		/*Todos os controles que lançam eventos tem metodos add.NOME_EVENTOListener() ex: (addActionListener) */
		button.addActionListener(this);//Esse metodo espera um objeto que implemente a interface ActionListener onde a interface ActionListener espera que seja implementado o metodo actionPerformed 
		
		/**/

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300,300);
		
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {//Esse metodo da interface ActionListener é onde você deve descrever a ação que deve ocorrer
		System.out.println("Clicou");
		button.setText("Foi clicado");//Com esse metódo setText você altera o texto do botão. Para que seja possível a classe Principal precisa ter o tipo JButton como atributo

	}
	
	public static void main(String[] args) {
		new Eventos();		
	}
	



}
