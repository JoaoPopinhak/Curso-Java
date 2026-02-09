package REFINADO.AULA97GARBAGECOLLECTOR;

import java.util.ArrayList;
import java.util.List;

public class Garbage {
	

	public static long carregarMemoria(){
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100_000; i++){
			list.add(i);
		}
		return Runtime.getRuntime().freeMemory();//.freeMemory() Com esse método retorna a quantidade livre de memória(Em bytes);
	}
	
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		
		
		Runtime rt = Runtime.getRuntime();//Criar um objeto do tipo Runtime utilizando Runtime.GetRuntime() para então conseguir fazer as operações
		
		
		int MB = 1_048_576;
		double totalDisp = rt.maxMemory()/MB;//.maxMemory() Com esse método retorna a quantidade total de memória (Em bytes) disponível para JVM executar. Feito um calculo para retornar um valor em MB
		System.out.println(totalDisp);
		
		double inicio = totalDisp - (carregarMemoria()/MB);
		
		System.out.println(inicio);
		

		rt.runFinalization();//.runFinalization() Com esse método ele finaliza todos os objetos e variaveis que foram carregados na memoria.
		rt.gc();//.gc() Com esse método ele força a execucao do garbage collector
		
		
		double fim = totalDisp - (rt.freeMemory()/MB);
		System.out.println("Inicio: "+inicio+" Fim: "+fim);
		
	}
}
 