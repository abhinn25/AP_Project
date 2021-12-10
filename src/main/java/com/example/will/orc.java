package com.example.will;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class orc {

    private ImageView orc;
    orc(double x,double y, double jump ){
        orc = new ImageView();
        orc.setX(x);
        orc.setY(y);
        Image orc_icon = new Image("file:/C:/Users/abhin/IdeaProjects/Will/src/assets/Orc1.png");
        orc.setImage(orc_icon);
    }
}
