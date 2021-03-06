package com.example.will;

import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class HelloController implements Initializable {

    gameController controller;
    Scene scene;
    @FXML
    private Button continue_button;

    @FXML
    private Button credits_button;

    @FXML
    private Button exit_button;

    @FXML
    private Button newgame_button;

    @FXML
    private Label welcomeText;

    @FXML
    private ListView<String> list_savedgames;

    String[] savedgames = {"Game1","Game2","Game3"};

    String currentGame;

    @FXML
    void continue_game(ActionEvent event) {

    }

    @FXML
    void exit(ActionEvent event) {


    }

    @FXML
    void show_credits(ActionEvent event) {
    }

    @FXML
    void start_new_game(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("game.fxml"));
        Parent root = fxmlLoader.load();
        controller = fxmlLoader.getController();
        scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setTitle("level");
        stage.setScene(scene);

        scene.setOnKeyPressed(event1 -> {

            if(event1.getCode()== KeyCode.SPACE){
                controller.jump(event1);

            }
        });
        stage.show();
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("level.fxml"));
//        Parent root = null;
//        try {
//            root = fxmlLoader.load();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        controller = fxmlLoader.getController();
//        scene = new Scene(root);



        list_savedgames.getItems().addAll(savedgames);

        list_savedgames.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

            @Override
            public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {

                currentGame = list_savedgames.getSelectionModel().getSelectedItem();
                System.out.println(currentGame);
            }
        });


    }




}