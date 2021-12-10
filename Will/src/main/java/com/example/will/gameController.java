package com.example.will;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class gameController implements Initializable{
    //private Scene
    @FXML
    private ImageView hero;

    @FXML
    private ImageView pause_button;

    @FXML
    private Button mainmenu_button;

    @FXML
    private Button resume_button;

    @FXML
    private Button save_button;

    @FXML
    void mainmenu(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main_menu.fxml"));
        Parent root = fxmlLoader.load();
        HelloController controller = fxmlLoader.getController();
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        stage.setTitle("level");
        stage.setScene(scene);
    }

    @FXML
    void resume(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) {

    }

    @FXML
    void pause_game(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pause_menu.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("pause_menu");
        stage.setScene(scene);

    }

    public void jump(KeyEvent event) {
//        System.out.printf("level");
//        TranslateTransition translate = new TranslateTransition();
//        translate.setNode(hero);
//        translate.setDuration(Duration.millis(250));
//        translate.setCycleCount(TranslateTransition.INDEFINITE);
//        translate.setByY(-100);
//        translate.setAutoReverse(true);
//        translate.play();

        Timeline timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        KeyValue kv = new KeyValue(hero.xProperty(), 300);
        KeyFrame kf = new KeyFrame(Duration.millis(1500), kv);
        timeline.getKeyFrames().add(kf);
        timeline.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
