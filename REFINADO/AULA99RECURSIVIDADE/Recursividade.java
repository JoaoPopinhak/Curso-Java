package REFINADO.AULA99RECURSIVIDADE;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {
	
	public static int soma(int x){
		if(x == 0) {
			return x;
		} else {
			System.out.println(x);
			return x += soma(x-1);
		}
	}
	
	
	/*2^2 = 4 // 3^4=*/
	public static int potencia(int x, int e){
		if(e == 1){
			System.out.println(x);
			return x;
		} else {
			int y = x * potencia(x, e-1);
			System.out.println(y);
			return y;
		}
	}
	
	public static void listar(Path paths) throws IOException{
		if(Files.isRegularFile(paths)){
			System.out.println(paths.toAbsolutePath());	
			
		} else {
			
			System.err.println(paths.toAbsolutePath());
			
			try(DirectoryStream<Path> stream = Files.newDirectoryStream(paths)){
				for (Path path : stream) {
					listar(path);
				}
			}catch(IOException e1) {}
		}
	}
	
	
	

	public static void main(String[] args) throws IOException{
		//System.out.println(soma(10));
		System.out.println(potencia(3,4));
		listar(Paths.get("E:/coisas aleatorias/DEV/Curso-Java-main/XTI"));
	}
}
