/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author dimitris
 */

import com.google.gson.Gson; 
import com.google.gson.GsonBuilder; 
import com.google.gson.JsonObject;

public class JsonGson{ 

    public JsonObject gsonCall(String responseString) {
      // Με χρήση Design Pattern Builder
      GsonBuilder builder = new GsonBuilder(); 
      builder.setPrettyPrinting(); 
      Gson gson = builder.create(); 
      
      //Εγγραφή δεδομένων JSON
        JsonObject jsonObj = gson.fromJson(responseString, JsonObject.class);
        
      return jsonObj;
    }
    
}

