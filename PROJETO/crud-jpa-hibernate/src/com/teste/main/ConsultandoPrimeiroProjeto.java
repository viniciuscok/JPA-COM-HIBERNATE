package com.teste.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.teste.model.Cliente;

public class ConsultandoPrimeiroProjeto {

	public static void main(String[] args) 
	{
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente = em.find(Cliente.class, 1L);
		System.out.println("Nome: "+cliente.getNome());
		System.out.println("Idade: "+cliente.getIdade());
		System.out.println("Profissao: "+cliente.getProfissao());
		System.out.println("Sexo: "+cliente.getSexo());

	}

}
