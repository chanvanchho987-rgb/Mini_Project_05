import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create an instance of the LoginScreen and show it
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}