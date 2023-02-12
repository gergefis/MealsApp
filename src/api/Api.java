package api;

import java.io.IOException;
import java.util.List;
import javax.persistence.Query;
import model.Meals;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import static service.DB.connect;
import static service.DB.em;

public class Api {

    private String args;
    private final String search = "search.php?s=";
    private final String filter = "filter.php?c=";

    public Api(/*String args*/) {
        this.args = "Seafood"; //args
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
    public String callHttp() {

      String urlToCall = "https://www.themealdb.com/api/json/v1/1/"+ search + args;
//        String urlToCall = "https://www.themealdb.com/api/json/v1/1/" + filter + args;
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
    
 public static void selectAll(){
            // Aνάκτησης δεδομένων από πίνακα
        connect();
        
        Query selectMeals = em.createNamedQuery("Meals.findAll", Meals.class);
//        ArrayList<Meals> mealList = new ArrayList<Meals>(selectMeals.getResultList());
        List<Meals> mealList = selectMeals.getResultList();
        for(Meals m : mealList) 
             m.print();
        }
}
