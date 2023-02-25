/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.JsonGson;
import api.Api;
import api.CallCategory;
import api.CallMeal;
import controller.FileWriteJson;
import controller.Transaction;
import service.DB;


  /**
     * @param args the command line arguments
     */
     public class Test{
    public static void main(String[] args) {
        
      Api cMeal = new CallMeal();
      Api cCategory = new CallCategory();
      JsonGson gs = new JsonGson();
        Transaction tr = new Transaction();
        
      //Καταχωρούμε στη ματαβλητή τα δεδομένα του Json
        String responseString = cMeal.callHttp("test");
        String responseCategory = cCategory.callHttp("test");

        //Καταχωρούμε σε μεταβλητή τα μορφοποιημένα δεδομένα του Json
        //με το buildΔοκιμή αer design pattern
        String str = gs.gsonCall(responseString);
        System.out.println(str);
        
        //Καταχωρούμε σε μεταβλητή τα μορφοποιημένα δεδομένα του Json
        //με το buildΔοκιμή αer design pattern gia Category
        String str1 = gs.gsonCall(responseCategory);
        System.out.println(str1);
//        Εγγραφή δεδομένων σε pdf Αρχείο
        FileWriteJson fw = new FileWriteJson();
                fw.writeToFileJson(str);  
                fw.writeToFileJson(str1);  
                
//       BEGIN Δοκιμή να φέρω τις εγγραφές του πίνακα
        DB.checkDB();
//        DB.connect(); 
        cMeal.selectAll();
//        cMeal.selectByName();
        DB.close();
        
        tr.transport();
//        END Δοκιμή να φέρω τις εγγραφές του πίνακα
        }
}

