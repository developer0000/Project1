package com.kodilla.kolkokrzyzyk;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.*;

import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;



import static javafx.application.Application.launch;


public class TicTacToe extends Application{

    private Parent createContent() {

        Pane root = new Pane();
        root.setPrefSize(600, 600);
        for (int i=0;i<3;i++){

            for (int j = 0; j <3; j++) {
                Tile tile = new Tile();
                tile.setTranslateX(j * 200);
                tile.setTranslateY(i * 200);
                root.getChildren().add(tile);
            }
        }

        return root;
    }

    @Override
    public void start (Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    private class Tile extends StackPane {
        private Text text = new Text();
        public Tile() {
            Rectangle border = new Rectangle(200,200);
            border.setFill(null);
            border.setStroke(Color.BLACK);

            text.setFont(Font.font(72));
            setAlignment(Pos.CENTER);
            getChildren().addAll(border , text);
            setOnMouseClicked(event -> {
                if (event.getButton() == MouseButton.PRIMARY) {
                    drawX();
                }
                else if (event.getButton() == MouseButton.SECONDARY){
                    drawO();
                }
            });
        }


        private void drawX()  {
            text.setText("X");

        }

        private void drawO() {
            text.setText("O");
        }
    }



        public static void main(String[] args) {
            launch(args);
        }

    }



