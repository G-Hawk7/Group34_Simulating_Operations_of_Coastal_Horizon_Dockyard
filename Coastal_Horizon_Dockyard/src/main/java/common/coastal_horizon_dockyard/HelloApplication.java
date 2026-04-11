package common.coastal_horizon_dockyard;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Saif_2120462/ManagingDirector.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Managing Director Dashboard");
        stage.setScene(scene);
        stage.show();
    }
}
