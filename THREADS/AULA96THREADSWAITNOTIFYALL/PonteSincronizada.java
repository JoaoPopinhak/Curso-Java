package THREADS.AULA96THREADSWAITNOTIFYALL;

public class PonteSincronizada implements Ponte{

	private int valor = -1;
	private boolean ocupado = false;
	
	@Override
	public synchronized void set(int valor) throws InterruptedException {
		while(ocupado){
			System.out.println("Aguardando set");
			wait();
		}
		System.out.print("Produziu  " + valor);
		this.valor=valor;
		
		ocupado = true;
		notifyAll();
		
	}

	@Override
	public synchronized int get() throws InterruptedException {
		while(!ocupado){
			System.out.println("Aguardando get");
			wait();
		}
		
		System.err.print("Consumiu  " + valor);
		ocupado = false;
		notifyAll();
		return valor;
	}

}
