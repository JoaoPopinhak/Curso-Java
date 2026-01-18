package JAVA.AULA58STRINGS;

public class StringOperacoes {
	public static void main(String[] args){
		
		//FORMAS DE CRIAÇÕES DE STRINGS
		/*Clicar em CNTRL aparece o link para navegar na classe escolhida*/
		String s1 = "Criando String";
		String s2 = s1 + " criada";
		String s3 = new String("Java teste");
		char[] array = {'J','A','V','A'};
		String s4 = new String(array);
		
		
		//OPERACOES STRINGS
		
		int tamanho = s1.length(); //metodo length retorna o numero de caracteres
		char letra = s1.charAt(0); //metodo charAt retorna a letra na posição informada no parametro (começa de 0 a length()-1)
		String texto = s1.toString(); //Retorna  o texto
		
		
		//LOCALIZAÇÃO STRINGS
		
		int posicao = s1.indexOf('A');//Localiza a letra e retorna a posição da letra informada no parametro
		int posicao1 = s1.indexOf("onde"); // retorna  a posição de onde inicia essa palavra
		int ultimaposi = s1.lastIndexOf('A');//retorna a posição do último "a"  
		boolean vazio = s1.isEmpty();// RETORNA BOOLEAN TRUE SE TIVER VAZIO OU FALSE SE NÃO ESTIVER VAZIA 
		
		
		//COMPARACAO STRINGS
		
		String xti = "xti";
		boolean igual = xti.equals("XTI"); //.equals compara se os valores são iguais. Para comparação de tipos de objetos utilize "==" operador de comparação
		boolean igual2 = xti.equalsIgnoreCase("XTI");//equalsignorecase compara os valores independente se é maiusculo ou minusculo
		boolean igual3 = xti.startsWith("XT");//retorna verdadeiro se inicia a String com "XT"
		boolean igual4 = xti.endsWith("TI");// retorna verdade se o final da string termina em "TI"
		int igual5 = "amor".compareTo("bola");//-1 (menor) || 1 (maior) || 0 (igual) compara se é maior ou menor "a" é menor vem antes de "b"
		
		String so = "Olhe, olhe!";
		so.regionMatches(6, "olhe", 0, 4);
		
		//EXTRAÇÃO DE STRINGS
		
		String s = "O Brasil é Lindo";
	    String s10 = s.substring(11);//Retorna os textos apartir da 11 posição em diante
		
	    String se = "O Brasil é Lindo";
	    String s10e = s.substring(2, 8);//pega o texto que estiver no meio da posição informada
	    
	    //MODIFICAÇÃO DE STRINGS
	    
	    s10e = s.concat("Parabéns");// junta a var s e o novo texto na mesma var
	    s10e += s + "Parabens"; // a linha de cima faz a mesma coisa que essa
	    
	    s10e = s.replace('S', 'Z');// Altera o carctere antigo informado no primeiro parametro pelo novo caracter informado no segundo parametro
        s10e = s.replaceFirst(" ", "X");//altera somente o primeira ocorrencia do caracter informado no parametro
        s10e = s.replaceAll(" ", "X"); // altera todo o espaçamento em branco por "X"
        
        s10e = s.toUpperCase();//Deixa todo o texto da variavel em CAIXA ALTA
        s10e = s.toLowerCase();//Deixa todo o texto da variavel em CAIXA BAIXA
        
        s.trim();//remove os espaços em branco antes e depois da string, espaços no meio continuaram
	}    
}
