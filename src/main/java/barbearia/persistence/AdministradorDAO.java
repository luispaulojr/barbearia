package barbearia.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import barbearia.entity.Administrador;
import barbearia.util.JPAUtil;

public class AdministradorDAO {

	EntityManager manager;

	public AdministradorDAO() {
		manager = new JPAUtil().getEntityManager();
	}
	
	public void save(Administrador a) {
		manager.getTransaction().begin();
		manager.persist(a);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void update(Administrador a) {
		manager.getTransaction().begin();
		manager.merge(a);
		manager.getTransaction().commit();
		manager.close();
	}
	
	public void delete(Administrador a) {
		manager.getTransaction().begin();
		manager.remove(manager.find(a.getClass(), a.getId()));
		manager.getTransaction().commit();
		manager.close();
	}
	
	public Administrador findById(Class<Administrador> administrador, Integer id) {
		manager.getTransaction().begin();
		Administrador admin = manager.find(administrador, id);
		manager.close();
		return admin;
	}
	
	@SuppressWarnings("unchecked")
	public List<Administrador> findByLogin(String login) {
		manager.getTransaction().begin();
		Query query = manager
                .createQuery("select a from Administrador a where a.login = :pLogin");
		query.setParameter("pLogin", login);
		List<Administrador> administradores = query.getResultList();
		manager.close();
		return administradores;
	}
	
	@SuppressWarnings("unchecked")
	public List<Administrador> findAll() {
		manager.getTransaction().begin();
		Query query = manager
                .createQuery("select a from Administrador a");
		List<Administrador> administradores = query.getResultList();
		manager.close();
		return administradores;
	}
}
