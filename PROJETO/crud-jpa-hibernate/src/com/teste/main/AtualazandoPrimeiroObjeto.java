package com.teste.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.teste.model.Cliente;

public class AtualazandoPrimeiroObjeto {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1L);
		em.getTransaction().begin();
		cliente.setNome("teste");
		cliente.setIdade(30);
		em.getTransaction().commit();
		
		System.out.println("Cliente atualizado com sucesso");

	}

}