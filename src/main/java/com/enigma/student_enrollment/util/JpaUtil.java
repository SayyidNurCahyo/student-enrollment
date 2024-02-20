package com.enigma.student_enrollment.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final String PERSISTANCE_NAME = "com.enigma.student-enrollment";
    private static EntityManagerFactory emf;
    private static EntityManager em;
    private static void getEMF(){
        emf = Persistence.createEntityManagerFactory(PERSISTANCE_NAME);
    }
    public static EntityManager getEM(){
        if (emf==null){
            getEMF();
        }
        em = emf.createEntityManager();
        return em;
    }
    public static void shutdownEM(){
        if (em != null){
            em.close();
            em = null;
//            System.out.println("EM shutdown");
        }
    }
    public static void shutdownEMF(){
        if (emf != null){
            emf.close();
            emf = null;
//            System.out.println("EMF shutdown");
        }
    }
}
