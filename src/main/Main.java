/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.JsonGson;
import api.Api;
import api.MealsJson;
import controller.FileWriteJson;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.Meals;
import service.DB;
import static service.DB.em;
import static service.DB.emf;

  /**
     * @param args the command line arguments
     */
     public class Main{
    public static void main(String[] args) {
        
      Api ok = new Api();
      JsonGson gs = new JsonGson();
        
      //Καταχωρούμε στη ματαβλητή τα δεδομένα του Json
        String responseString = ok.callHttp();

        //Καταχωρούμε σε μεταβλητή τα μορφοποιημένα δεδομένα του Json
        //με το buildΔοκιμή αer design pattern
        String str = gs.gsonCall(responseString);
        System.out.println(str);
        
//        Εγγραφή δεδομένων σε pdf Αρχείο
        FileWriteJson fw = new FileWriteJson();
                fw.writeToFileJson(str);  
                
//       BEGIN Δοκιμή να φέρω τις εγγραφές του πίνακα
        DB.checkDB();
//        DB.connect();
        ok.selectAll();
        DB.close();
//        END Δοκιμή να φέρω τις εγγραφές του πίνακα
        }
}

