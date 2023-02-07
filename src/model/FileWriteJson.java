/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dimitris
 */
public class FileWriteJson {
    
     public void writeToFileJson(String responseString) {
    File f = new File("meals.pdf");

    try (FileWriter fileWriter = new FileWriter(f)) {
      fileWriter.write(responseString);
    } catch (IOException e) {
        e.printStackTrace();
    } 
}
    
}
