/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import java.util.List;

/**
 *
 * @author dimitris
 */
public class MealsJson {
    List <MealsItems> meals;

    public MealsJson(List<MealsItems> items) {
        this.meals = items;
    }

    public MealsJson() {
    }

    public List<MealsItems> getItems() {
        return meals;
    }

    public void setItems(List<MealsItems> items) {
        this.meals = items; // TODO: NA ΤΟ ΞΑΝΑ ΔΩ!!!! items ή Μeals?
    }

}
