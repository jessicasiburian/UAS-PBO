
package Administrator;

import java.awt.Button;
import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;


public class PendaftaranController implements Initializable {


    @FXML
    private TextField reg_email;

    @FXML
    private TextField reg_pass;

    @FXML
    private RadioButton role_admin;

    @FXML
    private RadioButton role_peserta;

    @FXML
    private Button btnBatal;

    @FXML
    private Button btnDaftar;

    @FXML
    private TableView<?> tabelDataPendaftar;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
