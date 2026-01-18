package JAVA.AULA67SERIALIZAÇÃOTRANSIENT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import POO.AULA36METODPARAM.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {

		/*A serialização só pode ser feito em objetos serializaveis para sbabermos se o objeto pode ser seriualizado a classe do
		 *objeto precisa implementar a classe java.io.seralizable*/
		
		
		String[] nomes = {"Lucas" + "Carlos" + "João"};
		
		Conta conta1 = new Conta("Teste",127);
		Conta conta2 = new Conta("João",12700);
		
		/* ESCRITA DE OBJETO */
		
		FileOutputStream fos = new FileOutputStream("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\objeto.ser");//Classe FileOutputStream ela recebe o endereço do arquivo que será utilizada para escrita do objeto.Essa classe é utilizada para manipulção de arquivos em bytes 
		ObjectOutputStream oos = new ObjectOutputStream(fos);//Essa classe utiliza um FileOutputStram para realizar as operações de gravar objetos.
		oos.writeObject(conta1);//Após criar o objeto do tipo bjectOutputStream o objeto tem o metodo para gravar o objeto que você quiser no endereço.
		oos.writeObject(conta2);//Para salvar várias contas sempre chamar o metodo WriteObject 
		oos.close();//Após gravar o objeto você precisa fechar a conexão
		
		
		
		/* LEITURA DE OBJETOS */
		
		FileInputStream fis = new FileInputStream("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\objeto.ser");//Classe FileInputStream ela recebe o endereço do arquivo que será utilizada para eleitura do objeto. Essa classe é utilizada para manipulção de arquivos em bytes
		ObjectInputStream ois = new ObjectInputStream(fis);//ObjectInputStream Essa classe é utilizada para realizar as operações de leitura de objetos.
		Conta conta = (Conta) ois.readObject();//Estamos realizando a leitura do objeto que foi lido pelo 'ois' onde retorna o objeto lido
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		
		conta.exibeSaldo();
		c2.exibeSaldo();
		
		
		
		/*Só é serializado os atributos do objeto que não forem variveis da classe ou seja não forem 'static'.
		 *Também existe a possibilidade se desejar de não salvar o atributo(variavel) do objeto usando o 
		 *modificador 'transient' Um exemplo Normalmente é utilizado esse modificador quando é salvo o atributo senha
		 *Isso falando da classe do objeto*/
		
	}
}
