package fr.digi.cda2024;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnexionJpa {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa");
        EntityManager em = emf.createEntityManager();
        System.out.println(em);

        // évite les memory leaks.
        em.close();
        emf.close();
    }
}