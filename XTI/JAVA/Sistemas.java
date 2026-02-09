package JAVA;

import java.io.Console;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Sistemas {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		
		Properties p = System.getProperties();//Recupera as propriedades do sistema que está executando o programa.Ele retorna um tipo 'Properties' = Coleção MAP
		System.out.println(p.getProperty("java.version"));
		
		p.setProperty("xti.curso.java.version", "1.0.0");//Também é possível definir propriedades do nosso sistema
		
		Set<Object>pk = p.keySet();
		
		for (Object object : pk) {
			System.out.println(object + " = " + p.get(object));
		}
		
		Console c = System.console();//Esse metódo retorna o console para o tipo 'Console'
		System.out.println("Usuario: ");
		String user = c.readLine();
		System.out.println("Senha: ");
		char[] pass = c.readPassword();
		System.out.println("Usuario: " + user+"Senha: " + new String(pass));
		
		Runtime.getRuntime().exec("notepad");//Comanda executa um programa com o nome que usa no prompt de comando
		
	}

}
