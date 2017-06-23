package org.academiadecodigo.bootcamp.bigproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Created by codecadet on 22/06/17.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view/login.fxml"));
        GridPane root = fxmlLoader.load();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.show();
        MockUserService mockUserService = new MockUserService();

        ((LoginController) fxmlLoader.getController()).setUserService(mockUserService);

    }

    public void init() {
        User user = new User("Fiono", "123", "ruipedromorais11@gmail.com");
    }
}
