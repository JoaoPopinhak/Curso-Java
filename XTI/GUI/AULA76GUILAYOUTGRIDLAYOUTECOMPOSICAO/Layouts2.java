package GUI.AULA76GUILAYOUTGRIDLAYOUTECOMPOSICAO;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame{
	
	public Layouts2(){
		super("Layouts2");
		
		Container c = getContentPane();
		
		/*
		c.setLayout(new BorderLayout(10,10));//new BorderLayout(5,5)//No contrutor do BorderLayout é possível inserir como parametro a dimensão do espaçamento entre os layout 
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.WEST, new JButton("W"));
		c.add(BorderLayout.EAST, new JButton("E"));
		*/
		
		
		
		/*GridLayout*/
		/*
		c.setLayout(new GridLayout(2,3));//new GridLayout(2,3) No construtor do GridLayout vai por parametro a quantidade de linhas e a quantidade de colunas
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		*/
		
		Container b = new JPanel();//Criação do segundo container 
		
		c.setLayout(new BorderLayout());
		b.setLayout(new GridLayout(4,1));
		
		c.add(BorderLayout.CENTER, new JButton("CENTER"));
		c.add(BorderLayout.EAST, b);
		
		b.add(new JButton("Ok"));
		b.add(new JButton("Cancel"));
		b.add(new JButton("Setup"));
		b.add(new JButton("Help"));
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300,300);
		
		setVisible(true);
	}
	
	

	public static void main(String[] args) {
		
		new Layouts2();

	}

}
