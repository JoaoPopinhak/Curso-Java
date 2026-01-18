package POO.AULA56ASSERTIONS;

import java.util.Scanner;

public class Assertions {
	
	/*O recurso assertion é utilizada para validação somente em tempo de desenvolvimento, não é utilizada para mostrar erro para o usuário final para isso você utiliza o exceptions para habilitar pode assistir a aula 56*/

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entre em um número de 0 a 10");
		int numero = scanner.nextInt();
		
		
		
		assert(numero >=0 && numero<=10)/*verificação*/ : /*se ter erro*/ "Numero Invalido " + numero;//utilizada somente para teste do dev precisa ativar 
		System.out.println("Você acessou " + numero);
		

	}

}
