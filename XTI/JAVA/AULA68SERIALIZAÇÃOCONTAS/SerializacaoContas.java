package JAVA.AULA68SERIALIZAÇÃOCONTAS;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import POO.AULA36METODPARAM.Conta;

public class SerializacaoContas {


	public void escreverConta(ArrayList<Conta> lista) throws Exception{
		
		try(FileOutputStream fos = new FileOutputStream("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\contas.ser")){
			try(ObjectOutputStream oos = new ObjectOutputStream(fos)){	
				oos.writeObject(lista);//Ele pode ler todos os objetos apenas passando o ArrayList pois o a classe ArrayLista é serializadO
				
			}
		}
		
	}
	
	public ArrayList<Conta> lerConta() throws Exception{
		try(FileInputStream fis = new FileInputStream("E:\\coisas aleatorias\\DEV\\Curso-Java-main\\XTI\\files\\contas.ser")){
			try(ObjectInputStream ois = new ObjectInputStream(fis)){
				
				return (ArrayList<Conta>) ois.readObject();//Como ele recebe um ArrayList ele pode retornar uma ArrayList também	
			}	
		}
		
	}
	
	public static void main(String[] args) throws Exception{
		
		ArrayList<Conta> criarContas = new ArrayList<Conta>();
		criarContas.add(new Conta("João",1200));
		criarContas.add(new Conta("Maria",100));
		criarContas.add(new Conta("Zé",1));
		criarContas.add(new Conta("Antonio",10200));
		criarContas.add(new Conta("Marieli",12000));
		
		SerializacaoContas operacao = new SerializacaoContas();
		
		operacao.escreverConta(criarContas);
		
		ArrayList<Conta> contaRecebida = operacao.lerConta();
		
		for (Conta conta : contaRecebida) {
			conta.exibeSaldo();
		}

	}

}
