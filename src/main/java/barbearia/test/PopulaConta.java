package barbearia.test;

import barbearia.entity.Administrador;
import barbearia.service.AdminService;

public class PopulaConta {

	public static void main(String[] args) {

		Administrador admin1 = new Administrador();
		Administrador admin2 = new Administrador();
		Administrador admin3 = new Administrador();

//		admin.setId(1);
		admin1.setLogin("luispaulojr");
		admin1.setSenha("123");
		
		admin2.setLogin("lpjr");
		admin2.setSenha("123");

		admin3.setLogin("lpjunior");
		admin3.setSenha("123");
		AdminService as = new AdminService();
//		admin = as.busca(Administrador.class, admin.getId());
//		as.save(admin1);
//		as.save(admin2);
//		as.save(admin3);
//		System.out.println(admin.getLogin());
		as.busca().forEach(System.out::println);
	}
}