
package Administrator;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;


public class DaftarSoalController implements Initializable {

   @FXML
    private TableColumn<?, ?> id_soal;

    @FXML
    private TableColumn<?, ?> tp_soal;

    @FXML
    private TableColumn<?, ?> tk_kesulitan;

    @FXML
    private TableColumn<?, ?> jawaban;

    @FXML
    private TableColumn<?, ?> pertanyaan;

    @FXML
    private TableColumn<?, ?> matkul;

    @FXML
    private TableColumn<?, ?> aksi;

    @FXML
    private Button btnDaftarSoal;

    @FXML
    private Button btnPendaftaran;

    @FXML
    private Button btnLogout;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
