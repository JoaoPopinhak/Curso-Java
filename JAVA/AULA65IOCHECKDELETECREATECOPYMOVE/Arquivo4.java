package JAVA.AULA65IOCHECKDELETECREATECOPYMOVE;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\texto.txt");
		
		/* VALIDAÇÕES */
		
		System.out.println(Files.exists(path));//Metodo da classe files retorna V ou F se o caminho informado em 'path' existe
		System.out.println(Files.isDirectory(path));//Metodo retorna V ou F se o caminho é um diretorio
		System.out.println(Files.isRegularFile(path));//Metodo retorna V ou F se o caminho é de um arquivo regular exemplos arquivos regulares(Arquivo de texto, Imagens)
		System.out.println(Files.isReadable(path));//Metodo retorna V ou F se o arquivo pode ser lido pelo usuário da aplicação (envolve aplicações de acesso)
		System.out.println(Files.isExecutable(path));//Metodo retorna V ou F se o arquivo pode ser executado
		System.out.println(Files.size(path));//Metodo retorna tamanho do arquivo. Esse metodo em especifico precisa acessar o arquivo então é necessário lançar o IOException
		System.out.println(Files.getLastModifiedTime(path));//Metodo etorna a última vez que o arquivo foi modificado
		System.out.println(Files.getOwner(path));//Metodo retorna o nome do dono do arquivo ou seja neste caso o adm do PC
		System.out.println(Files.probeContentType(path));//Metodo retorna o tipo do arquivo informado em 'path'
		
		/* DELETE */
		
		Files.delete(path);//Metodo para deletar porem se tiver algo errado lança exception 
		Files.deleteIfExists(path);//Esse metodo para deletar só vai deletar se o arquivo ou diretório  realmente exisitir se não conseguir ele NÃO lança exception 
		
		/* CRIAÇÃO DE ARQUIVOS */
		
		Path path2 = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\texto2.txt");
		
		Files.createFile(path2);//Metodo createFile cria um arquivo ou diretório em branco, porém se digitar apenas create mostra várias outras opções de criações
		Files.write(path2, "Meu texto 2".getBytes());//Metodo escreve os bytes no arquivo onde a classe String tem o metodo getBytes
		
		/* COPIA DE ARQUIVO */
		
		Path copia = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\copiatexto2.txt");
		Files.copy(path2, copia, StandardCopyOption.REPLACE_EXISTING);//Metodo Copy copia o arquivo do primeiro caminho para o segundo parametro onde seria o camimho do arquivo de copia . Onde existe a opção 'StandardCopyOption.REPLACE_EXISTING' para subistituir o arquivo copia caso ele já exista
		
		
		 /* MOVE */
		
		
		Path mover = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\move\\copiatexto2.txt");
		Files.createDirectories(mover.getParent());//Criando o novo diretório 
		Files.move(copia, mover, StandardCopyOption.REPLACE_EXISTING);//No metodo 'move' no primeiro parametro é informado o caminho do arquivo que deseja mover e no segundo parametro é informado o caminho do destino do arquivo. Onde existe a opção 'StandardCopyOption.REPLACE_EXISTING' para subistituir o arquivo copia caso ele já exista

	}

}
