/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splashscreen;

import Model.Peserta;
import Retrofit.RetroClient;
import Retrofit.UjianOnlineApi;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * FXML Controller class
 *
 * @author ITD
 */
public class SplashscreenController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField email, pass;
    
    @FXML
    private Button btnReset, btnLogin;
    
    @FXML
    private RadioButton rbAdmin, rbPeserta;
    
    @FXML
    private void login(){
        System.out.println("Login");
        getPeserta();
//        String e = email.getText().toString();
//        String p = pass.getText().toString();
//        String role = "";
//        System.out.println(e);
//        System.out.println(p);
    }
    @FXML
    private void reset(){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {


        
    }
    
    public void getPeserta(){
        System.out.println("A");
        UjianOnlineApi api = RetroClient.getClient().create(UjianOnlineApi.class);
        System.out.println("B");
        Call<List<Peserta>> getdata = api.getPeserta();
        System.out.println("C");
        getdata.enqueue(new Callback<List<Peserta>>(){
            
            @Override
            public void onResponse(Call<List<Peserta>> call, Response<List<Peserta>> rspns) {
                System.out.println("Berhasil");
            }

            @Override
            public void onFailure(Call<List<Peserta>> call, Throwable thrwbl) {
                System.out.println("Gagal");
            }

        });
    }
    
}
