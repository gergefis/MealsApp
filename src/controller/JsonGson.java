/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author dimitris
 */
import api.MealsJson;
import com.google.gson.Gson; 
import com.google.gson.GsonBuilder; 

public class JsonGson{ 
        
    public String gsonCall(String responseString) {
      String jsonString = responseString;
      
      
      // Με χρήση Design Pattern Builder
      GsonBuilder builder = new GsonBuilder(); 
      builder.setPrettyPrinting(); 
      Gson gson = builder.create(); 
      
      //Εγγραφή δεδομένων JSON
        MealsJson meals = gson.fromJson(jsonString, MealsJson.class);
//            System.out.println(meals);
      
    //read
            jsonString = gson.toJson(meals);
//      System.out.println(jsonString); 
      return jsonString;
    }
}


//   String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
//      
//      
//      // Με χρήση Design Pattern Builder
//      GsonBuilder builder = new GsonBuilder(); 
//      builder.setPrettyPrinting(); 
//      Gson gson = builder.create(); 
//      
//      
//      Student student = gson.fromJson(jsonString, Student.class); 
//      System.out.println(student);    
//      
//      jsonString = gson.toJson(student); 
//      System.out.println(jsonString);  
//   } 
//}
//
//class Student { 
//   private String name; 
//   private int age; 
//   public Student(){} 
//   
//   public String getName() { 
//      return name; 
//   }
//   
//   public void setName(String name) { 
//      this.name = name; 
//   } 
//   
//   public int getAge() { 
//      return age; 
//   }
//   
//   public void setAge(int age) { 
//      this.age = age; 
//   }
//   
//   public String toString() { 
//      return "Student [ name: "+name+", age: "+ age+ " ]"; 
//   }  
//}

