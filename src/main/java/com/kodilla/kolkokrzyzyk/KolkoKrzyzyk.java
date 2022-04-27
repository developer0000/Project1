//package com.kodilla.kolkokrzyzyk;
//
//import com.sun.javafx.geom.Rectangle;
//import javafx.application.Application;
//
//import javafx.scene.Group;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.image.Image;
//import javafx.scene.layout.*;
//import javafx.scene.paint.Color;
////import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//
////import java.awt.*;
//
//public class KolkoKrzyzyk extends Application {
//
//
//
//
//
//    private Image imageback = new Image("table1.png");
//
//    public static void main(String[] args) {
//          launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        //Group root = new Group();
//
//        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
//        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
//         Background background = new Background(backgroundImage);
//        //Rectangle r = new Rectangle(50,50,700,700);
//        //r.setFill(Color.BLUE);
//        GridPane grid = new GridPane();
//        grid.setBackground(background);
//        Scene scene = new Scene(grid, 1600, 900, Color.BLACK);
//
//        //Scene scene = new Scene(root, 800, 800, Color.BLACK);
//        //root.getChildren().add(r);
//        primaryStage.setTitle("TicTacToe");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//
//    }
//}
//
