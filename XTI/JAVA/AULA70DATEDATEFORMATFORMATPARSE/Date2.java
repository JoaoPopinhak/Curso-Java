package JAVA.AULA70DATEDATEFORMATFORMATPARSE;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date2 {
	public static void main(String[] args) throws ParseException{
		
		Calendar c = Calendar.getInstance();
		c.set(2001, Calendar.MARCH, 21);
		Date date = c.getTime();
		
		
		/*
		 *Instaciar o tipo DateFormat
		 *getDateInstance utilizada para formatação de data (DIA,MES,ANO) 
		 *getTimeInstance utilizada para formatção de Hora Minuto Segundos 
		 *getDateTimeInstance utiliziada para formatar a data completa
		 */
		
		
		/* FORMATAÇÃO DE DATAS */
		
		DateFormat f = DateFormat.getDateInstance(); 
		
		String dateS = f.format(date);//Metodo f.format ele recebe pelo parametro um tipo Date e retorna uma String
		System.out.println(f.format(date));
		
		
		/* FORMATAÇÃO HORAS */
		
		f = DateFormat.getTimeInstance(); 
		System.out.println(f.format(date));
		
		
		
        /* FORMATAÇÃO DATAS E HORAS */
		
		f = DateFormat.getDateTimeInstance(); 
		System.out.println(f.format(date));
		
		
		
		/* ESTILOS DE FORMATAÇÃO podem ser definido por parametros*/
		
        f = DateFormat.getDateInstance(DateFormat.FULL); //Estilo  Completo (FULL) (quarta-feira, 21 de março de 2001)
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.LONG); //Estilo  Longo (LONG)(21 de março de 2001)
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.MEDIUM); //Estilo  Medio (MEDIUM)(21 de mar. de 2001)
		System.out.println(f.format(date));
		
		f = DateFormat.getDateInstance(DateFormat.SHORT); //Estilo  Curto (SHORT)(21/03/2001)
		System.out.println(f.format(date));

		
		/*FORMATAR UM STRING EM DATE*/
		
		Date date2 = f.parse("21/03/2005");//Com o metodo .parse(String) Ele recebe um texto e tentar converter para o tipo Date. Com esse metodo ele pode lancar uma Exception ParseException caso não seja possível converter
		System.out.println(date2);
		
		
		
		/* SimpleDateFormat */
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");//Ao criar o objeto SimpleDateFormat é possível inserir no construtor o formato da sua data
		
		System.out.println(sdf.format(date));//Onde na classe SimpleDateFormat você tem o metodo 'format'
		
		date2 = sdf.parse("21/03/2005");//Onde também tem na clsse SimpleDateFormat '.parse' para receber uma String e transformar em um tipo Date
		
		System.out.println(date2);
			
	}
}
