/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

/**
 *
 * @author dimitris
 */
public class MealsItems{
    private int idMeal;
    private String strMeal;
    private String strCategory;
    private String strArea;
    private String strInstructions;

    public MealsItems(int id, String strMeal, String strCategory, String strArea, String strInstructions) {
        this.strMeal = strMeal;
        this.strCategory = strCategory;
        this.strArea = strArea;
        this.strInstructions = strInstructions;
    }

    public MealsItems() {
    }

    public int getIdMeal() {
        return idMeal;
    }

    public void setIdMeal(int idMeal) {
        this.idMeal = idMeal;
    }
    

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrArea() {
        return strArea;
    }

    public void setStrArea(String strArea) {
        this.strArea = strArea;
    }

    public String getStrInstructions() {
        return strInstructions;
    }

    public void setStrInstructions(String strInstructions) {
        this.strInstructions = strInstructions;
    }

    @Override
    public String toString() {
        return "MealsItems{" + "id=" +idMeal +
                ", strMeal=" + strMeal +
                ", strCategory=" +"\n"+
                strCategory +"\n"+
                ", strArea=" +"\n"+
                strArea +"\n"+
                ", strInstructions=" +"\n"+
                strInstructions + '}';
    }
}
