package barbearia.test;

import javax.persistence.EntityManager;

import barbearia.entity.Administrador;
import barbearia.util.JPAUtil;

public class PopulaConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		manager.getTransaction().begin();

		Administrador admin = new Administrador();

		admin.setLogin("lpjr");
		admin.setSenha("123");
		
		manager.persist(admin);

		manager.getTransaction().commit();

		manager.close();

	}
}
