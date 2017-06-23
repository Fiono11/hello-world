package org.academiadecodigo.bootcamp.bigproject;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by codecadet on 22/06/17.
 */
public class LoginController implements Initializable {

    private UserService userService;

    @FXML
    TextField codeCadetField;

    @FXML
    Button register;

    @FXML
    PasswordField passwordField;

    @FXML
    TextField emailField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        System.out.println("All view elements have been loaded");

        register.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                onRegister(event);
            }
        });}

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void onLogin(ActionEvent actionEvent) {

    }

    public void onRegister(MouseEvent mouseEvent) {
        System.out.println("Button clicked");
        System.out.println(codeCadetField.getText());
        System.out.println(passwordField.getText());
        userService.authenticate(codeCadetField.getText(), passwordField.getText());
        User user = new User(codeCadetField.getText(), passwordField.getText(), emailField.getText());
        userService.addUser(user);
        System.out.println("Email of Fiono is " + userService.findByName("Fiono").getEmail());
    }


}
