package scene_main;


import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label label_status;

    @FXML
    private ListView<?> listview;

    @FXML
    void on_create(ActionEvent event) {

    }

    @FXML
    void on_delete(ActionEvent event) {

    }

    @FXML
    void on_read(ActionEvent event) throws IOException {
        var stage = (Stage) label_status.getScene().getWindow();
        var file_chooser = new FileChooser();
        var selected = file_chooser.showOpenDialog(stage);

        

        var data = new ArrayList<String>();
        for (var line : Files.readAllLines(selected.toPath())){
            data.add(line);
        }
        
        listview.getItems().addAll(data);
    }

    @FXML
    void on_update(ActionEvent event) {

    }

    @FXML
    void initialize() {
        // var data = new ArrayList<String>();
        // data.add("Durain");
        // data.add("Dragon Fruit");


        // listview.getItems().addAll(data);

    }

}
