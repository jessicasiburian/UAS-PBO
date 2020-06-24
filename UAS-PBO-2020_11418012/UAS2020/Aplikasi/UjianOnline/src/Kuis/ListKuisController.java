/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author ITD
 */
public class ListKuisController implements Initializable {

    @FXML
    private TableColumn<?, ?> tblidkuis;

    @FXML
    private TableColumn<?, ?> tglpelaksanaan;

    @FXML
    private TableColumn<?, ?> matkul;

    @FXML
    private TableColumn<?, ?> durasi;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
