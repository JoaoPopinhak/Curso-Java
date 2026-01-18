package JAVA.AULA64DesafioIOArmazenarContasemArquivoSequencial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import ATIVIDADES.ORETORNO.ATIVIDADE03.ContaBancaria;

public class Aula64Arquivo3 {
	
	
	public void salvarConta(ArrayList<ContaBancaria> lista) throws IOException{
		Path path = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		try(BufferedWriter w1 = Files.newBufferedWriter(path, utf8)){
			
			for(ContaBancaria conta : lista) {
				w1.write(conta.getTitular() + "_" + conta.getSaldo() + "\n");
			}	
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
	}
	
	
	public void lerConta(ArrayList<ContaBancaria> lista){
		Path path = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\contas.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		try(BufferedReader r1 = Files.newBufferedReader(path, utf8)){
			
			String line = null;
			
			while((line = r1.readLine()) != null){
				String[] tokens = line.split("_");
				
				lista.add(new ContaBancaria(tokens[0],Double.parseDouble(tokens[1])));
			}

		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
	

}
