/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package api;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 *
 * @author dimitris
 */
public class CallCategory extends Api {

//    public CallCategory(String input) {
//        super(input);
//    }

    @Override
    public String callHttp(String searchQuery) {

        String urlToCall = "https://www.themealdb.com/api/json/v1/1/filter.php?c=" + searchQuery;
        String responseString = null;

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder().url(urlToCall).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                responseString = response.body().string();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseString;
    }
    
}
