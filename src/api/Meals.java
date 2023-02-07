/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import controller.JsonGson;
import java.util.List;

/**
 *
 * @author dimitris
 */
public class Meals {
    List <MealsItems> meals;

    public Meals(List<MealsItems> items) {
        this.meals = items;
    }

    public Meals() {
    }

    public List<MealsItems> getItems() {
        return meals;
    }

    public void setItems(List<MealsItems> items) {
        this.meals = meals;
    }

    
    
}
