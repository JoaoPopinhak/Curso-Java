package JAVA.AULA73MATH;

public class MathTeste {

	public static void main(String[] args) {
		
		/*A Classe MATH contém alguns Atributos Estáticose alguns metódos de Cálculo*/
		//Ex: Math.PI;
		
		
		System.out.println(Math.sin(10));//Math.sin() Neste exemplo estamos calculando o valor do Seno chamando o Metódo .sin() e informado no parametro o valor que desejamos calcular
		
		System.out.println(Math.cos(10));//Math.cos() Neste exemplo estamos calculando o valor do Coseno chamando o Metódo .cos() e informado no parametro o valor que desejamos calcular
		
		System.out.println(Math.tan(45));//Math.tan() Neste exemplo estamos calculando o valor da Tangente chamando o Metódo .tan() e informado no parametro o valor que desejamos calcular
		
		/*Existem vários método disponível na classe Math*/
		
		System.out.println(Math.pow(4, 2));//Math.pow(a, b) No metodo .pow(a,b) queremos calcular a potencia do número a sobre o valor b. Exemplo 4^2
		
		System.out.println(Math.sqrt(16));//Math.sqrt() No metodo .sqrt() calcula a raiz quadrada do número informado no parametro

		System.out.println(Math.cbrt(16));//Math.cbrt() No metodo .cbrt() Calcula a raiz cubica do número informado no parametro
		
		System.out.println(Math.hypot(6,8));//Math.hypot(a,b) no metodo .hypot(a,b) Você calcula a hiportenusa inserindo os valores necessário para esse calculo

	}
}
