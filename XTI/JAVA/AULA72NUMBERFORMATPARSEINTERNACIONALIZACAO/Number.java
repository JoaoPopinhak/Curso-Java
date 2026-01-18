package JAVA.AULA72NUMBERFORMATPARSEINTERNACIONALIZACAO;

import java.text.NumberFormat;
import java.util.Locale;

public class Number {

	public static void main(String[] args) throws Exception {
		
		
		double saldo = 250_456.789;
		
		/*NUM GENÉRICOS*/
		NumberFormat f = NumberFormat.getInstance();//NumberFormat também é uma classe abstrata por isso a construção é com o metodo .getInstance() neste caso com a formatação padrão (250.456,789)
		System.out.println(f.format(saldo));//f.format() recebe um  numero por parametro e retorna um numero formatado. Neste caso é a forma padrão do SO
		
		/*NUM INTEIROS*/
		f = NumberFormat.getIntegerInstance();//.getIntegerInstance() com esse metodo ele formata o número informado no parametro pae retorna um Numero Inteiro. Excluindo a parte fracionada (250.457)
		System.out.println(f.format(saldo));
		
		
		/*NUM PERCENTUAIS*/
		f = NumberFormat.getPercentInstance();//..getPercentInstance() com esse metodo ele formata o número informado no parametro e retorna um percentual (25%)
		System.out.println(f.format(0.25));
		
		
		/*NUM MOEDA*/
		
		f = NumberFormat.getCurrencyInstance();//.getCurrencyInstance() com esse outro metodo ele formata o Double para Inteiro. Excluindo a parte fracionada (R$ 250.456,79)
		System.out.println(f.format(saldo));
		
		
		/*AJUSTE CASAS DECIMAIS*/
		f.setMaximumFractionDigits(1);//Uma forma de manipular a casa decimais que irão apresentar é utilizando o Método .setMaximumFractionDigits(1) e informar no parametro as casas decimais que deseja apresentar
		System.out.println(f.format(saldo));
		
		
		/* (INTERNACIONALIZAÇÃO) A LOCALIZAÇÃO INTERFERE NA FORMATAÇÃO DESSES NÚMEROS PRINCIPALMENTE EM RELAÇÃO MOEDA */
		
		Locale usa = Locale.US;
		
		f = NumberFormat.getCurrencyInstance(usa);//Ao istanciar o objeto do tipo NumberFormat no metodo de formatação ex: .getCurrencyInstance(usa) você insere um tipo Locale no parametro para definir a formatação dos números da moeda de acordo com a localização que deseja
		System.out.println(f.format(saldo));
		
		
		f = NumberFormat.getCurrencyInstance(Locale.FRANCE);//Também é possível inserir de forma direta no parametro um pouco diferente do exemplo acima
		System.out.println(f.format(saldo));
		
		
		

		/*Conversão de valores*/
		NumberFormat s = NumberFormat.getCurrencyInstance();
		System.out.println(s.parse("R$\u00A01.100,25"));//No metodo .parse() recebe uma String por parametro e transforma em um valor Double. ('\u00A0' Espaço)

		
	}
}
