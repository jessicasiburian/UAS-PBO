package Splashscreen;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author ITD
 */
public class SplashscreenController implements Initializable {

    @FXML
    private TextField email;

    @FXML
    private TextField pass;

    @FXML
    private RadioButton rbAdmin;

    @FXML
    private RadioButton rbPeserta;

    @FXML
    private Button btnReset;

    @FXML
    private Button btnLogin;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
