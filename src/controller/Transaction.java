/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import service.DB;

/**
 *
 * @author dimitris
 */
public class Transaction {
    DB em = new DB();
    
    public void transport(){
    
    DB.connect();
    
    
    // Έναρξη μιας δοσοληψίας 
    if(!DB.em.getTransaction().isActive())
       DB.em.getTransaction().begin();
    
//    Αλλαγές στη Βάση Δεδομένων


//    Τερματισμός Δοσοληψίας
    DB.em.getTransaction().commit();
    
    //Εντολή rollBack για Τερματισμό Δοσοληψίας
//    Σβήνει ότι αλλαγές έγιναν μέσα στη δοσοληψία
//    DB.em.getTransaction().rollback();
    }
    
}
