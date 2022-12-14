package br.com.healthtrack.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.com.healthtrack.BO.Nutricao;

public class NutricaoDAO {
	public int add(Nutricao nut) {
		DAO dao = new DAO();
		try {
			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
			PreparedStatement stmt = dao.getConnetion().prepareStatement("INSERT INTO T_SHT_NUTRICAO VALUES (SQ_IDNUTRICAO.NEXTVAL,?,?,?,?,?,?)");
			stmt.setString(1,nut.getTipoRefeicao());
			stmt.setInt(2,nut.getQtdKcalDiarias());
//			stmt.setInt(3,nut.getQtdKcal());
			stmt.setDate(4,data);
			stmt.setString(5,nut.getDieta());
			stmt.setString(6,nut.getUsuarioUm().getCpf());
			return dao.ExecuteCommand(stmt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} return 0;
	} 
	
	// 
	public List<Nutricao> Getall() {
		// TODO Auto-generated method stub
		DAO dao = new DAO();
		List<Nutricao> listM = new ArrayList<Nutricao>();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnetion().prepareStatement("SELECT * FROM T_SHT_NUTRICAO");
			ResultSet result = null;
			result = dao.GetData(stmt);
			while (result.next()) {
				Nutricao nut = new Nutricao();
				nut.setTipoRefeicao(result.getString("DS_NUTRICAO"));
				nut.setQtdKcalDiarias(result.getInt("QTD_NUTRICAO"));
//				nut.setQtdKcal(result.getInt("QTD_CALORIAS"));
//				nut.setDtRefeicao(result.getDate("DT_REFEICAO"));
				nut.setDieta(result.getString("DS_DIETA"));
				nut.getUsuarioUm().setCpf(result.getString("T_SHT_USUARIO_NM_CPF"));
				listM.add(nut);
			}
			return listM;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Nutricao GetById(String id) {
		DAO dao = new DAO();
		PreparedStatement stmt;
		try {
			stmt = dao.getConnetion().prepareStatement("SELECT * FROM T_SHT_NUTRICAO WHERE T_SHT_USUARIO_NM_CPF = ?");
			stmt.setString(1, id);
			ResultSet result = null;
			result = dao.GetData(stmt);
			while (result.next()) {
				Nutricao m = new Nutricao();
				m.setTipoRefeicao(result.getString("DS_NUTRICAO"));
				m.setQtdKcalDiarias(result.getInt("QTD_NUTRICAO"));
//				m.setQtdKcal(result.getInt("QTD_CALORIAS"));
//				m.setDtRefeicao(result.getDate("DT_REFEICAO"));
				m.setDieta(result.getString("DS_DIETA"));
				m.getUsuarioUm().setCpf(result.getString("T_SHT_USUARIO_NM_CPF"));
				return m;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return null;
	}
	public int Delete(int id) {
		try {
			DAO dao = new DAO();
			PreparedStatement stmt = dao.getConnetion().prepareStatement("DELETE FROM T_SHT_NUTRICAO_NM_CPF WHERE ID_NUTRICAO = ?");
			stmt.setInt(1, id);
			return dao.ExecuteCommand(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return 0;
	}
	public int Update(Nutricao obj) {
		try {
			DAO dao = new DAO();
			PreparedStatement stmt = dao.getConnetion()
					.prepareStatement("UPDATE T_SHT_NUTRICAO SET DS_NUTRICAO = ? WHERE ID_NUTRICAO = ?");
			stmt.setString(1, obj.getTipoRefeicao());
			stmt.setInt(2, obj.getIdNutricao());
			return dao.ExecuteCommand(stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return 0;
	}
}