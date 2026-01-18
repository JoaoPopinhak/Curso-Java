package GUI.AULA74GUIINTRODUCAOJFRAME;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame{
	
	/* Toda interface gráfica em JAVA começa por uma JANELA 
	 * A classe que representa uma Janela é a JFrame*/
	
	public Janela (){
		
	//JFrame frame = new JFrame();//Uma janela pode conter dimensões, titulo, menu, botões, pode abrir ou fechar etc..//Como essa classe JANELA representa a prórpia janela e extend de JFrame não é necessário usar o metodo consturtor padrão. Podemos utilizar o metodo contrutor super conforme exemplo abaixo
		super("Minha Janela");
		
		
		
		JButton botao = new JButton("Clique");//Com esse metodo contrutor da classe Button, estamos criando um coponente de botão para adicionar ao nosso container na linha abaixo
		
		getContentPane().add(botao);//Esse metodo recupera o container da nossa janela. '.add()' E dentro desse container eu posso adicionar componentes
		
		
		
		
		/*Linhas abaixo são os primeiros parametros a realizar*/
		
		setSize(300,300);//.setSize(int width, int heigth) com esse metodo aplicamos a dimensão da janela com o tipo Int. Cada unidade equivale a 1 px
		
		setVisible(true);//.setVisible(true) para deixar a janela visivel para o usuário 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Com esse metodo da a possibilidade do usuário fechar a Janela, no parametro pode ser informado a configuração de como ocorrerá esse processo
		
		/**/
	}
	
	/**/

	public static void main(String[] args) {

		new Janela();

		

		
	}
}
