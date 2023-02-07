/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.JsonGson;
import api.Api;
import api.Meals;
import api.MealsItems;
import java.util.ArrayList;
import java.util.List;
import mealsapp.MealsAppMain;
import model.FileWriteJson;

  /**
     * @param args the command line arguments
     */
     public class Main{
    public static void main(String[] args) {
      Api ok = new Api();
      JsonGson gs = new JsonGson();
        
        String responseString = ok.callHttp();
        FileWriteJson fw = new FileWriteJson();
                fw.writeToFileJson(responseString);
      
               
        Meals str = gs.gsonCall(responseString);
        System.out.println(str);
        }
}

