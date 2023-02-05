package mealsapp.test;


import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OkHTTPTest {
    private String args = "Saganaki";

    public OkHTTPTest() {
    }
    
    

   public void callHttp(){
      String urlToCall = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + args;
        
        OkHttpClient client=new OkHttpClient();
        
        Request request = new Request.Builder().url(urlToCall).build();
        
        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                String responseString=response.body().string();
                System.out.println(responseString);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        } 
}

}