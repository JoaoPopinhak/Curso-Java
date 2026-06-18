package REFINADO.AULA98CLASSESANINHADASEANONIMAS;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Aninhamento extends JFrame{
	JButton botao;
	
	public Aninhamento(){
		super("Aninhamento");
		
		
		botao = new JButton("ok");
		botao.addActionListener(new ListenerAninhado());
		botao.addActionListener(new ActionListener() {//Criando uma classe Anonima sem nome, apenas inserindo a implementação ActionListener Se chama classe anonima
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Esse comanda veio a apartir de uma classe anonima");
			}
		});
		
		Container c =getContentPane();
		c.add(botao);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
	}
	
	public class ListenerAninhado implements ActionListener{//Criando um classe dentro de uma classe se chama 'Classe Aninhada'

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Classe aninhada executa "+botao.getText());
		}
		
	}
	
	
	

	public static void main(String[] args) {
		Aninhamento janela = new Aninhamento();
		
		
		Aninhamento.ListenerAninhado listener = janela.new ListenerAninhado();
		
		
	}
}
