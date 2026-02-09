package THREADS.AULA96THREADSWAITNOTIFYALL;

/**
 * 
 * 
 * @since 1.0  versão java
 * @version 1.3 versão do arquivo
 * @author João Marcos Rodrigues 
 * @see PonteNaoSincronizada
 * @see PonteSincronizada
 */

public interface Ponte {
	
	/**
	 * Armazena o valor informado na ponte. Geralmente será chamado pelas classes produtoras de dados.
	 * 
	 * @param valor
	 * @throws InterruptedException
	 */
	public void set(int valor)throws InterruptedException;
	
	
	
	/**
	 * Recupera a informação armazenada na ponte.
	 * Esse método será chamado pelas Consumidora de dados.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public int get()throws InterruptedException;
	
}
