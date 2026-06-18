package GUI.AULA78GUIJLABELIMAGEICON;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame{
	
	public ControleLabel() {
		super("Label");
		
		
		JLabel simples = new JLabel("Label Simples");//Criando um controler do tipo JLabel
		simples.setToolTipText("Meu Tooltip");//.setToolTipText Faz aparecer um texto ao passar em cima desse controler
		
		
		JLabel label = new JLabel("Label Simples");//Criando o controle JLabel 
		Font fonte = new Font("serif", Font.BOLD, 28);//Configurando a fonte
		label.setFont(fonte);//Aplicando a fonte
		label.setForeground(Color.BLUE);//Alterando a coloração da Fonte
		
		
		ImageIcon iconL = new ImageIcon(getClass().getResource("fotos/luz.png"));//Criando um icone e escolhendo a pasta onde está a imagem que será o icone
		JLabel imagem = new JLabel(iconL);//Criando outro controle JLabel e inserindo o tipo ImageIcon no contrutor
		

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		c.add(simples);
		c.add(label);
		c.add(imagem);
		
		
		/**/
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public static void main(String[] args) {

	
		new ControleLabel();
	}

}
