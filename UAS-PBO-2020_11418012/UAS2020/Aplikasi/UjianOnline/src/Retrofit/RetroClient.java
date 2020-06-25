/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retrofit;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 *
 * @author ASUS
 */
public class RetroClient {
    private static Retrofit retrofit;
    public static final String BASE_URL = "http://localhost:8080";
    
    public static Retrofit getClient(){
        System.out.println("Ini api");
        if(retrofit == null){
            System.out.println("P");
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            System.out.println("Q");
        }
        System.out.println("R");
        return  retrofit;
    }
}
