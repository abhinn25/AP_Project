package com.example.will;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;
    @FXML
    private ListView<String> list_savedgames;

    String[] savedgames = {"Game1","Game2","Game3"};

    String currentGame;
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

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