package JDBC.AULA110JDBCDRIVERCONNECTIONSTATEMENTRESULTSET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AcessoBanco {

	public static void main(String[] args) throws Exception {
		

		String sql = "select codigo, nome, sexo, email from pessoa";
		
	
		/*(Protocolo de comunicação)'jdbc'(subprotocolo)'Oracle:thin'(Endereço IP ou nome do servidor)'@localhost' 
		 * ou '@127.0.01 (Porta TCP)'1521'(Nome do BD)'xe'(Express Edtion)
		 */
		
		/*Essa URL é própria do BD Oracle. Cada BD tem sua própria estrutura de URL
		 * DB2         jdbc:db2:servidor:porta/banco
		 * Oracle      jdbc:oracle:thin:@servidor:porta:banco
		 * PostgreSQL  jdbc:postgresql://servidor:porta/banco
		 * SQL Server  jdbc:sqlserver://servidor:porta;databaseName=banco
		 * MySQL       jdbc:mysql://servidor:porta/banco
		 * Java DB     jdbc:derby://servidor:porta/banco
		 * Sybase      jdbc:sybase:Tds:servidor:porta/banco
		 */
		
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		
		
		
		try(Connection con = DriverManager.getConnection(url,"c##xti","123");//'DriverManager.getConnection(URL, USER, SENHA)' Retorna um tipo Connection. É a nossa conexão com o BD
			PreparedStatement stm = con.prepareStatement(sql);//Você consegue um statement apartir da Conexão Utilizado para encaminhar requisições para o BD. Método .prepareStatement(comando SQL) retorna um tipo PreparedStatement
	
				/*Apartir do StateMent que "guarda" o comando SQL agora você poderá executar esse comando utilizando o método 
				 *.executeQuery() onde esse comando executa uma CONSULTA e retorna uma lista de valores do tipo ResultSet(Lista do resultado da QUERY). 
				 *Também existe o método .executeUpdate() onde esse método executa inclusão, uma alteração ou uma exclusão de dados*/
			ResultSet rs = stm.executeQuery()){
			
			/*Lembrando que no final cada um dos objetos precisam ser fechados Ex: rs.close() mas podemos utilizar o try() onde no final ele fecha automaticamente*/
			while(rs.next()){
				String s = rs.getString(1) +   // Campo 1 = codigo // Também posso informar o nome do campo
						rs.getString("nome") + // Campo nome = nome
						rs.getString(3) +      // Campo 3 = sexo
						rs.getString(4);       // Campo 4 = Email
				
				System.out.println(s);
			}
		}
	}
}
