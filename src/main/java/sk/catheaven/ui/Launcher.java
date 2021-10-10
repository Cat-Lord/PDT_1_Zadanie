package sk.catheaven.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sk.catheaven.main.Main;

public class Launcher extends Application {
    private static final Logger log = LogManager.getLogger();

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.initProperties();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/main.fxml"));
        Parent layout = loader.load();
        Scene scene = new Scene(layout);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Theories week-by-week");
        primaryStage.show();
    }
}
