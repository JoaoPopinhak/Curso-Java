package JAVA.AULA63IOHIERARQUIABUFFERTRYCLOSABLEINTERFACE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\texto.txt");
		
		Charset utf8 = StandardCharsets.UTF_8;//Tipo de charset. A codificação do arquivo.
		
		BufferedWriter w = Files.newBufferedWriter(path, utf8);//No metodo da classe Files newBufferedWriter(Caminho, Tipo de codificação) ele recebe um caminho(tipo path) e uma codificação do tipo Charset onde o objeto criado é do tipo BufferedWriter
		
		/*O objeto do tipo BufferedWriter tem o metodo write onde é possível escrever quantas vezes quiser pois mantém o arquivo
		 *aberto, diferente da aula passada onde só escrevia somente uma vez onde abria escrevia e fechava o arquivo.
		 *Esse processo desta aula é semelhante a ligação de um telefone onde foi feito a ligação para um determinado arquivo após realizar
		 *essa ligação é possível conversar(escrever) o quanto for necessário e ao final precisará desligar essa ligação.*/
		
		w.write("Texto");  
		w.write("Texto");
		w.write("Texto");
		
		/*Para gravar as linhas de strings existe o metodo flush().
		 *O que siginifca a palavra buffer de BufferedWrite? Buffer é um deposíto de dados na memoria do computador.
		 *Onde ele vai armazenando na memoria temporária todos os textos que é adicionado no arquivo e quando é chamado o metodo
		 *flush() ele recupera todos os textos que estão na memoria temporaria e grava no dico rigido (longo prazo).
		 *E no final após finalizar sua "chamada" é necessário desligar essa chamada utilizando o metodo close()*/
		
		w.flush();	
		w.close();
		
		
		/* MODELO TRADICIONAL DE ABERTURA UTLIZAÇÃO E FECHAMENTO DE UM BUFFEREDWRITER*/
		
		BufferedWriter we = null;
		try{
			we = Files.newBufferedWriter(path, utf8);
			we.write("Texto");  
			we.write("Texto");
			we.write("Texto");
			we.flush();	
			we.close();
		} catch (IOException e1){
			e1.printStackTrace();
			
		}finally{
			if(we != null) {
				we.close();
			}	
		}
		
		
		/*OUTRO EXEMPLO DE ESTRUTURA MAIS MODERNO */
		try(BufferedWriter w1 = Files.newBufferedWriter(path, utf8)){//É possível criar variaveis e objetos diratamenta no parametro do 'try'
			w1.write("Texto\n");  
			w1.write("Texto\n");
			w1.write("Texto\n");
		} catch (IOException e1){
			e1.printStackTrace();	
		}
		
		
		
		/* LEITURA */
		
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)){
			
			String line = null;
			
			while((line = reader.readLine()) != null ){//ReadLine le linha por linha
				System.out.println(line);	
			}
		}catch(IOException e1){
			e1.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
