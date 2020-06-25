package Peserta;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.Pane;


public class Dashboard implements Initializable {

    @FXML
    private TableColumn<?, ?> tblno;

    @FXML
    private TableColumn<?, ?> tblmatkul;

    @FXML
    private Button btnKuis;

    @FXML
    private Button btnAbout;

    @FXML
    private Button btnLogout;

    @FXML
    private LineChart<?, ?> linechart;
    
    @FXML
    private CategoryAxis x;

    @FXML
    private NumberAxis y;

    @FXML
    private PieChart pie;
    
    @FXML
    private Pane paneView;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadData();
        
        XYChart.Series S = new XYChart.Series<>();
        S.setName("PAM");
        S.getData().add(new XYChart.Data<>("1", 10));
        S.getData().add(new XYChart.Data<>("2", 20));
        S.getData().add(new XYChart.Data<>("3", 30));
        S.getData().add(new XYChart.Data<>("4", 40));
        S.getData().add(new XYChart.Data<>("5", 50));
        S.getData().add(new XYChart.Data<>("6", 60));
        S.getData().add(new XYChart.Data<>("7", 70));
        
        XYChart.Series S1 = new XYChart.Series<>();
        S.setName("PBO");
        S1.getData().add(new XYChart.Data<>("1", 15));
        S1.getData().add(new XYChart.Data<>("2", 25));
        S1.getData().add(new XYChart.Data<>("3", 35));
        S1.getData().add(new XYChart.Data<>("4", 45));
        S1.getData().add(new XYChart.Data<>("5", 55));
        S1.getData().add(new XYChart.Data<>("6", 65));
        S1.getData().add(new XYChart.Data<>("7", 75));
        
        XYChart.Series S2 = new XYChart.Series<>();
        S.setName("PROBSTAT");
        S2.getData().add(new XYChart.Data<>("1", 13));
        S2.getData().add(new XYChart.Data<>("2", 23));
        S2.getData().add(new XYChart.Data<>("3", 33));
        S2.getData().add(new XYChart.Data<>("4", 43));
        S2.getData().add(new XYChart.Data<>("5", 53));
        S2.getData().add(new XYChart.Data<>("6", 63));
        S2.getData().add(new XYChart.Data<>("7", 73));
        
        linechart.getData().addAll(S,S1,S2);
        
    }   
    
    private void loadData(){
        paneView.getChildren().clear();
        ObservableList<PieChart.Data> list=FXCollections.observableArrayList();
        list.add(new PieChart.Data("PBO", 10));
        list.add(new PieChart.Data("PAM", 20));
        list.add(new PieChart.Data("PROBSTAT", 30));
        PieChart minat = new PieChart(list);
        paneView.getChildren().add(minat);
    }
    
}
