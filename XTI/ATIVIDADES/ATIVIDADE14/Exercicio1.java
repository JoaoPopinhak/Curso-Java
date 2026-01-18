package ATIVIDADES.ATIVIDADE14;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Exercicio1 {

	public void escritaFraseFile(String frase) throws Exception{
		Path path = Paths.get("E:/coisas aleatorias/DEV/Curso-Java-main/XTI/ATIVIDADES/filesAtividade/exercisio1.txt");
		Charset utf8 = StandardCharsets.UTF_8;

		try(BufferedWriter writer= Files.newBufferedWriter(path, utf8,StandardOpenOption.CREATE,StandardOpenOption.APPEND)){//StandardOpenOption.CREATE,StandardOpenOption.APPEND Esses são configurações para criar uma nova linha caso já exista
			
			if(Files.exists(path) == false){
				Files.createDirectories(path.getParent());
			}
			
			writer.write(frase);
			
			System.out.println("Arquivo salvo com sucesso!");
		}catch(IOException e1){
			e1.printStackTrace();
		}
	}
	
	public byte[] leituraFraseFile()throws Exception{
		Path path = Paths.get("E:/coisas aleatorias/DEV/Curso-Java-main/XTI/ATIVIDADES/filesAtividade/exercisio1.txt");
		
		byte[] bytesFraseIn = Files.readAllBytes(path);
		
		return bytesFraseIn;
	}
	
	public void copiaFrase() throws Exception{
		Path  pathOrigem= Paths.get("E:/coisas aleatorias/DEV/Curso-Java-main/XTI/ATIVIDADES/filesAtividade/exercisio1.txt");
		Path pathDestino = Paths.get("E:/coisas aleatorias/DEV/Curso-Java-main/XTI/ATIVIDADES/filesAtividade/exercisio1Copia.txt");
	    Files.copy(pathOrigem, pathDestino);
	    
	    System.out.println("Copia Realizada");
	}
	

	
	public static void main(String[] args) throws Exception {

		Exercicio1 op = new Exercicio1();
		Scanner scan = new Scanner(System.in);
		
		byte[]byteReturn = op.leituraFraseFile();

		for(int i = 0; i <=3; i++){
			System.out.println("Digite uma frase");
			String frase= scan.nextLine();
			
			op.escritaFraseFile(frase+"\n");	
		}
		
		System.out.print(new String(byteReturn));
		
		op.copiaFrase();
		
		scan.close();
	}

}
