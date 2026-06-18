package JAVA.AULA69DATECALENDAR;

import java.util.Calendar;
import java.util.Date;

public class Datas {

	public static void main(String[] args) {
		
		
		
		/* Data é a representação de um tempo.
		 * 01 de Janeiro de 1970 é o tempo 0 */
		
		System.out.println(System.currentTimeMillis());//System.currentTimeMillis() Retorna o tempo atual do computador em miliSegundos desde 01 de Janeiro de 1970
		
		Date agora = new Date();//Criando um objeto do tipo date. Retorna a data atual (Retorna uma data (SÁB JAN 11 00:00:01 BRT 2026)
		
		System.out.println(agora);
		
		Date dateAgoraMs= new Date(System.currentTimeMillis());//Outro metodo construtor é informando o tempo em mlissegundos utilizando o metodo System.currentTimeMillis() 
		Date dateMsInformado = new Date(1_000_000_000_000L);//Ou informando o tempo em 'ms' manualmente onde retornará a data equivalente do tempo informado em ms.(Retorna uma data (SÁB JAN 11 00:00:01 BRT 2026))
		
		System.out.println(dateMsInformado);
		
		
		/* MÉTODOS CLASSE DATE */
		
		dateMsInformado.getTime();//Retorna o tempo em 'ms'
		dateMsInformado.setTime(1_000_000_000_000L);//Você define o tempo em 'ms'
		dateMsInformado.compareTo(dateAgoraMs);//Compara a data dateMsInformado com dateAgoraMs retorna -1 (Se a data for menor), 0 (Se as datas foram iguais), 1 (Se a data for maior)

		
		/* Por que não utilizar os outros metodos da classe Date?
		 * Pois os metodos estão ultrapassados e logo serão removidos 
		 * Agora você utiliza os metodos da classe Calendar*/
		
		/* A classe Calendar não deve ser inicializada pois ela é uma classse abstrata */
		
		
		
		Calendar c = Calendar.getInstance();//Para iniciar uma istancia de calendar seria dessa forma, onde retorna o calendário gregoriano(GregorianCalendar). Existes outros tipos de contagem de calendário...
		
		c.set(2026, Calendar.FEBRUARY, 12);//Definindo a data ao calendário.
		
		System.out.println(c.getTime());//c.getTime da Classe Calendar retorna a data setada
		System.out.println(c.get(Calendar.YEAR));// O metodo get abre a possibilidade de escolher o que deseja recuperar da data. Neste exemplo foi utilizado.YEAR para retornar somente o ano
		System.out.println(c.get(Calendar.MONTH));//Neste caso haviamos informado no .set o mês de FEV porém o número que retornou foi 1. Neste metódo Janeiro = 0 e Dezembro = 11
		System.out.println(c.get(Calendar.DAY_OF_MONTH));//Para DIAS precisamos escolher o formato que desejamos que apareca o DIA pois pode ser o DAY_OF_WEEK Para dia da semana ou outras formatações que poderão ser utilizadas
		
		c.set(Calendar.YEAR, 2001);//No metodo set podemos escolher qual campo desejamos alterar da data. Inserindo o campo que desejamos alterar e o valor.
		c.set(Calendar.MONTH, Calendar.MARCH);//Para alterar o Mês pode ser dessa forma ou inserindo o valor que corresponde o Mês
		c.set(Calendar.DAY_OF_MONTH, 21);
		c.set(2001, 02, 25);
		System.out.println(c.getTime());
		
		
		/* Além dos metodos de recuperação 'get' e de definição 'set também possuímos os metódos para limpeza de campos*/
		
		c.clear(Calendar.SECOND); //Para limpar utiliza o metodo clear e o campo que deseja limpar 
		c.clear(Calendar.MINUTE);
		
		System.out.println(c.getTime());
		
		
		/* OUTRO METODO IMPORTANTE É ADICIONAR UMA UNIDADE EM CADA CAMPO EX: 21 + 1*/
		
		c.add(Calendar.DAY_OF_MONTH, 1);//No metodo .add(coluna, valor a acrescentar)
		c.add(Calendar.YEAR, 1);
		
		
		/*Com o mesmo metodo .add() também podemos diminuir unidades do calendário exemeplo -1 */
		c.add(Calendar.DAY_OF_MONTH, -1);//No metodo .add(coluna, valor a acrescentar ou diminuir)
		c.add(Calendar.YEAR, -1);
		
		System.out.println(c.getTime());
		
		
		
		
		
		/* ROLL */
		c.add(Calendar.DAY_OF_MONTH, 20);//No metodo .add(coluna, valor a acrescentar ou diminuir) se os dias completar os meses ele acrescenta o mais um mês(ano,seg...)Automaticamente
		c.roll(Calendar.DAY_OF_MONTH, 20);//Já no metodo roll ele contabiliza a quantidade de dias sem aumentar as outras unidades ao fechar o mês. Altera somente a unidade pricipal que deseja alterar
		
		System.out.println(c.getTime());
		
		
		
		/* Saudação com Bom dia, Boa tarde, ou Boa noite */
		
		Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);
		
		System.out.println(hora);
		
		if(hora > 07 && hora <= 12){
			System.out.println("Bom dia");
		}else if(hora > 12 && hora <= 18){
			System.out.println("Boa tarde");
		}else if(hora <= 07){
			System.out.println("Boa noite");
		}
		
		
	}
}
