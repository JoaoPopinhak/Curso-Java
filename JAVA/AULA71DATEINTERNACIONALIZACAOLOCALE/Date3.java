package JAVA.AULA71DATEINTERNACIONALIZACAOLOCALE;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Date3 {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		c.set(2001, Calendar.MARCH, 21);
		
		Date date = c.getTime();
		
		Locale padrao = Locale.getDefault();// Essa classe tem o metodo 'getDefault()' onde recupera a configuração do computador para atribuir a melhor versão para apresnetar datas
		
		
		/*
		 *Você pode criar um objeto do tipo Locale se você souber os códigos para língua e o país da localização.
		 *Os códigos são especificado pelo (ISO 639) para língua e (ISO 3166) para país.
		 *Você pode realizar uma pesquisa para localizar a lista de códigos para cada região
		 */
		
		Locale brasil = new Locale("pt","BR");
		
		Locale india = new Locale("hi","IN");
		
		Locale usa = Locale.US;//Também existem países que já tem objetos costante para o país como neste exemplo
		
		Locale japan = Locale.JAPAN;
		
		Locale italia = Locale.ITALY;
		
		/**/
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL, india);//Onde você pode configurar dentro do paraemtro de config do DateFormat
		
		System.out.println(f.format(date));

		/**/
        f = DateFormat.getDateInstance(DateFormat.FULL);//Ate aqui já vimos nas aulas passadas. O formato trás para pt BR por default(Sem config)
		
        System.out.println(f.format(date));
        
        /**/
        f = DateFormat.getDateInstance(DateFormat.FULL,usa);
		
        System.out.println(f.format(date));
        
        /**/
        f = DateFormat.getDateInstance(DateFormat.FULL,japan);
		
        System.out.println(f.format(date));
        
        /**/
        f = DateFormat.getDateInstance(DateFormat.FULL,italia);
		
        System.out.println(f.format(date));
		
		
		
		
		
		
	}
}
