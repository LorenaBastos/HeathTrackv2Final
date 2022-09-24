package br.com.healthtrack.DAO;

import br.com.healthtrack.BO.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
		
		public int add(Usuario u1) {
			DAO dao = new DAO();
			try {
				PreparedStatement stmt = dao.getConnetion().prepareStatement("INSERT INTO T_SHT_USER VALUES (?,?,?,?,?,?)");
				stmt.setString(1,u1.getCpf());
				stmt.setString(2,u1.getNome());
				stmt.setString(3,u1.getDataNascimento());
				stmt.setString(4,u1.getEmailLogin());
				stmt.setString(5,u1.getGenero());
				stmt.setString(6,u1.getSenha());
				return dao.ExecuteCommand(stmt);
			} catch (SQLException e) {
				e.printStackTrace();
			} return 0;
		}
		 
		    
		       	public boolean verificaUsuario(Usuario ul){
		       	DAO dao = new DAO();
		        if(ul.getNome()!=null && ul.getSenha()!=null)
		        {
		            try
		            {
		             PreparedStatement stmt = dao.getConnetion().prepareStatement("SELECT * FROM T_SHT_USER WHERE NOME = ? and SENHA = ?;");
		             stmt.setString(1, ul.getNome());
		             stmt.setString(2, ul.getSenha());
		             ResultSet rs=stmt.executeQuery();
		             if(rs.next()) //Existe o usuário no banco de dados
		             {
		                   rs.close();
		                   stmt.close();
		                   return true;
		             } // Não existe o usuário
		             rs.close();
		             stmt.close();
		             return false;
		            }
		            catch (SQLException e) 
		        {return false;}

		        }
		        return false;

		    }
		    
		}
        
