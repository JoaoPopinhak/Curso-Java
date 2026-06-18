package GUI.AULA85GUICONVERSORFAHRENHEIT;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Conversor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField SaidaResultado;
	private JTextField EntradaValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 220);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					double fahrenheit = Double.parseDouble(EntradaValor.getText());
					double celsius = (fahrenheit-32)/1.8;
					SaidaResultado.setText(celsius + " Celsius");
				}catch(Exception e1) {
					
				}

			}
		});
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel fahrenheit = new JLabel("Fahrenheit:");
		fahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		fahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(fahrenheit);
		
		EntradaValor = new JTextField();
		EntradaValor.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(EntradaValor);
		EntradaValor.setColumns(10);
		
		JLabel celsius = new JLabel("Celsius:");
		celsius.setHorizontalAlignment(SwingConstants.CENTER);
		celsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(celsius);
		
		SaidaResultado = new JTextField();
		SaidaResultado.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(SaidaResultado);
		SaidaResultado.setColumns(10);

	}

}
