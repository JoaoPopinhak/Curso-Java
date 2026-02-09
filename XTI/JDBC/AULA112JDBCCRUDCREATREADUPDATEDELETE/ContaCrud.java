package JDBC.AULA112JDBCCRUDCREATREADUPDATEDELETE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContaCrud {
	
	public void criarConta(Connection conexao, Conta conta) throws SQLException{
		String sql = "insert into conta values (?,?,?)";
		try(PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.setInt(1, conta.numero);
			stm.setString(2, conta.nomeCliente);
			stm.setDouble(3, conta.saldoConta);
			stm.executeUpdate();
		}
	}
	
	public List<Conta> ler(Connection conexao) throws Exception{
		List<Conta> lista = new ArrayList<>();
		String sql = "select numero,cliente,saldo from conta";
		try(PreparedStatement stm = conexao.prepareStatement(sql);   ResultSet rs = stm.executeQuery()){
			while(rs.next()) {
				lista.add(new Conta(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}
		return lista;
	}
	
	
	public void alterarConta(Connection conexao, Conta conta) throws SQLException {	
		String sql = "update conta set cliente=?, saldo=? where numero=?";
		try(PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.setString(1, conta.nomeCliente);
			stm.setDouble(2, conta.saldoConta);
			stm.setInt(3, conta.numero);
			
			stm.executeUpdate();
		}	
	}
	
	
	public void delete(Connection conexao, Conta conta) throws SQLException {
		String sql = "delete conta where numero=?";
		try(PreparedStatement stm = conexao.prepareStatement(sql)){
			stm.setInt(1, conta.numero);
			
			stm.executeUpdate();
		}
	}
	
	public void transferir(Connection conexao, Conta contaOrigem, Conta contaDestino, double valor) throws SQLException{
		if(contaOrigem.saldoConta >= valor){
			try {
				conexao.setAutoCommit(false); 
				/*A conexão trata as operações em conjunto. Quando finalizar as operações e ambas terem sido bem sucessidas 
				precisamos confirmar a transição chamando o metodo .commit()*/
				
				/*Saque*/
				
				contaOrigem.saldoConta -= valor;
				alterarConta(conexao, contaOrigem);
				
				/*Deposito*/
				
				contaDestino.saldoConta += valor;
				alterarConta(conexao, contaDestino);
				
				conexao.commit();
			} catch(Exception e1) {
				conexao.rollback();//Com o método .rollback() desfaz todas as operações a partir do comando setAutoCommit(false); Incluimos no catch pois se houver qualquer erro deve anular as operações
			}

		}
	}
	
	

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		try(Connection conexao = DriverManager.getConnection(url,"c##xti", "123")){
			
			ContaCrud crud = new ContaCrud();
			
			Conta conta1 = new Conta(1, "João Marcos",500000);
			Conta conta2 = new Conta(2, "João",230);
			Conta conta3 = new Conta(3, "Marcos",50.15);
			/*
			crud.criarConta(conexao, conta1);
			crud.criarConta(conexao, conta2);
			crud.criarConta(conexao, conta3);
			*/
			
			List<Conta> contas = crud.ler(conexao);
			
			for (Conta conta : contas) {
				System.out.println(conta);
			}
			
			conta1.saldoConta = 9000;
			conta1.nomeCliente = "Popinhak";
			
			crud.alterarConta(conexao, conta1);
		
			crud.delete(conexao, conta3);

			crud.transferir(conexao, contas.get(0), contas.get(1), 250);

		}
	}

}
