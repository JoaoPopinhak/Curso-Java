package JAVA.AULA60STRINGBUFFERSTRINGBUIDER;

public class StringMutavel {

	public static void main(String[] args) {
		
		/*Esses dois objetos são utilizados para realizar modificações de textos acrescentando ou deletando textos*/
		
		StringBuffer s0 = new StringBuffer();
		StringBuilder s1 = new StringBuilder("JAVA");
		
		/*Os obejtos da classe S Buffer e S Builder tem os mesmos metodos dos objetos Strings*/
		s1.toString();
		s1.length();
		
		/*E alguns metodos próprios*/
		s1.capacity(); // Ele informa a capacidade de armazenamento de novos caracteres sem locar mais memoria 
		
		System.out.println(s1.length());//Imprimindo o tamanho da String
		System.out.println(s1.capacity());//Imprimindo a memoria disponivel antes de locar mais memoria 
		
		s1.reverse();//Modifica a string invertendo a ordem dos caracteres
		
		System.out.println(s1);//Imprimindo o exemplo de como ficou depois de usar o metodo reverse
		
		s1.append(" Trabalhando ");//Esse metodo ele concatena '+' acrscenta outros textos sem criar um novo objeto muito utilizado
		char[] c = {'C','O','M'};//Pode acrescentar um array de char utilizando appens
		s1.append(c).append(" Texto.");// E pode utilizar o append na mesma linha quantas vezes for necessário
		
		System.out.println(s1);//imprimindo os exemplos
		
		String s = "Oi"+" como"+" vai"+" Você?";//A forma de criar esse texto é igual a forma de baixo porém...
		String sb = new StringBuilder("Oi").append(" como").append(" vai").append(" você?").toString();//É a mesma coisa, porém faz de forma automatica pela virtualmachine
		
		s += "aaa";//Porém se utilizar esse objeto de string em outro local ele criará um novo objeto do tipo stringbuilder
		
		/*Se você estiver trabalhando com muitas concatenações o ideal é já criar um objeto com a classe stringbuilder onde poderá acrescentar texto 
		 * utilizando o mesmo objeto sem precisar novos objetos usando o objeto do tipo string gastando memoria*/
		
		String url = new StringBuilder("www.xt.com.br").delete(0, 4).toString();//.delete(0,0) Você informa a posição que deseja remover do texto
		
		System.out.println(url);//Imprimindo o texto
		

	}

}
