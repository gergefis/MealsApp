/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dimitris
 */
public class MealsJson {
    ArrayList <MealsItems> meals;

    public MealsJson(ArrayList<MealsItems> items) {
        this.meals = items;
    }

    public MealsJson() {
    }

    public ArrayList<MealsItems> getMeals() {
        return meals;
    }

    public void setMeals(ArrayList<MealsItems> items) {
        this.meals = items; // TODO: NA ΤΟ ΞΑΝΑ ΔΩ!!!! items ή Μeals?
    }

}
