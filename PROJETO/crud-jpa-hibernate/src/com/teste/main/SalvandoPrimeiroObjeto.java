package com.teste.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.teste.model.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Pedro Bial");
		cliente.setIdade(40);
		cliente.setProfissao("advogado");
		cliente.setSexo("M");

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente salvo com sucesso");
	}

}
