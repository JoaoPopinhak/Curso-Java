package COLLECTIONS.AULA88COLLECTIONUTILITARIOCOLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ColecaoUtilitario {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Maça");
		list.add("Tomate");
		list.add("Uva");
		list.add("Pessego");
		
		System.out.println(list);
		
		
		/*Classe utilitaria Collections. Foi criado para ajudar na manipulação de todo tipo de coleção JAVA. 
		 *Onde você encontrará alguns metodos somente nessa classe como por exemplo o metodo .sort(Colletion)*/
		
		Collections.sort(list);//.sort() utilizado para ordernar em ordem alfabetico os dados dentro de uma lista
		System.out.println(list);
		
		Collections.reverse(list);//.reverse(list) ordena os dados dentro de uma lista na ordem reversa a qual estava anteriormente
		System.out.println(list);
		
		Collections.shuffle(list);//.shuffle(list) orderna os dados dentro de uma lista de forma aleatoria 
		System.out.println(list);
		
		Collections.addAll(list, "Cupaçu", "Laranja", "Laranja");//.addAll() adiciona mais objetos(elemtnos) extras na List
		System.out.println(list);
		
		System.out.println(Collections.frequency(list, "Laranja"));//.frequency(Collections, objeto) retorna a quantidade de vezes que o objeto repetiu na List
		
		
		List<String> list2 = Arrays.asList("Acerola","Graviola");
		
		System.out.println(list2);
		
		boolean d =Collections.disjoint(list, list2);//.disjoint(list, list2) Verifica se na lista1 tem os elementos que contem na lista2
		System.out.println(d);	
		
		Collections.sort(list);//Reordenando em ordem alfabetica a lista1
		
		System.out.println(list);
		int i = Collections.binarySearch(list, "Uva");//binarySearch(list, "uva") retorna a posição em que o elemento "Uva" se encontra na List list
		System.out.println(i);
		
		Collections.fill(list, "Açai");//.fill(list, "Açai") neste metodo ele subistitui todas as posições que existem dentro da List por o elemento "Açai"
		System.out.println(list);
		
		/* Existe a possibilidade de criar uma coleção que não pode ser modificada*/
		
		Collection<String> constantes = Collections.unmodifiableCollection(list);//.unmodifiableCollection(list) esse metodo transforma uma coleção em uma constante ou seja não pode ser modificada
		

	}
}
