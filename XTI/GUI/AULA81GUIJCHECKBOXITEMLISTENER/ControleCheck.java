package GUI.AULA81GUIJCHECKBOXITEMLISTENER;


import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class ControleCheck extends JFrame{
	
	JTextField texto;
	JCheckBox bold,italic;

	public ControleCheck(){
		super("Check");
		
		/*Containers*/
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		/*Botões*/
		
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckListener());//Para o tipo JCheckBox utilizar o método .addItemListener para criar um evento(ação)

		
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());

		/*Console*/
		
	    texto = new JTextField("Veja a fonte mudar", 12);
		texto.setFont(new Font("serif", Font.PLAIN,26));
		
		/*Configurando os containers*/
		c.add(texto);
		c.add(bold);
		c.add(italic);
		
		
		/**/
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
	}
	
	class CheckListener implements ItemListener{
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(italic.isSelected() && bold.isSelected()){//Para o tipo JChebox .isSelected para validar se o item está selecionado
				texto.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 26));
			}else if(bold.isSelected()){
				texto.setFont(new Font("serif", Font.BOLD,26));
			}else if(italic.isSelected()) {
				texto.setFont(new Font("serif", Font.ITALIC,26));
			}else {
				texto.setFont(new Font("serif", Font.PLAIN,26));
			}
			
		}
	}

	public static void main(String[] args) {
		new ControleCheck();
	}







	

}
