package barbearia.service;

import java.io.Serializable;
import java.util.List;

import barbearia.entity.Administrador;
import barbearia.persistence.AdministradorDAO;

public class AdministradorService implements Serializable {

	private static final long serialVersionUID = 1L;

	private AdministradorDAO dao;

	public AdministradorService() {
		dao = new AdministradorDAO();
	}

	public boolean save(Administrador a) {
		dao.save(a);
		return Boolean.TRUE;
	}
	
	public boolean update(Administrador a) {
		dao.update(a);
		return Boolean.TRUE;
	}
	
	public boolean delete(Administrador a) {
		dao.delete(a);
		return Boolean.TRUE;
	}

	public Administrador buscaId(Class<Administrador> administrador, Integer id) {
		return dao.findById(administrador, id);
	}
	
	public List<Administrador> buscaLogin(String login) {
		return dao.findByLogin(login);
	}
	
	public List<Administrador> busca() {
		return dao.findAll();
	}
}
