package POO.AULA57DEBUG;

public class Aula57Debug {
	
	int resultado;
	
	public static int raiz(int numero){
		int raiz = 0, impar = 1;
		while(numero >= impar){
			numero -= impar;
			impar += 2;
			raiz++;
		}
		return raiz;
	}

	public static void main(String[] args) {
		
		int numero = 16;
		//DebugExemplo exemplo = new DebugExemplo();
		
		int raiz = raiz(numero);
		
		if(raiz == 4){
			System.out.println("Raiz correta");		
			}
		
		
		/*Teclas de atalho debug
		 * F5 step into
		 * F6 step over
		 * F7 
		 * F8*/
	}
}
