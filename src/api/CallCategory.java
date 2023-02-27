/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author dimitris
 */
public class CallCategory extends Api {

    String responseString;
//    public CallCategory(String input) {
//        super(input);
//    }

    @Override
    public String callHttp(String searchQuery) {
        try{
        String urlToCall = "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + searchQuery;
//        String urlToCall = searchQuery;
        

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(urlToCall).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null)
                responseString = response.body().string();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return responseString;
    }
}
