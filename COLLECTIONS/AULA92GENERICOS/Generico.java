package COLLECTIONS.AULA92GENERICOS;

import java.util.ArrayList;

public class Generico <E>{//Na criação da classe podemos informar que o tipo que vamos trabalhar pode ser generico Qualquer um inserindo <E> após o nome da classe
	
	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
	}
	
	public E getElemento(){
		return elemento; 
	}
	
	/* Caracteres Coringas */
	
	public double soma(ArrayList<? extends Number> lista) {//? Qualquer tipo que seja filho de number ou seja int, double etc...
		
		double total = 0;
		for (Number number : lista) {
			
			total += number.doubleValue();	
		}
		
		return total;
	}
	
	/*public double soma1(ArrayList<? super Number> lista) {//? Qualquer tipo que seja pai de number
		
		double total = 0;
		for (Number number : lista) {//Lançou um erro pois não é possível converter um pai de number em number
			
			total += number.doubleValue();	
		}
		
		return total;
	}*/
	

	public static void main(String[] args) {
		Generico<String> g = new Generico();//No contrutor podemos inserir o tipo do objeto que vamos trabalhar 
		
		g.setElemento("Lagoa");
		
		//g.setElemento(123);//Como o tipo do elemento generico no construtor definimos como String não é possível setar com outros tipos de elementos
		
		g.getElemento().toUpperCase();//Como foi definido o tipo do objeto generico no construtor já conseguimos acessar os metodos do tipo informado no contrutor
	}

}
