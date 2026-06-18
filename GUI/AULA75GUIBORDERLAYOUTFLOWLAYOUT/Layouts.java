package GUI.AULA75GUIBORDERLAYOUTFLOWLAYOUT;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame{
	
	public Layouts(){
		super("Layouts");
		
		/*Exemplo 1 BorderLayout*/
		
		/* Abaixo mostra como adicionar um LAYOUT que já existente no container */
		//Container c = getContentPane();//Criando o container
		//Você também pode criar seu próprio Layout
		//BorderLayout border = new BorderLayout();//Criando o Layout BorderLayout
		
		//c.setLayout(border);//Onde você adiciona ao seu container o layout que criou
		
		
		/*Adicionando os botões e sua posição*/
		//c.add(BorderLayout.NORTH, new JButton("1"));
		//c.add(BorderLayout.SOUTH, new JButton("2"));
		//c.add(BorderLayout.CENTER, new JButton("3"));
		
		/**/
		
		/*Exemplo 2 FlowLayout*/

		Container c = getContentPane();//Recuperando o container
		BorderLayout border = new BorderLayout();
		c.setLayout(new FlowLayout());//Criando o Layout FlowLayout 
		
		
		/*Adicionando os botões e sua posição. No caso do layout FlowLayout não é necessário inserir a posição onde ele distribuira de acordo com a chegada dos compoentenes*/
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		
		
		/*Linhas abaixo são os primeiros parametros a realizar*/
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300,300);
		
		setVisible(true);
		
		/**/
		
		
	}

	public static void main(String[] args) {
		
		new Layouts();
	
	}

}
