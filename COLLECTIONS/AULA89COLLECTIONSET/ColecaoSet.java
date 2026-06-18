package COLLECTIONS.AULA89COLLECTIONSET;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		
		String[] cores = {"verde","amarelo","azul","branco", "azul","verde","amarelo","azul","branco", "azul"};
		
		List<String> list = Arrays.asList(cores);
		System.out.println(list);

		
		Set<String> set = new HashSet<String>(list);//Criando uma coleção do tipo SET onde como exemplo entre a coleção do tipo LIST e a coleção do tipo SET, no tipo SET não permite itens na coleção duplicados
		System.out.println(set);

	}
}
