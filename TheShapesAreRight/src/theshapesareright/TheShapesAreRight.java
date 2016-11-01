/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theshapesareright;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;


/**
 *
 * @author abigail
 */
public class TheShapesAreRight extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        ObservableList<String> shapes = FXCollections.observableArrayList(
          "Circle", "Triangle", "Square", "Rectangle", "Diamond");
        ListView<String> Shapes = new ListView<String>(shapes);
        
        ObservableList<String> colors2 = FXCollections.observableArrayList(
          "Red", "Orange", "Yellow", "Green", "Blue", "Violet");
        ObservableList<String> colors = FXCollections.observableArrayList(
            "red", "orange", "yellow", "green", "blue", "violet");
        ListView<String> Colors = new ListView<String>(colors);
        
        class ColorRectCell extends ListCell<String> {
        @Override
        public void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            Rectangle rect = new Rectangle(100, 20);
            if (item != null) {
                rect.setFill(Color.web(item));
                setGraphic(rect);
            }
        }
        }
        
        Colors.setCellFactory(new Callback<ListView<String>, 
            ListCell<String>>() {
                @Override 
                public ListCell<String> call(ListView<String> list) {
                    return new ColorRectCell();
                }
            }
        );
        
        
        Button Go = new Button();
        Go.setText("GO");
        
        Button quit = new Button();
        quit.setText("Quit");
        
        AnchorPane anchorPane = new AnchorPane();
	anchorPane.setMinSize(500.0, 400.0);
        anchorPane.setMaxSize(500.0, 400.0);
        anchorPane.setPrefSize(500.0, 400.0);

	HBox InputBox = new HBox();
	InputBox.getStyleClass().add("graytheme");
        InputBox.setSpacing(40);
        InputBox.setPadding(new Insets(15, 15, 15, 15));
        
        InputBox.getChildren().add(Shapes);
        InputBox.getChildren().add(Colors);
        
        HBox ButtonBox = new HBox();
	ButtonBox.getStyleClass().add("graytheme");
        ButtonBox.setSpacing(20);
        ButtonBox.setPadding(new Insets(0, 15, 15, 15));
        
        ButtonBox.getChildren().add(quit);
        ButtonBox.getChildren().add(Go);
        
        GridPane root = new GridPane();
	root.getStyleClass().add("graytheme");
              
        root.add(anchorPane, 0, 0);
        root.add(InputBox, 0, 1);
        root.add(ButtonBox, 0, 2);
                
        Scene scene = new Scene(root, 500, 660);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
