/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Retrofit;

import Model.Peserta;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 *
 * @author ASUS
 */
public interface UjianOnlineApi {
    @GET("kuis")
    Call<String> getKuis();
    
    @GET("/peserta/")
    Call<List<Peserta>> getPeserta();
    
  
}
