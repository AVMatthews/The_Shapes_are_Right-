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
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
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
        //r1.setX(50);
        //r1.setY(50);
        r1.setWidth(35);
        r1.setHeight(60);
        r1.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r2 = new Rectangle();
        //r2.setX(50);
        //r2.setY(50);
        r2.setWidth(35);
        r2.setHeight(60);
        r2.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r3 = new Rectangle();
        //r3.setX(50);
        //r3.setY(50);
        r3.setWidth(35);
        r3.setHeight(60);
        r3.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r4 = new Rectangle();
        //r4.setX(50);
        //r4.setY(50);
        r4.setWidth(35);
        r4.setHeight(60);
        r4.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r5 = new Rectangle();
        //r5.setX(50);
        //r5.setY(50);
        r5.setWidth(35);
        r5.setHeight(60);
        r5.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r6 = new Rectangle();
        //r6.setX(50);
        //r6.setY(50);
        r6.setWidth(35);
        r6.setHeight(60);
        r6.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r7 = new Rectangle();
        //r7.setX(50);
        //r7.setY(50);
        r7.setWidth(35);
        r7.setHeight(60);
        r7.getTransforms().add(new Translate(12.5, 0)); 
        
        //squares
        Rectangle s1 = new Rectangle();
        s1.setWidth(60);
        s1.setHeight(60);
        Rectangle s2 = new Rectangle();
        s2.setWidth(60);
        s2.setHeight(60);
        Rectangle s3 = new Rectangle();
        s3.setWidth(60);
        s3.setHeight(60);
        Rectangle s4 = new Rectangle();
        s4.setWidth(60);
        s4.setHeight(60);
        Rectangle s5 = new Rectangle();
        s5.setWidth(60);
        s5.setHeight(60);
        Rectangle s6 = new Rectangle();
        s6.setWidth(60);
        s6.setHeight(60);
        Rectangle s7 = new Rectangle();
        s7.setWidth(60);
        s7.setHeight(60);
        
        //diamonds
        Rectangle d1 = new Rectangle();
        d1.setWidth(42.5);
        d1.setHeight(42.5);
        d1.getTransforms().add(new Rotate(45, 21.25, 21.25)); 
        d1.getTransforms().add(new Translate(4.5, -5)); 
        Rectangle d2 = new Rectangle();
        d2.setWidth(42.5);
        d2.setHeight(42.5);
        d2.getTransforms().add(new Rotate(45, 21.25, 21.25));
        d2.getTransforms().add(new Translate(4.5, -5));
        Rectangle d3 = new Rectangle();
        d3.setWidth(42.5);
        d3.setHeight(42.5);
        d3.getTransforms().add(new Rotate(45, 21.25, 21.25)); 
        d3.getTransforms().add(new Translate(4.5, -5));
        Rectangle d4 = new Rectangle();
        d4.setWidth(42.5);
        d4.setHeight(42.5);
        d4.getTransforms().add(new Rotate(45, 21.25, 21.25)); 
        d4.getTransforms().add(new Translate(4.5, -5));
        Rectangle d5 = new Rectangle();
        d5.setWidth(42.5);
        d5.setHeight(42.5);
        d5.getTransforms().add(new Rotate(45, 21.25, 21.25));
        d5.getTransforms().add(new Translate(4.5, -5));
        Rectangle d6 = new Rectangle();
        d6.setWidth(42.5);
        d6.setHeight(42.5);
        d6.getTransforms().add(new Rotate(45, 21.25, 21.25)); 
        d6.getTransforms().add(new Translate(4.5, -5));
        Rectangle d7 = new Rectangle();
        d7.setWidth(42.5);
        d7.setHeight(42.5);
        d7.getTransforms().add(new Rotate(45, 21.25, 21.25)); 
        d7.getTransforms().add(new Translate(4.5, -5));
        
        //circles
        Circle c1 = new Circle();
        c1.setCenterX(30.0f);
        c1.setCenterY(30.0f);
        c1.setRadius(30.0f);
        Circle c2 = new Circle();
        c2.setCenterX(30.0f);
        c2.setCenterY(30.0f);
        c2.setRadius(30.0f);
        Circle c3 = new Circle();
        c3.setCenterX(30.0f);
        c3.setCenterY(30.0f);
        c3.setRadius(30.0f);
        Circle c4 = new Circle();
        c4.setCenterX(30.0f);
        c4.setCenterY(30.0f);
        c4.setRadius(30.0f);
        Circle c5 = new Circle();
        c5.setCenterX(30.0f);
        c5.setCenterY(30.0f);
        c5.setRadius(30.0f);
        Circle c6 = new Circle();
        c6.setCenterX(30.0f);
        c6.setCenterY(30.0f);
        c6.setRadius(30.0f);
        Circle c7 = new Circle();
        c7.setCenterX(30.0f);
        c7.setCenterY(30.0f);
        c7.setRadius(30.0f);
        
        //ovals
        Ellipse e1 = new Ellipse();
        e1.setCenterX(30.0f);
        e1.setCenterY(15.0f);
        e1.setRadiusX(30.0f);
        e1.setRadiusY(15.0f);
        Ellipse e2 = new Ellipse();
        e2.setCenterX(30.0f);
        e2.setCenterY(15.0f);
        e2.setRadiusX(30.0f);
        e2.setRadiusY(15.0f);
        Ellipse e3 = new Ellipse();
        e3.setCenterX(30.0f);
        e3.setCenterY(15.0f);
        e3.setRadiusX(30.0f);
        e3.setRadiusY(15.0f);
        Ellipse e4 = new Ellipse();
        e4.setCenterX(30.0f);
        e4.setCenterY(15.0f);
        e4.setRadiusX(30.0f);
        e4.setRadiusY(15.0f);
        Ellipse e5 = new Ellipse();
        e5.setCenterX(30.0f);
        e5.setCenterY(15.0f);
        e5.setRadiusX(30.0f);
        e5.setRadiusY(15.0f);
        Ellipse e6 = new Ellipse();
        e6.setCenterX(30.0f);
        e6.setCenterY(15.0f);
        e6.setRadiusX(30.0f);
        e6.setRadiusY(15.0f);
        Ellipse e7 = new Ellipse();
        e7.setCenterX(30.0f);
        e7.setCenterY(15.0f);
        e7.setRadiusX(30.0f);
        e7.setRadiusY(15.0f);
        
        //triangles
        Polygon t1 = new Polygon();
        t1.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t2 = new Polygon();
        t2.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t3 = new Polygon();
        t3.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t4 = new Polygon();
        t4.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t5 = new Polygon();
        t5.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t6 = new Polygon();
        t6.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        Polygon t7 = new Polygon();
        t7.getPoints().addAll(new Double[]{
            30.0, 0.0,
            0.0, 52.0,
            60.0, 52.0 });
        
        
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
        
        GridPane v1 = new GridPane();
        v1.setPadding(new Insets(15, 15, 15, 15));
        v1.setVgap(10);
        v1.add(r1, 0, 0);
        v1.add(s1, 0, 1);
        v1.add(d1, 0, 2);
        v1.add(c1, 0, 3);
        v1.add(e1, 0, 4);
        v1.add(t1, 0, 5);
        GridPane v2 = new GridPane();
        v2.setPadding(new Insets(15, 15, 15, 15));
        v2.setVgap(10);
        v2.add(r2, 0, 0);
        v2.add(s2, 0, 1);
        v2.add(d2, 0, 2);
        v2.add(c2, 0, 3);
        v2.add(e2, 0, 4);
        v2.add(t2, 0, 5);
        GridPane v3 = new GridPane();
        v3.setPadding(new Insets(15, 15, 15, 15));
        v3.setVgap(10);
        v3.add(r3, 0, 0);
        v3.add(s3, 0, 1);
        v3.add(d3, 0, 2);
        v3.add(c3, 0, 3);
        v3.add(e3, 0, 4);
        v3.add(t3, 0, 5);
        GridPane v4 = new GridPane();
        v4.setPadding(new Insets(15, 15, 15, 15));
        v4.setVgap(10);
        v4.add(r4, 0, 0);
        v4.add(s4, 0, 1);
        v4.add(d4, 0, 2);
        v4.add(c4, 0, 3);
        v4.add(e4, 0, 4);
        v4.add(t4, 0, 5);
        GridPane v5 = new GridPane();
        v5.setPadding(new Insets(15, 15, 15, 15));
        v5.setVgap(10);
        v5.add(r5, 0, 0);
        v5.add(s5, 0, 1);
        v5.add(d5, 0, 2);
        v5.add(c5, 0, 3);
        v5.add(e5, 0, 4);
        v5.add(t5, 0, 5);
        GridPane v6 = new GridPane();
        v6.setPadding(new Insets(15, 15, 15, 15));
        v6.setVgap(10);
        v6.add(r6, 0, 0);
        v6.add(s6, 0, 1);
        v6.add(d6, 0, 2);
        v6.add(c6, 0, 3);
        v6.add(e6, 0, 4);
        v6.add(t6, 0, 5);
        GridPane v7 = new GridPane();
        v7.setPadding(new Insets(15, 15, 15, 15));
        v7.setVgap(10);
        v7.add(r7, 0, 0);
        v7.add(s7, 0, 1);
        v7.add(d7, 0, 2);
        v7.add(c7, 0, 3);
        v7.add(e7, 0, 4);
        v7.add(t7, 0, 5);
        
        
        GridPane gridPane = new GridPane();
	gridPane.setMinSize(630.0, 400.0);
        gridPane.setMaxSize(630.0, 400.0);
        gridPane.setPrefSize(630.0, 400.0);
        
        gridPane.add(v1, 0, 0);
        gridPane.add(v2, 1, 0);
        gridPane.add(v3, 2, 0);
        gridPane.add(v4, 3, 0);
        gridPane.add(v5, 4, 0);
        gridPane.add(v6, 5, 0);
        gridPane.add(v7, 6, 0);
        

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
              
        root.add(gridPane, 0, 0);
        root.add(InputBox, 0, 1);
        root.add(ButtonBox, 0, 2);
                
        Scene scene = new Scene(root, 630, 660);
        
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