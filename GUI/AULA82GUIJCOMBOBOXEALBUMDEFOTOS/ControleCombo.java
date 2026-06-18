package GUI.AULA82GUIJCOMBOBOXEALBUMDEFOTOS;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener{
	
	JComboBox<String> combo;//Esse controler(componente) pode receber qualquer tipo de objeto desde que seja defeinido o tipo de objeto que será trabalhado 
	
	JLabel label;
	
	ImageIcon[] imagens;//riando um arrey de ImageIcon
	
	
	
	public ControleCombo(){
		super("Album");
		
		
		
		Container c = getContentPane();
		
		
		/*ImageIcon*/
		imagens = new ImageIcon[]{
				/* Incluindo imagens no array ImageIcon*/
				new ImageIcon("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\GUI\\AULA82GUIJCOMBOBOXEALBUMDEFOTOS\\fotos\\1.png"),
				new ImageIcon("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\GUI\\AULA82GUIJCOMBOBOXEALBUMDEFOTOS\\fotos\\teste.jpg"),
				new ImageIcon("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\GUI\\AULA82GUIJCOMBOBOXEALBUMDEFOTOS\\fotos\\3.jpg"),	
				new ImageIcon("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\GUI\\AULA82GUIJCOMBOBOXEALBUMDEFOTOS\\fotos\\4.jpg"),
				new ImageIcon("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\GUI\\AULA82GUIJCOMBOBOXEALBUMDEFOTOS\\fotos\\5.jpg")
		};
		
		
		/*JComboBox<>()*/
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		
		combo.addItem("Família");//Com o metódo .addItem() você pode inserir qualquer tipo de objeto
		combo.addItem("Manga");
		combo.addItem("Banana");
		combo.addItem("Choro");
		
		
		combo.addItemListener(this);
		
		/*Label*/
		label = new JLabel(imagens[0]);
		
		
		/*Container*/
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		

		/**/
		setVisible(true);
		setSize(300,530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}
	
	

	public static void main(String[] args) {
		new ControleCombo();

	}
}
