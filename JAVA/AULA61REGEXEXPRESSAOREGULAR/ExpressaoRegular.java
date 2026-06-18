package JAVA.AULA61REGEXEXPRESSAOREGULAR;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String texto = "Java";
		
		boolean b = texto.matches(padrao);//o metodo matches retorna V ou F se o texto é igual ao padrão
		
		boolean bo = "Java".matches("Java");//Como será utilizado varias vezes construa dessa forma para economizar espaço
		
		System.out.println(bo);

		
		bo = "Java".matches("java");//Expressões regulares são sensiveis a letras maiusculas e minusculas ou seja se tiver diferença retornara falso
		
		System.out.println(bo);//testando linha de cima
		
		/*Para superar a sensbilidade de letras maisculas e minusculas precisaremos entender os modificadores*/
		
		/*
		 * MODIFICADORES EXPRESSÕES REGULARES
		 * (?i) Ignora maiúscula e minuscula
		 * (?x) Comentarios
		 * (?m) Multilinhas
		 * (?s) Dottal
		 */
		
		bo = "Java".matches("(?imxs)java");//Exemplo de como utilizar os modificadores de expressões. Pode utilizar mais de um modificador na mesma expressão
		System.out.println(bo);
		
		
		/*
		 * METACARACTERES (Realiza as validações de acordo com a tabela abaixo)
		 * (.)                    Qualquer caracter
		 * (\d) Dígitos           [0-9]
		 * (\D) Não é dígito      [^0-9]
		 * (\s) Espaços           [ \t\n\x0B\f\r]
		 * (\S) Não é espaços     [^\s]
		 * (\w) Letra             [a-zA-Z_0-9]
		 * (\W) Não é Letra
		 */
		
		bo = "@".matches(".");//Exemplo de como utilizar os METARACTERES para realizar as consultas inserindo no parametro do metodo matches retornando V ou F
		bo = "5".matches("\\d");
		
		bo = "PI".matches("..");
		bo = "PIE".matches("..."); //Conforme a necessidade de busca de caracter tem que inserir a mesma quantidade de expressão que está em busca para retornar V
		
		
		bo = "25".matches("\\d\\d");// O mesmo padrão para realizar as validações de MAIS caracteres server para outros METASCARACTERES
		System.out.println(bo);
		
		/*Com esse conteúdo já é possível criar uma validação de CEP*/
		
		
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d"; //Assim se criaria uma expressão regular para validação de CEP.		
		bo = "89520-000".matches(cep);
		System.out.println(bo);
		
		//Para escrever dessa forma a expressão regular se torna um pouco cansativo para isso pode se utilizar os QUANTIFICADORES tabela abaixo
		
		/*
		 * QUANTIFICADORES
		 * X{n}    X, exatamente 'n' vezes
		 * X{n, }  X, pelo menos 'n' vezes
		 * X{n, m} X, pelo menos 'n' vezes mas não mais do que 'm' vezes
		 * X?      X, 0 ou 1 vez
		 * X*      X, 0 ou + vezes
		 * X+      X, 1 ou + vezes
		 * */
		
		
		bo = "21".matches("\\d{2}");//Exemplos de como utilzar quantificadores para não precisar repetir os METACARACTERES varias vezes.
		
		bo = "213".matches("\\d{2,}");
		
		bo = "213".matches("\\d{2,3}");
		
		bo = "a".matches(".?");//Entre 0-1 vez
		
		bo = "a".matches(".*");//0 ou + vezes
		
		bo = "123456789".matches(".+");
		System.out.println(bo);
		
		
		//Realizando novamente a avalição do CEP utilizando QUANTIFICADORES
		
		cep = "\\d{5}-\\d{3}";//Dessa maneira foi criada um expressão regular para validar o CEP utilizando QUANTIFICADORES
		bo = "89520-000".matches(cep);
		System.out.println(bo);
		
		//Realizando uma validação de datas utilizando expressões regulares
		
		boolean data = "21/03/2001".matches("\\d{2}/\\d{2}/\\d{4}");
		System.out.println(data);
		
		/*
		 * METACARACTER DE FRONTEIRA
		 * ^ Inicia
		 * $ Finaliza
		 * | ou
		 */
		
		bo = "Pier".matches("^Pier.*");//Exemplo de como utilizar METACARACTER DE FRONTEIRA onde o inicio do texto precisa ser igual ao padrão informado no parametro 
		
		bo = "teste21".matches(".*21$");//Exemplo de como utilizar METACARACTER DE FRONTEIRA onde o final do texto precisa ser igual ao padrão informado no parametro
		
		bo = "tem java aqui".matches(".*java.*");
		
		bo = "tem java aqui".matches("^tem.*aqui$");
		
		bo = "não".matches("sim|não");
		
		
		/*
		 * AGRUPADORES
		 *[...]           Agrupamento
		 *[a-z]           Alcance
		 *[a-e][i-u]      União
		 *[a-z&&[aeiou]]  Interserseção
		 *[^abc]          Exeção de abc
		 *[a-z&&[^m-p]]   Subtração
		 *\X              Fuga literal
		 */
		
		
		
		bo = "X".matches("[a-z]");
		
		bo = "2".matches("[0-3]");
		
		bo = "True".matches("[tT]rue");//true ou True valida idependente da primeira letra ser T ou t
		
		bo = "Yes".matches("[tT]rue|[yY]es");
		
		bo = "Beatriz".matches("[A-Z][a-zA-Z]*");//Primeiro nome
		
		bo = "dlhod".matches("[^abc]lho");//As letras antes de "lho" não podem ser abc utilizando [^abc] porém devem conter "lho" no final
		
		bo = "crau".matches("cr[ae]u");//crau e creu 
		
		
		/*realizando validação de email*/
		
		bo = "joaomrpopinhak@gmail.com".matches(".{4,}@(hotmail|gmail|outlook)\\.com(\\.)?$");
		
		System.out.println(bo);
		
//--------------------------------------------------------------------------------------------------	
		
		
		
		
		//Como localizar e mostrar todas as ocorrencias da palavra doce
		
		
		/*Qual a diferença de usar essa classe ou fazer a validação direta na string
		 * 
		 *O metodo matches ao inserir sua REGEX no parametro ele vai fazer o trabalho de converter essa expressão em um algoritimo que consiga validar esse texto em tempo de execução
		 *
		 *A classe Pattern quando você pede para compilar essa expressão você fala "prepare essa REGEX que em breve irei utilizar" você prepara ela apenas uma vez para depois utilizar várias vezes.
		 *Se estiver fazendo um tipo de validação muitas vezes é muito mais performatico se utilizar a classe patern. Se estiver fazendo uma vlidação simples e pontual utilize o metodo String
		 */
		
		
		String doce = "Qual é o Doce mais doCe que o doce?";
		
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		
		while(matcher.find()){//metodo find ele retorna um boolean se ele encontrar a ocorrencia inserida no compile
			System.out.println(matcher.group());//O metodo group recupera a ocorrencia inseria no parametro do metodo compile 
		}
		
		
	
		/*SUBSTITUIÇÕES*/
		
		String r = doce.replaceAll("(?i)doce","DOCINHO");//Utilizando o modificador de strings agora utilizando expressões regulares REGEX
		
		System.out.println(r);
		
		
		
		
		
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "X");
						
		r = "Tabular este texto".replaceAll("\\s", "\t");
		
		
		
//----------------------------------------------------------------------------------		
		
		String url = "www.com.xti.com.br/cliente-2011.html";
		
		String re = "(www.com.xti.com.br)/(\\w{2,})-(\\d{4}).html";

		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		
		System.out.println(r);
		//http://www.com.xti.com.br/2011/clientes.jsp//Objetivo
		
		
/*Caso tiver mais dúvidas referente a Expressões regulares, professor recomendou a buscar por mais 
 *informações essa aula foi apenas a introdução de Expressões regulares*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
