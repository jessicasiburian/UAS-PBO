/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Splashscreen;

import Model.Peserta;
import Retrofit.RetroClient;
import Retrofit.UjianOnlineApi;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 *
 * @author ITD
 */
public class UjianOnline extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Splashscreen.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    

    
}
