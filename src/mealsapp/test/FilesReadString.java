/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mealsapp.test;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dimitris
 */
public class FilesReadString {
    
    
    public void writeToFile(){
    try(FileWriter fw = new FileWriter("object.json")){
    //String json = new Json();
}catch(IOException e){
e.printStackTrace();
        }
    }
    
}
