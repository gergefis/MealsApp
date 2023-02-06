/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import controller.GsonTester;
import api.Api;

  /**
     * @param args the command line arguments
     */
     public class Main{
    public static void main(String[] args) {
      Api ok = new Api();
      GsonTester gs = new GsonTester();
        
      String responseString = ok.callHttp();
        ok.writeToFile(responseString);
      
        gs.gsonCall();
        }
}

