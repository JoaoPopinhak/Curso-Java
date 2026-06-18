package THREADS.AULA95THREADSSYNCHRONIZED;

public class ComprasEmFamilia implements Runnable{
	
	ContaConjunta conta = new ContaConjunta();
	
	@Override
	public void run() {
		String cliente = Thread.currentThread().getName();//Thread.currentThread() esse método da classe Thread é possível recuperar a Thread que está atualemnte em execução. E através da Thread que está em execução é possível recuperar o seu nome com o método .getName() onde retorna uma string
		for(int i = 0; i < 5; i++){	
			conta.saque(20, cliente);
			if(conta.getSaldo() < 0){
				System.out.println("Estourou");
			}
			
		}

		
	}

	public static void main(String[] args) {
		
		ComprasEmFamilia compras = new ComprasEmFamilia();
		
		new Thread(compras, "Pai").start();
		new Thread(compras, "Mãe").start();
		new Thread(compras, "Filho").start();
		new Thread(compras, "Babá").start();
	}
}
