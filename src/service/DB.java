/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Meals;



/**
 *cd
 * @author dimitris
 */
public class DB {
 private static final String UNIT_NAME = "MealsAppPU";
    public static EntityManagerFactory emf;
    public static EntityManager em;
    
    // Κάνει την σύνδεση στην βάση
    public static void connect() {
        // Δημιουργία EntityManager
        try {
            emf = Persistence.createEntityManagerFactory(UNIT_NAME);
            em = emf.createEntityManager();
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    // Κλείνει την σύνδεση στην βάση
    public static void close() {
        //Καταστροφή του EntityManager και μετά του EntityManagerFactory
        em.close();
        emf.close();
    }
    
    // Έλεγχος ότι μπορεί να γίνει σύνδεση με την βάση δεδομένων.
    // Επιστρέφει true αν η βάση δεδομένων λειτουργεί
    public static boolean checkDB() {
        try {
            connect();
            close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    
}
