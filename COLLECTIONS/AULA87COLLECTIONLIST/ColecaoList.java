package COLLECTIONS.AULA87COLLECTIONLIST;

import java.util.ArrayList;
import java.util.List;

public class ColecaoList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Futebol");
		list.add("Volei");
		list.add("Basquete");
		list.add("MMA");
		list.add("Airsoft");
		list.add("Boxe");
		list.add("Golf");
		list.add("Futebol Americano");
		list.add("Futebol");
		
		
		System.out.println(list);
		
		
		for(int i = 0; i < list.size(); i++){
			
			String esporte = list.get(i);//.get() recupera o objeto que está no indice I 
			list.set(i, esporte.toUpperCase());//.set() no indice i insere o objeto
			
		}
		
		System.out.println(list);
		
		int i = list.indexOf("BOXE");//retorna um int da posicao do indice que se encontra o objeto boxe
		System.out.println(i);
		
		System.out.println(list.subList(2, 4));//.subList(2, 4) retorna uma "sub lista" da lista principal que está entre o indice informado no parametro até o segundo numero ou seja entre o indice 2 até o indice 4 
		
	    list.subList(2, 4).clear();//é possível remover a subLista da lista principal 
	    System.out.println(list);
	    
	    
		
	}

}
