package com.biblioteca.servlet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.biblioteca.servlet.User;

public class UserDAO {
    
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("examplePU");

    public void save(User user) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }
}
