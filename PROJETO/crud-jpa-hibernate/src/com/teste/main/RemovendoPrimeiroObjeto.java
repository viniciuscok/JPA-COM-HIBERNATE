package com.teste.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.teste.model.Cliente;

public class RemovendoPrimeiroObjeto {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		//não conseguir apagar pq está vinculada a uma constraint do banco de dados
		Cliente cliente = em.find(Cliente.class, 1L);
		em.getTransaction().begin();
		em.remove(cliente);
		em.getTransaction().commit();
		
		System.out.println("Cliente deletado com Sucesso");

	}

}
