package JAVA.AULA59STRINGSSPLITTOKENS;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; CSS; JavaScript; jQuery; Java";
		
		String[] tokens = s.split(";");//.split(); quebra os tokens pelos ; retorna um array de strings
		
		System.out.println(tokens.length);
		
		for(String token : tokens){
			System.out.println(token);
		}
		
		
		
		s = "Venha trabalhar agora";
		String[] outros = s.split(" ");//.split(); quebra os tokens pelos "espaços" ou qualquer outro caractere(delimitador) informado no parametro e retorna um array de strings
		System.out.println(outros.length);
		
		for(String outro : outros){
			System.out.println(outro);
		}
		
		
	}
}
