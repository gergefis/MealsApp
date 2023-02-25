package api;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import javax.swing.JTextField;
import model.Meals;
import static service.DB.connect;
import static service.DB.em;

public abstract class Api {

    private String input;
//    private final String search = "search.php?s=";
//    private final String filter = "filter.php?c=";

    public Api(/*String input*/) {
        //this.input = input; //"Seafood"
    }

    //Public API:
    //http://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata
    //https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood
    public abstract String callHttp(String searchQuery);
    
    public String getInput(){
//        connect();
//        try{
//        JTextField searchField = new JTextField();
//        String searchTerm = searchField.getText(); 
//        }catch(Exception e){
//            e.printStackTrace();
//        }
        return null;
    }
    
//παίρνουμε τα δεδομένα αναζήτησης γεύματος από τον χρήστη
    
    public static void selectAll(){
            // Aνάκτησης δεδομένων από πίνακα
        connect();
        
        Query selectMeals = em.createNamedQuery("Meals.findAll", Meals.class);
//        ArrayList<Meals> mealList = new ArrayList<Meals>(selectMeals.getResultList());
        List<Meals> mealList = selectMeals.getResultList();
        for(Meals m : mealList) 
             m.print();
        }
    
    
 
//    public static void selectByName(String strName){
//        try {
//            Query selectName = em.createNamedQuery("Meals.findByName", Meals.class);
//                selectName.setParameter("name", strName);
//                Meals mealsName = (Meals) selectName.getSingleResult();
//                   System.out.println(mealsName.getName() + ", " +
//                           mealsName.getArea());
//        } catch(NoResultException e){
//            System.out.println("No Result.");
//        }catch(NonUniqueResultException e){
//            System.out.println("Non Unique Result.");
//        }
//    }
    
    public static void selectByName(String strName){
        connect();
        try {
            
            Query selectName = em.createNamedQuery("Meals.findByName", Meals.class);
                selectName.setParameter("name", strName);
                Meals mealsName =  (Meals) selectName.getSingleResult();
//                   System.out.println(mealsName.getName());
        } catch(NoResultException e){
            System.out.println("No Result.");
        }catch(NonUniqueResultException e){
            System.out.println("Non Unique Result.");
        }
    }
}
