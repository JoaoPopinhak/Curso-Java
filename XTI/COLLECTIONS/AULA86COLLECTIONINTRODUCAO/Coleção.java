package COLLECTIONS.AULA86COLLECTIONINTRODUCAO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Coleção {

	public static void main(String[] args) {
		
		Collection<String> c = new ArrayList<>();
		
		 c.add("A");
		 c.add("E");
		 c.add("I");
		 
		 System.out.println(c.toString());
		 System.out.println(c.isEmpty());//.isEmpty() Retorna True se a coleção estiver vazia
		 System.out.println(c.contains("A"));//.contains("A") Retorna True se tiver o objeto passado no parametro
		 

		 c.remove("A"); //é possível remover o elemento que está na coleção com metodo .remove()
		 
		
		/* Grupos */
		 
		 Collection<String> c2 = Arrays.asList("O","U");//Criando uma lista já com elementos criados
		 c.addAll(c2); //.addAll(c2) adiciona uma outra coleção inteira com todos os elementos
		 System.out.println(c.toString());//Testando a linha de cima onde o metodo .toString() mostra os itens da coleção
		
		 System.out.println(c.containsAll(c2));//.containsAll(c2) verifica se existem todos os elementos da coleção c2 na coleção c1
		
		 c.removeAll(c2);//.removeAll(c2) remove uma outra coleção inteira com todos os elementos
		 System.out.println(c.toString());
		 
		 
		 
		 /* percorrer os elemtnos */
		 for (String string : c) {
			 System.out.println(string);
		}
		 //Ou com for normal
		 
		 
		 /* Como tranformar uma coleção em um array */
		 
		 c.toArray();// Metodo normal de conversão de uma coleção para um array
		 String[] s = c.toArray(new String[c.size()]);//Metodo onde definimos o tipo de retorno contendo o tamanho da coleção
		 System.out.println(Arrays.toString(s));
		 
		 c.clear();//Limpa toda a coleção
		 System.out.print(c.toString());
		 
	}
}
