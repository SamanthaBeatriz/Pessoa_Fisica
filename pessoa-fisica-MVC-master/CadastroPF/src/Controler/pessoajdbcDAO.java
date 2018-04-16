package Controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.PessoaFisica2;

public class pessoajdbcDAO {
 private Connection conn;
 
 public pessoajdbcDAO(Connection connection) {
	 this.conn = connection;
 }
 
 public void salvar(PessoaFisica2 c) throws SQLException{
	 String sql = "insert into pessoa (nome, endereco,bairro,cep,cidade,telefone,celular,rg,cpf,sexo,estado) values ('"+c.getNome()+"','"
				+c.getEndereco()+"','"+c.getBairro()+"','"+c.getCep()+"','"+c.getCidade()+"','"+c.getTelefone()+"','"+c.getCelular()+"','"+c.getRg()+
				"','"+c.getCpf()+"','"+c.getSexo()+"','"+c.getEstado() +"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
		prepareStatement.close();
 }
 public void mostrar() throws SQLException{
	 String sql = "select * from pessoa";
	 PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
	 prepareStatement.executeQuery(sql);
	 prepareStatement.getResultSet();
	 System.out.println(prepareStatement);
	prepareStatement.close();
		
 }
}
