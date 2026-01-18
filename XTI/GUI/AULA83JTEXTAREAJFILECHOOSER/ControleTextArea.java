package GUI.AULA83JTEXTAREAJFILECHOOSER;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener{
	JTextArea texto;
	
	
	public ControleTextArea(){
		super("Editor de Textos");
		/*Container*/
		Container c = getContentPane();
		
		
		/*JTextArea*/
		texto = new JTextArea();
		texto.setFont(new Font("serif", Font.PLAIN,26));	
		JScrollPane scroll = new JScrollPane(texto);
		
		
		/*Botão*/
		
		JButton botao = new JButton("Abrir arquivo");
		botao.setFont(new Font("serif", Font.PLAIN,26));
		botao.addActionListener(this);

		/*Cpnfiguração Container*/
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		/**/
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e){
		JFileChooser chooser = new JFileChooser(); //Esse tipo JFileChosser ele abre uma janela de navegação de arquivos
		chooser.showOpenDialog(this);// e por parametro é necessário inforar a classe que está solicitando a operacao

		
		
		File file = chooser.getSelectedFile();//Esse metódo .getSelectedFile() recupera o arquivo selecionado da janela anterior
		
		try {
			Path path = Paths.get(file.getAbsolutePath());//Recupera o caminho do arquivo
			String retorno = new String(Files.readAllBytes(path));//lê em bytes transforme em array e depois transforma em string
			
			texto.setText(retorno);//Mostra o conteúdo do arquivo no nosso editor de texto
			
		}catch(Exception e1){
			JOptionPane.showMessageDialog(this, "Não foi possível abrir o arquivo.");
			e1.printStackTrace();
		}
		
		
	}

	public static void main(String[] args) {
		new ControleTextArea();

	}



}
