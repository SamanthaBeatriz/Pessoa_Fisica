package Controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	 Statement stms = conn.createStatement(); 
	 String sql = "select * from pessoa";
	 System.out.println(sql);
	 
	 try{
	        stms = this.conn.prepareStatement(sql);
	        ResultSet rs = stms.executeQuery(sql);
	        model.PessoaFisica2 contato  =new  model.PessoaFisica2();
	        while(rs.next()){
	           
	            contato.setNome(rs.getString("nome"));
	            contato.setEndereco(rs.getString("endereco"));
	            contato.setBairro(rs.getString("bairro"));
	            contato.setCep(rs.getString("cep"));
	            contato.setCidade(rs.getString("cidade"));
	            contato.setTelefone(rs.getString("telefone"));
	            contato.setCelular(rs.getString("celular"));
	            contato.setRg(rs.getString("rg")); 
	            contato.setCpf(rs.getString("cpf"));
	            char b[] = rs.getString("sexo").toCharArray();
	            contato.setSexo(b[0]);
	            System.out.println("=====================================================");
	           System.out.println(contato.getNome()+","+contato.getEndereco()+","+contato.getBairro() +","
	            +contato.getCep()+","+contato.getCidade()+","+contato.getTelefone()+","+contato.getCelular()
	           +","+contato.getRg()+","+contato.getCpf()+"  ");
	           System.out.println("=====================================================");
	        }
	        
	        }finally {
	 stms.close();
 }
}
 }
