/////*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package mealsapp;
//
///**
// *
// * @author dimitris
// */
//import java.io.IOException;
//import okhttp3.OkHttpClient;
//import okhttp3.Request;
//import okhttp3.Response;
//
//import okhttp3.OkHttpClient;
//
//public class OkHTTPCall {
//    private String args = "saganaki";
//       
//        String urlToCall = "https://www.themealdb.com/api/json/v1/1/search.php?s="+ args;
//        
//        OkHttpClient client = new OkHttpClient();
//        
//        Request request = new Request.Builder().url(urlToCall).build();
//        
////Request request = new Request.Builder()
////  .url("https://www.themealdb.com/api/json/v1/1/search.php?s=")
////  .get(args)
////  .build();        
//
//        try (Response response = client.newCall(request).execute()) {
//            if (response.isSuccessful() && response.body() != null) {
//                String responseString=response.body().string();
//                System.out.println(responseString);
//            }
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }           
//
//    
//}