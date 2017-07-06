package service;

import java.sql.SQLException;

import barbearia.entity.Administrador;
import barbearia.persistence.AdminDAO;

public class AdminService {
	
	AdminDAO adm = new AdminDAO();
	
	public boolean save(Administrador A) {
		try {
			adm.save(A);
			return Boolean.TRUE;
		} catch (SQLException e) {
			e.printStackTrace();
			return Boolean.FALSE;
		}
	}

}
