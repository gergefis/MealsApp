/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

/**
 *
 * @author dimitris
 */
public class Widget {
    private String strMeal ;
    private String strcategory ;
    private String strArea ;
    private String strInstructions ;

    public Widget(String strMeal, String strcategory, String strArea, String strInstructions) {
        this.strMeal = strMeal;
        this.strcategory = strcategory;
        this.strArea = strArea;
        this.strInstructions = strInstructions;
    }

    public String getStrMeal() {
        return strMeal;
    }

    public void setStrMeal(String strMeal) {
        this.strMeal = strMeal;
    }

    public String getStrcategory() {
        return strcategory;
    }

    public void setStrcategory(String strcategory) {
        this.strcategory = strcategory;
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
    
    
}
