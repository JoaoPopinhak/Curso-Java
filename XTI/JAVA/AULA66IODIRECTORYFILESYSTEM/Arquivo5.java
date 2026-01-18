package JAVA.AULA66IODIRECTORYFILESYSTEM;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		
		/* LISTAR OS DIRETÓRIOS RAIZES */
		
		Iterable<Path> diretorios = FileSystems.getDefault().getRootDirectories();//getDefault() Retorna o FileSystem Default. getRootDirectories() consegue recuperar os diretorios raizes do computador
		for (Path path : diretorios) {
			System.out.println(path);
		}
		
		/* LISTAR O CONTEÚDO DE UM DIRETÓRIO */
		
		Path dir = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI");
		
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)/*Retorna um objeto do tipo DirectoryStream*/){
			
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}	
		} catch(IOException | DirectoryIteratorException e1) {
			e1.printStackTrace();
		}
		
		
		
		/**/
		
		FileSystem fs =FileSystems.getDefault();
		
		for(FileStore fileStore : fs.getFileStores()){//Retorna um Interable de FileStores. Interable é um objeto que vocÊ pode percorrer com for
			System.out.println("Unidade " + fileStore.toString());//Metodo retorna  nome e a unidade raiz
			System.out.println("Total espaço " + fileStore.getTotalSpace());//Metodo total space mostra o total de armazenamento em Bytes
			System.out.println("Total disponível " + fileStore.getUsableSpace());//Metodo retorna o espaço disponível em Bytes
			System.out.println("Utilizada " + (fileStore.getTotalSpace() - fileStore.getUsableSpace())+"\n"); //Esquema matematico utilizando com os metodos apresentados acima para mostrar o espaço utilizado
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
