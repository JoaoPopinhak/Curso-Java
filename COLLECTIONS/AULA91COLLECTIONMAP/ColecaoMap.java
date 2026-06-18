package COLLECTIONS.AULA91COLLECTIONMAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {

	public static void main(String[] args) {
		
		Map<String,String> pais = new HashMap<>();
		
		pais.put("BR","Brasil");
		pais.put("RU","Russia");
		pais.put("IN", "India");
		pais.put("CN", "China");
		
		System.out.println(pais);
		
		
		System.out.println(pais.containsKey("BR"));//.containsKey("BR") Esse método retorna True se contém a CHAVE informada no parametro
		
		System.out.println(pais.containsValue("Brasil"));//.containsValue("Brasil") Esse método retorna True se contém o CONTEÚDO informado no parametro
		
		System.out.println(pais.get("CN"));//.get("CN") Retorna o conteúdo da chave informada no parametro
		
		pais.remove("RU");//.remove("RU") Com esse método remove o contéudo da chave informado no parametro 
		System.out.println(pais);
		
		
		Set<String> keysPais = pais.keySet();//.keySet() Retorna uma lista do tipo SET contendo as chaves onde esse tipo SET não aceita valores duplicados.
		
		for (String string : keysPais) {
			System.out.println(string + ":" + pais.get(string));
		}
		
		
	}
}
