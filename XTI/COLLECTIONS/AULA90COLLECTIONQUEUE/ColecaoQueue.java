package COLLECTIONS.AULA90COLLECTIONQUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class ColecaoQueue {

	public static void main(String[] args) {
		
		
		
		//FIFO O primeiro a entrar é o primeiro a sair FILA
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("João");
		fila.add("Ricardo");
		fila.offer("Neto");//O metodo offer também adiciona a fila
		
		System.out.println(fila);
		
		System.out.println(fila.peek());//Metodo peek retorna a próxima pessoa da fila sem remover o elemento da fila
		System.out.println(fila.poll());//Metodo poll retorna a próxima pessoa da fila e remove esse elemento da fila	
		System.out.println(fila);//Testando as filas
		
		/*Outros metodos disponiveis em LINKEDLIST*/
		
		
		LinkedList<String> f = (LinkedList<String>) fila;
		
		f.addFirst("João Marcos");//addFirst("João Marcos") Com esse método eu adiciono esse elemento no inicio da fila.
		f.addLast("MacoMaco");//.addLast("MacoMaco") Com esse método eu adiciono esse elemento ao final da fila
		
		System.out.println(f);
		
		
		System.out.println(f.peekFirst());//.peekFirst() Com esse método retorna o primeiro elemnto da fila sem remover o elemento da fila
		System.out.println(f.peekLast());//.peekLast() Com esse método retorna o útlimo elemento da fila sem remover o elemento da fila
		
		
		System.out.println(f.pollFirst());//f.pollFirst() Com esse método retorna o primeiro elemento da fila e remove da lista
		System.out.println(f.pollLast());//f.pollLast() Com esse método retorna o último elemento da fila e remove da lista
		
		System.out.println(f);

		
		
	}
}
 