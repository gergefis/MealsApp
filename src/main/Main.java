/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.JsonGson;
import api.Api;
import api.Meals;
import model.FileWriteJson;

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
        String str = gs.gsonCall(responseString);
        //System.out.println(str);
        
//        Εγγραφή δεδομένων σε JSON Αρχείο
        FileWriteJson fw = new FileWriteJson();
                fw.writeToFileJson(str);
        }
}

