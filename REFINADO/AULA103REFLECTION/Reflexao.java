package REFINADO.AULA103REFLECTION;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	
	public static void main(String[] args) throws Exception {
		String nome = "POO.AULA36METODPARAM.Conta";
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
		
		Field[] f = classe.getFields();
		for (Field field : f) {
			System.out.println(field);
		}
		
		Method[] m = classe.getDeclaredMethods();
		for (Method method : m) {
			System.out.println(method.getName());
		}
		
		Constructor[] c = classe.getConstructors();
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
		
		Constructor co = classe.getConstructor(String.class, double.class);
		Object o = co.newInstance("João", 120);
		
		Method md = classe.getMethod("deposito", double.class);
		md.invoke(o, 100);
		
		Method me = classe.getMethod("exibeSaldo");
		me.invoke(o);
		
		
	}
}
