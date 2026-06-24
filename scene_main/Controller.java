package scene_main;


import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
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
    private ListView<String> listview;

    @FXML
    void on_create(ActionEvent event) throws IOException{

        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();

        var view_create = getClass().getResource("../scene_create/View.fxml");
        var controller_create = new scene_create.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_create);
        loader.setController(controller_create);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();


    }

    @FXML
    void on_delete(ActionEvent event) throws IOException{

        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();

        var view_delete = getClass().getResource("../scene_delete/View.fxml");
        var controller_delete = new scene_delete.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_delete);
        loader.setController(controller_delete);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
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
    void on_update(ActionEvent event) throws IOException{
        var node = (Node) event.getSource();
        var stage = (Stage) node.getScene().getWindow();
        
        var view_update = getClass().getResource("../scene_update/View.fxml");
        var controller_update = new scene_update.Controller();

        var loader = new FXMLLoader();
        loader.setLocation(view_update);
        loader.setController(controller_update);

        var scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void initialize() {
        

    }

}
