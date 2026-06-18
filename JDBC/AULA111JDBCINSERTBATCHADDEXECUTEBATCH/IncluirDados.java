package JDBC.AULA111JDBCINSERTBATCHADDEXECUTEBATCH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class IncluirDados {

	public static void main(String[] args) throws SQLException {
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String sql ="insert into pessoa values (?,?,?,?)";
		String[] pessoas = {"Sandra","Beatriz","Fátima","Juliana","Tereza"};
		
		try(Connection con = DriverManager.getConnection(url,"c##xti","123")){
			try(PreparedStatement stm =con.prepareStatement(sql)){
				for (int i = 0; i < pessoas.length; i++) {
					stm.setInt(1, i+4);// '.setInt(coluna, valor)' '.setString(coluna, valor)' Com esse método setamos a coluna e o valor que desejamos.
					stm.setString(2, pessoas[i]);
					stm.setString(3, "F");
					stm.setString(4, pessoas[i].toLowerCase() + "@hotmail.com");
					
					/*Quando precisarmos executar várias requisições(updates) ao mesmo tempo é necessário adicionar a um conjunto de requisições
					 *para serem executadas de uma unica vez. Para realizar esse processo utilizamos o método .addBatch()
					 *Esse metódo inclui a instrução SQL. Com os valores setados dentro do FOR. Em um bloco de excução pendentes. 
					 *E no final quando todas as intruções terem sidos executadas é necessário executar o método .executeBatch()*/
					stm.addBatch();	
					
				}stm.executeBatch();	
			} catch(Exception e) {}
			
			sql = "select nome, email from pessoa";
			
			try(PreparedStatement stm2 =con.prepareStatement(sql);
				ResultSet rs = stm2.executeQuery()){
				while(rs.next()) {
					System.out.println(rs.getString(1) + " : " +rs.getString(2));
				}
			}
			
			
		}
	}
}
