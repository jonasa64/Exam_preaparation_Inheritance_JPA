/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exam_preaparation_inheritance_jpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Jonas
 */
public class Tester {
    
    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
      EntityManager em = emf.createEntityManager();
      
      Book book1 = new Book("Harry Potter", "J.K Rowling", 100.75);
      EBook book2 = new EBook("https://mofibo.com/dk", 5, "Harry Potter", "J.k Rowling", 70.00);
      PaperBook book3 = new PaperBook(5, true, "Harry Potter", "J.K Rowling", 150.00);
      
      try{
          em.getTransaction().begin();
          em.persist(book1);
          em.persist(book2);
          em.persist(book3);
          em.getTransaction().commit();
      } finally{
          em.close();
      }
      
    }
    
    
}
