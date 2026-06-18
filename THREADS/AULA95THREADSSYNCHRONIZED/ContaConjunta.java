package THREADS.AULA95THREADSSYNCHRONIZED;

public class ContaConjunta {
	
	private double saldo = 100;
	
	
	public double getSaldo(){
		return saldo;	
		}
	
	
	public synchronized void saque(double valor, String cliente){//synchronized com esse modificador a threads que chamar esse método e ao iniciar a execução do método será bloqueado até que esse método seja finalizando onde será liberado o método para a próxima execução.
		if(saldo >= valor){
			
			double saldoOriginal = saldo;
			System.out.println(cliente + " Vai sacar");
			
			try {
				System.out.println(cliente + " Aguardando processamento");
				Thread.sleep(1000);//Aguardando processamento 
			} catch (InterruptedException e) {}
			saldo -= valor;
			System.out.println(cliente + " Sacou " + valor + " [Saldo Original= " + saldoOriginal + " ,Saldo Final= "+ saldo +"]");
		}else{
			System.out.println("Saldo insuficiente para " + cliente);
		}
		
		
		
		
	}
	
}
