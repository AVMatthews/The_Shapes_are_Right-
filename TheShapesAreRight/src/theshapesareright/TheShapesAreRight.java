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
        Polygon p1 = new Polygon();
        p1.getPoints().addAll(new Double[]{
            0.0, 0.0,
            20.0, 10.0,
            10.0, 20.0 });
        Polygon p2 = new Polygon();
        Polygon p3 = new Polygon();
        Polygon p4 = new Polygon();
        Polygon p5 = new Polygon();
        Polygon p6 = new Polygon();
        Polygon p7 = new Polygon();
        
        
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
        
        AnchorPane anchorPane = new AnchorPane();
	anchorPane.setMinSize(500.0, 400.0);
        anchorPane.setMaxSize(500.0, 400.0);
        anchorPane.setPrefSize(500.0, 400.0);
        
        anchorPane.getChildren().add(r1);
        

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
