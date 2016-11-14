/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package theshapesareright;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
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
          "Circle", "Oval", "Triangle", "Square", "Rectangle", "Diamond");
        ListView<String> Shapes = new ListView<String>(shapes);
        Shapes.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Shapes.setPrefWidth(150);
        
        //rectangles
        Rectangle r1 = new Rectangle();
        r1.setX(50);
        r1.setY(50);
        r1.setWidth(200);
        r1.setHeight(100);
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();
        Rectangle r5 = new Rectangle();
        Rectangle r6 = new Rectangle();
        Rectangle r7 = new Rectangle();
        
        //squares
        Rectangle s1 = new Rectangle();
        Rectangle s2 = new Rectangle();
        Rectangle s3 = new Rectangle();
        Rectangle s4 = new Rectangle();
        Rectangle s5 = new Rectangle();
        Rectangle s6 = new Rectangle();
        Rectangle s7 = new Rectangle();
        
        //diamonds
        Rectangle d1 = new Rectangle();
        Rectangle d2 = new Rectangle();
        Rectangle d3 = new Rectangle();
        Rectangle d4 = new Rectangle();
        Rectangle d5 = new Rectangle();
        Rectangle d6 = new Rectangle();
        Rectangle d7 = new Rectangle();
        
        //circles
        Circle c1 = new Circle();
        c1.setCenterX(100.0f);
        c1.setCenterY(100.0f);
        c1.setRadius(50.0f);
        Circle c2 = new Circle();
        Circle c3 = new Circle();
        Circle c4 = new Circle();
        Circle c5 = new Circle();
        Circle c6 = new Circle();
        Circle c7 = new Circle();
        
        //ovals
        Ellipse e1 = new Ellipse();
        e1.setCenterX(50.0f);
        e1.setCenterY(50.0f);
        e1.setRadiusX(50.0f);
        e1.setRadiusY(25.0f);
        Ellipse e2 = new Ellipse();
        Ellipse e3 = new Ellipse();
        Ellipse e4 = new Ellipse();
        Ellipse e5 = new Ellipse();
        Ellipse e6 = new Ellipse();
        Ellipse e7 = new Ellipse();
        
        //triangles
        Polygon t1 = new Polygon();
        t1.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t2 = new Polygon();
        Polygon t3 = new Polygon();
        Polygon t4 = new Polygon();
        Polygon t5 = new Polygon();
        Polygon t6 = new Polygon();
        Polygon t7 = new Polygon();
        
        
        ObservableList<String> colors = FXCollections.observableArrayList(
            "red", "orange", "yellow", "green", "blue", "violet");
        ListView<String> Colors = new ListView<String>(colors);
        Colors.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Colors.setPrefWidth(150);
        
        ObservableList<String> numOptions = 
        FXCollections.observableArrayList(
            "3",
            "4",
            "5",
            "6",
            "7"
        );
        final ComboBox numShapes = new ComboBox(numOptions);
        numShapes.setValue("# of Shapes");
        
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
        
        VBox v1 = new VBox();
        v1.getChildren().add(r1);
        v1.getChildren().add(s1);
        v1.getChildren().add(d1);
        v1.getChildren().add(c1);
        v1.getChildren().add(e1);
        v1.getChildren().add(t1);
        VBox v2 = new VBox();
        v2.getChildren().add(r2);
        v2.getChildren().add(s2);
        v2.getChildren().add(d2);
        v2.getChildren().add(c2);
        v2.getChildren().add(e2);
        v2.getChildren().add(t2);
        VBox v3 = new VBox();
        v3.getChildren().add(r3);
        v3.getChildren().add(s3);
        v3.getChildren().add(d3);
        v3.getChildren().add(c3);
        v3.getChildren().add(e3);
        v3.getChildren().add(t3);
        VBox v4 = new VBox();
        v4.getChildren().add(r4);
        v4.getChildren().add(s4);
        v4.getChildren().add(d4);
        v4.getChildren().add(c4);
        v4.getChildren().add(e4);
        v4.getChildren().add(t4);
        VBox v5 = new VBox();
        v5.getChildren().add(r5);
        v5.getChildren().add(s5);
        v5.getChildren().add(d5);
        v5.getChildren().add(c5);
        v5.getChildren().add(e5);
        v5.getChildren().add(t5);
        VBox v6 = new VBox();
        v6.getChildren().add(r6);
        v6.getChildren().add(s6);
        v6.getChildren().add(d6);
        v6.getChildren().add(c6);
        v6.getChildren().add(e6);
        v6.getChildren().add(t6);
        VBox v7 = new VBox();
        v7.getChildren().add(r7);
        v7.getChildren().add(s7);
        v7.getChildren().add(d7);
        v7.getChildren().add(c7);
        v7.getChildren().add(e7);
        v7.getChildren().add(t7);
        
        
        AnchorPane anchorPane = new AnchorPane();
	anchorPane.setMinSize(500.0, 400.0);
        anchorPane.setMaxSize(500.0, 400.0);
        anchorPane.setPrefSize(500.0, 400.0);
        
        anchorPane.getChildren().add(v1);
        anchorPane.getChildren().add(v2);
        anchorPane.getChildren().add(v3);
        anchorPane.getChildren().add(v4);
        anchorPane.getChildren().add(v5);
        anchorPane.getChildren().add(v6);
        anchorPane.getChildren().add(v7);
        

	HBox InputBox = new HBox();
	InputBox.getStyleClass().add("graytheme");
        InputBox.setSpacing(10);
        InputBox.setPadding(new Insets(15, 15, 15, 15));
        
        InputBox.getChildren().add(Shapes);
        InputBox.getChildren().add(numShapes);
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
        
        quit.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
		try {
                    primaryStage.close(); // closes the window
                    Platform.exit(); // exits the current application thread		
		} catch ( Exception e ) {
                    e.printStackTrace(System.err);
		}
            }
	});
        
        primaryStage.setTitle("The Shapes Are Right!!");
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
