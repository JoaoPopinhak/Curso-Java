package JAVA.AULA62IOPATHLEITURAESCRITA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		
		//Classe path foi introduzida no JAVA 7 anigamente era utilizada a classe FILE
		
		
		
		Path path = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\texto.txt");//A inicializaçaõ do objeto path permite a inclusão de um endereço(caminho)
		System.out.println(path.toAbsolutePath());//Esse metodo retorna o caminho absoluto do arquivo
		System.out.println(path.getParent());//Esse metodo retorna o arquivo "pai" desse arquivo ou seja o diretorio em que o arquivo está.
		System.out.println(path.getRoot());//Esse metodo retorna a raiz do sistema (do caminho informado em 'path')
		System.out.println(path.getFileName());//Esse metodo retorna o nome do arquivo
		
		
		/* CRIAÇÃO DE DIRETÓRIOS */
		
		Files.createDirectories(path.getParent());//Esse metodo cria o diretório (pasta);
		
		/* ESCREVER E LER ARQUIVOS */
		
		byte[] bytes = "Meu texto".getBytes();//Classe string tem o metodo getBytes que retorna um array de bytes de acordo com o que está escrito.
		Files.write(path, bytes);//O metodo write da classe Files CRIA O ARQUIVO (Caso não exista), LIMPA, ESCREVE DENTRO DO ARQUIVO
		
		
		byte[] retorno = Files.readAllBytes(path);//Esse metodo lê e retorna um conjunto de bytes de acordo com a informação que está no caminho 'path'
		System.out.println(new String(retorno));//Aqui criei um objeto string com o array retorno, para imprimir o conteúdo do arquivo.

	}
}
