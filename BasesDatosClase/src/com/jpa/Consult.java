package com.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpa.Usuario;

public class Consult {
	private static final String PERSISTENCE_UNIT_NAME = "BaseDatosClase";
	private static EntityManagerFactory factory;
	EntityManager em;
	List<Usuario> todoList;

	public Consult() {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
	}

	@SuppressWarnings("unchecked")
	public List<Usuario> getBBDD() {

		Query q = em.createQuery("select t from Usuario t");

		todoList = q.getResultList();

		for (Usuario todo : todoList) {
			System.out.println(todo);

		}
		
		System.out.println("Size: " + todoList.size());

		return this.todoList;

	}

	public void setUser(int dni, String nombre, String mail, String contra) {

		em.getTransaction().begin();
		
		Usuario todo = new Usuario();
		
		todo.setDni(dni);
		todo.setContrasena(contra);
		todo.setMail(mail);
		todo.setNombre_usuario(nombre);
		
		em.persist(todo);
		em.getTransaction().commit();

		em.close();
	}
}