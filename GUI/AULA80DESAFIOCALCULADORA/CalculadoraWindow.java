package GUI.AULA80DESAFIOCALCULADORA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraWindow extends JFrame{
	
	JButton one,two,three,four,five,six,seven,eight,nine,zero,equal,point,soma,subtracao,multipli,divisao;
	JTextField console;
	double primeiroNumero, segundoNumero, resultado;
	String operacao;
	
	public CalculadoraWindow(){
		super("Calculadora");

		/*Containers*/
		Container containerPrin = getContentPane();
		Container containerTecl = new JPanel();
		
		containerPrin.setLayout(new BorderLayout(5,5));
		containerTecl.setLayout(new GridLayout(4,4,10,10));

		/*Botões*/
		one = new JButton("1");
		one.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "1");
			}
		});
		
		two = new JButton("2");
		two.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "2");		
			}
		});
		
		three = new JButton("3");
		three.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "3");	
			}	
		});
		
		four = new JButton("4");
		four.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "4");
			}
		});
		
		five = new JButton("5");
		five.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "5");
			}
		});
		
		six = new JButton("6");
		six.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "6");
			}
		});
		
		seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "7");
			}
		});
		
		eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "8");
			}	
		});
		
		nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "9");
			}
			
		});
		zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + "0");	
			}
		});
		
		
		equal = new JButton("=");
		equal.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				segundoNumero = Double.parseDouble(console.getText());
				
				switch(operacao){
				case "+":
					resultado = primeiroNumero + segundoNumero;
					operacao = "=";
					break;
				
				case "-":
					resultado = primeiroNumero - segundoNumero;
					operacao = "=";
					break;
					
				case "*":
					resultado = primeiroNumero * segundoNumero;
					operacao = "=";
					break;
					
				case "/":
					if(segundoNumero != 0) {
						resultado = primeiroNumero / segundoNumero;
						operacao = "=";
					}else{
						JOptionPane.showMessageDialog(null, "Não é possível dividir por 0");
						operacao = "=";
					}
					break;	
				case "=":
					console.setText("");
					primeiroNumero = 0;
					segundoNumero = 0;
					operacao = "";
					break;
				}
				
				console.setText(Double.toString(resultado));
			}
			
		});
		point = new JButton(".");
		point.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				console.setText(console.getText() + ".");
			}	
		});
		
		soma = new JButton("+");
		soma.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(console.getText());
				operacao = "+";
				console.setText("");
			}
		});
		
		
		subtracao = new JButton("-");
		subtracao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(console.getText());
				operacao = "-";
				console.setText("");
			}
		});
		
		multipli = new JButton("*");
		multipli.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(console.getText());
				console.setText("");
				operacao = "*";
			}
		});
					
		divisao = new JButton("/");
		divisao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				primeiroNumero = Double.parseDouble(console.getText());
				console.setText("");
				operacao = "/";
			}
		});
		

		/*Console*/
		console = new JTextField();
		console.setEditable(false);
		console.setBackground(Color.WHITE);
		console.setFont(new Font("Serif", Font.PLAIN, 50));
		console.setPreferredSize(new Dimension(0,100));
		
		
		/*Configurando os containers*/
		containerPrin.add(BorderLayout.NORTH, console);
		containerPrin.add(BorderLayout.CENTER,containerTecl);
		
		
		containerTecl.add(seven);
		containerTecl.add(eight);
		containerTecl.add(nine);
		containerTecl.add(divisao);
		
		containerTecl.add(four);
		containerTecl.add(five);
		containerTecl.add(six);
		containerTecl.add(multipli);
		
		containerTecl.add(one);
		containerTecl.add(two);
		containerTecl.add(three);
		containerTecl.add(subtracao);
		
		containerTecl.add(zero);
		containerTecl.add(point);
		containerTecl.add(equal);
		containerTecl.add(soma);
		
		/**/
		setVisible(true);
		setSize(500,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		
		new CalculadoraWindow();
	}

}
