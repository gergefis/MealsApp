package api;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Api {
    private String args;
    
    public Api(/*String args*/) {
        this.args = "Saganaki"; //args
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }      
    
    //Public API:
    //http://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata
    //https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood
    

   public String callHttp(){
       
      String urlToCall = "https://www.themealdb.com/api/json/v1/1/search.php?s=" + args;
        String responseString = null;
        
        OkHttpClient client=new OkHttpClient();
        
        Request request = new Request.Builder().url(urlToCall).build();

        try (Response response = client.newCall(request).execute()) {
            if (response.isSuccessful() && response.body() != null) {
                 responseString = response.body().string();
                System.out.println(responseString);
            }
            
        }catch (IOException e) {
      e.printStackTrace();
        } 
        return responseString;
}
   
  
  public static void writeToFile(String responseString) {
    File f = new File("meals.pdf");

    try (FileWriter fileWriter = new FileWriter(f)) {
      fileWriter.write(responseString);
    } catch (IOException e) {
    } 
}
        
}