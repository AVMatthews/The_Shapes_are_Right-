package theshapesareright;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.TextAlignment;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.util.Callback;
import javafx.util.Duration;

/**
 *
 * @author Abigail Matthews & Kristina Kolibab
 */
public class TheShapesAreRight extends Application {
    
    // Global variables
    int numberOfShapes = 0; // number of shapes dealed to user during game
    String currentShape = null; // current card user will be trying to guess
    int score = 0; //players score
    int timeThrough = 0; //how the program will know to switch GridPanes and flip the right card
    int nextRound = 0; //lets us know which round we are in
    //when they FIRST get into the next round, timeThrough will return to 0, if not, it will be allowed to increment
    boolean newRound; 
    boolean firstClick = true; //help with holder list
    
    @Override
    public void start(Stage primaryStage) {
        
        ObservableList<String> shapes = FXCollections.observableArrayList(
          "Circle", "Oval", "Triangle", "Square", "Rectangle", "Diamond");
        ListView<String> Shapes = new ListView<String>(shapes);
        Shapes.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        Shapes.setPrefWidth(150);
        Shapes.setCenterShape(true);
        
        //rectangles
        Rectangle r1 = new Rectangle();
        r1.setWidth(35);
        r1.setHeight(60);
        r1.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r2 = new Rectangle();
        r2.setWidth(35);
        r2.setHeight(60);
        r2.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r3 = new Rectangle();
        r3.setWidth(35);
        r3.setHeight(60);
        r3.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r4 = new Rectangle();
        r4.setWidth(35);
        r4.setHeight(60);
        r4.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r5 = new Rectangle();
        r5.setWidth(35);
        r5.setHeight(60);
        r5.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r6 = new Rectangle();
        r6.setWidth(35);
        r6.setHeight(60);
        r6.getTransforms().add(new Translate(12.5, 0)); 
        Rectangle r7 = new Rectangle();
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
        
        ObservableList<String> numOptions = FXCollections.observableArrayList("3", "5", "7");
        
        final ComboBox numShapes = new ComboBox(numOptions);
        numShapes.setValue("Number of Shapes");
        
        ObservableList<String> shuffledChoices = FXCollections.observableArrayList();
        
        ObservableList<String> shuffledChoicesOne = FXCollections.observableArrayList();
        
        ObservableList<String> shuffledChoicesTwo = FXCollections.observableArrayList();
        
        ObservableList<String> shuffledChoicesThree = FXCollections.observableArrayList();
        
        ObservableList<String> holderChoices = FXCollections.observableArrayList();
        
        ObservableList<String> cardChoices = FXCollections.observableArrayList();
        
        final ComboBox Choices = new ComboBox(cardChoices);
        Choices.setValue("Card Choices");
        Choices.setDisable(true); 
        
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
        
        TextField textField = new TextField();
        textField.setText("Final Score: ");
        textField.setEditable(false);
        
        Button Flip = new Button();
        Flip.setText("Flip");
        Flip.setDisable(true); 
        
        Button Go = new Button();
        Go.setText("GO");
        
        Button Reset = new Button();
        Reset.setText("Reset");
        
        Button quit = new Button();
        quit.setText("Quit");
        
        GridPane v1 = new GridPane();
        v1.setPadding(new Insets(20, 10, 20, 10));
        v1.setStyle("-fx-border: 2px solid; -fx-border-color: red;");
        v1.add(r1, 0, 0);
        v1.add(s1, 0, 0);
        v1.add(d1, 0, 0);
        v1.add(c1, 0, 0);
        v1.add(e1, 0, 0);
        v1.add(t1, 0, 0);
        GridPane v2 = new GridPane();
        v2.setPadding(new Insets(20, 10, 20, 10));
        v2.setStyle("-fx-border: 2px solid; -fx-border-color: black;");
        v2.add(r2, 0, 0);
        v2.add(s2, 0, 0);
        v2.add(d2, 0, 0);
        v2.add(c2, 0, 0);
        v2.add(e2, 0, 0);
        v2.add(t2, 0, 0);
        GridPane v3 = new GridPane();
        v3.setPadding(new Insets(20, 10, 20, 10));
        v3.setStyle("-fx-border: 2px solid; -fx-border-color: red;");
        v3.add(r3, 0, 0);
        v3.add(s3, 0, 0);
        v3.add(d3, 0, 0);
        v3.add(c3, 0, 0);
        v3.add(e3, 0, 0);
        v3.add(t3, 0, 0);
        GridPane v4 = new GridPane();
        v4.setPadding(new Insets(20, 10, 20, 10));
        v4.setStyle("-fx-border: 2px solid; -fx-border-color: black;");
        v4.add(r4, 0, 0);
        v4.add(s4, 0, 0);
        v4.add(d4, 0, 0);
        v4.add(c4, 0, 0);
        v4.add(e4, 0, 0);
        v4.add(t4, 0, 0);
        GridPane v5 = new GridPane();
        v5.setPadding(new Insets(20, 10, 20, 10));
        v5.setStyle("-fx-border: 2px solid; -fx-border-color: red;");
        v5.add(r5, 0, 0);
        v5.add(s5, 0, 0);
        v5.add(d5, 0, 0);
        v5.add(c5, 0, 0);
        v5.add(e5, 0, 0);
        v5.add(t5, 0, 0);
        GridPane v6 = new GridPane();
        v6.setPadding(new Insets(20, 10, 20, 10));
        v6.setStyle("-fx-border: 2px solid; -fx-border-color: black;");
        v6.add(r6, 0, 0);
        v6.add(s6, 0, 0);
        v6.add(d6, 0, 0);
        v6.add(c6, 0, 0);
        v6.add(e6, 0, 0);
        v6.add(t6, 0, 0);
        GridPane v7 = new GridPane();
        v7.setPadding(new Insets(20, 10, 20, 10));
        v7.setStyle("-fx-border: 2px solid; -fx-border-color: red;");
        v7.add(r7, 0, 0);
        v7.add(s7, 0, 0);
        v7.add(d7, 0, 0);
        v7.add(c7, 0, 0);
        v7.add(e7, 0, 0);
        v7.add(t7, 0, 0);

        v1.setVisible(false);
        r1.setVisible(false);
        s1.setVisible(false);
        d1.setVisible(false);
        c1.setVisible(false);
        e1.setVisible(false);
        t1.setVisible(false);
        
        v2.setVisible(false);
        r2.setVisible(false);
        s2.setVisible(false);
        d2.setVisible(false);
        c2.setVisible(false);
        e2.setVisible(false);
        t2.setVisible(false);
        
        v3.setVisible(false);
        r3.setVisible(false);
        s3.setVisible(false);
        d3.setVisible(false);
        c3.setVisible(false);
        e3.setVisible(false);
        t3.setVisible(false);
        
        v4.setVisible(false);
        r4.setVisible(false);
        s4.setVisible(false);
        d4.setVisible(false);
        c4.setVisible(false);
        e4.setVisible(false);
        t4.setVisible(false);
        
        v5.setVisible(false);
        r5.setVisible(false);
        s5.setVisible(false);
        d5.setVisible(false);
        c5.setVisible(false);
        e5.setVisible(false);
        t5.setVisible(false);
        
        v6.setVisible(false);
        r6.setVisible(false);
        s6.setVisible(false);
        d6.setVisible(false);
        c6.setVisible(false);
        e6.setVisible(false);
        t6.setVisible(false);
        
        v7.setVisible(false);
        r7.setVisible(false);
        s7.setVisible(false);
        d7.setVisible(false);
        c7.setVisible(false);
        e7.setVisible(false);
        t7.setVisible(false);
                
        GridPane gridPane = new GridPane();
	gridPane.setMinSize(630.0, 120.0);
        gridPane.setMaxSize(630.0, 100.0);
        gridPane.setPrefSize(630.0, 100.0);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setHgap(10);
       
        gridPane.add(v1, 0, 0);
        gridPane.add(v2, 1, 0);
        gridPane.add(v3, 2, 0);
        gridPane.add(v4, 3, 0);
        gridPane.add(v5, 4, 0);
        gridPane.add(v6, 5, 0);
        gridPane.add(v7, 6, 0);
        
        HBox FlipBox = new HBox();
	FlipBox.getStyleClass().add("graytheme");
        FlipBox.setPadding(new Insets(5, 5, 5, 285));
        
        FlipBox.getChildren().add(Flip);
        
        HBox ChoicesBox = new HBox();
	ChoicesBox.getStyleClass().add("graytheme");
        ChoicesBox.setPadding(new Insets(5, 5, 5, 255));
        
        ChoicesBox.getChildren().add(Choices);

	HBox InputBox = new HBox();
	InputBox.getStyleClass().add("graytheme");
        InputBox.setSpacing(10);
        InputBox.setPadding(new Insets(15, 15, 15, 100));
        
        InputBox.getChildren().add(Shapes);
        InputBox.getChildren().add(numShapes);
        InputBox.getChildren().add(Colors);
        
        HBox ButtonBox = new HBox();
	ButtonBox.getStyleClass().add("graytheme");
        ButtonBox.setSpacing(20);
        ButtonBox.setPadding(new Insets(0, 15, 15, 15));
        
        ButtonBox.getChildren().add(quit);
        ButtonBox.getChildren().add(Reset);
        ButtonBox.getChildren().add(Go);
        ButtonBox.getChildren().add(textField);
        
        GridPane root = new GridPane();
	root.getStyleClass().add("graytheme");
              
        root.add(gridPane, 0, 0);
        root.add(FlipBox, 0, 1);
        root.add(ChoicesBox, 0, 2);
        root.add(InputBox, 0, 3);
        root.add(ButtonBox, 0, 4);
                
        Scene scene = new Scene(root, 655, 460);
        scene.getStylesheets().add( getClass().getResource("DarkTheme.css").toExternalForm() );
        
        
        Go.setOnAction( new EventHandler<ActionEvent>(){
            @Override
            public void handle( ActionEvent event ){
                try{
                    /* GATHER ALL USER INPUT */
                    String thisNum = numShapes.getValue().toString();
                    // set global variable for number of shapes to be created
                    switch(thisNum){
                        case "3":
                            numberOfShapes = 3; 
                            break;
                        case "5":
                            numberOfShapes = 5;
                            break;
                        case "7":
                            numberOfShapes = 7;
                            break;
                    }
               
                    // creates an arraylist for the selected shapes to be used
                    ArrayList<String> chosenShapes = new ArrayList(); 
                    chosenShapes.addAll( Shapes.getSelectionModel().getSelectedItems() );
                    // getting number of colors selected for randomization
                    int numOfShapes = 0;
                    for (String chosenShape : chosenShapes) {
                        numOfShapes++;
                    }
                    // converts arraylist to array
                    String [] arrayShapes = chosenShapes.toArray( new String[chosenShapes.size()] );
                
                    // creates an arraylist for the selected colors to be used
                    ArrayList<String> chosenColors = new ArrayList();
                    chosenColors.addAll( Colors.getSelectionModel().getSelectedItems() );
                    // getting number of colors selected for randomization
                    int numOfColors = 0;
                    for(String chosenColor : chosenColors){
                        numOfColors++;
                    }
                    // converts arraylist to array
                    String [] arrayColors = chosenColors.toArray( new String[chosenColors.size()] );
                   
                    /* DEAL OUT RANDOMIZED SHAPES/COLORS */
                    String [] shapePair = new String[9];
                    Random rand = new Random();
                    
                    for(int i = 0; i < numberOfShapes; i++){
                       // rand.nextInt(numOfColors/Shapes) --> number of colors/shapes rand will choose through
                       shapePair[i] = arrayColors[rand.nextInt(numOfColors)] + " " + arrayShapes[rand.nextInt(numOfShapes)];
                       cardChoices.addAll(shapePair[i]); //the options the user can select from
                       shuffledChoicesOne.addAll(shapePair[i]); //round 1
                       shuffledChoicesTwo.addAll(shapePair[i]); //round 2
                       shuffledChoicesThree.addAll(shapePair[i]); //round 3
                    }
                    
                    //shuffle the order of their choices here
                    Collections.shuffle(shuffledChoicesOne);
                    //for extra shuffle
                    Collections.shuffle(shuffledChoicesTwo);
                    Collections.shuffle(shuffledChoicesTwo);
                    //for extra extra shuffle
                    Collections.shuffle(shuffledChoicesThree);
                    Collections.shuffle(shuffledChoicesThree);
                    Collections.shuffle(shuffledChoicesThree);
                    
//                    //a holder list because the other two get removed, this holds the values for next round
//                    holderChoices.addAll(shuffledChoices);
                    
                    //turn off access to buttons/lists once they begin choosing shapes
                    Go.setDisable(true); 
                    Colors.setDisable(true); 
                    Shapes.setDisable(true);
                    numShapes.setDisable(true);
                    //turn on access so player can begin guessing shapes
                    Flip.setDisable(false); 
                    Choices.setDisable(false);
                    
                }catch ( ArrayIndexOutOfBoundsException aiobe ){ 
                    aiobe.printStackTrace(System.err);
                }
            }
       });
        
        Flip.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
		try {                    
                    int currentItr = 0;

                    //iterate through each shape the user chooses to guess with
                    currentShape = Choices.getValue().toString(); 
                    String [] chosenTwoWords = currentShape.split(" ");
                    String chosenColorWord = chosenTwoWords[0];
                    String chosenShapeWord = chosenTwoWords[1];
                    
                    //first round
                    if(firstClick == true){
                        shuffledChoices.addAll(shuffledChoicesOne);
                        firstClick = false;
                    }
                    
                    //splitting shape & color to compare by shape first
                    String currentStr = (shuffledChoices.get(currentItr));
                    //first word is the "color" second word is the "shape"
                    String [] twoWords = currentStr.split(" "); 
                    
                    String colorWord = twoWords[0];
                    String shapeWord = twoWords[1];
                    System.out.println(shapeWord);
                    
                    //this is where we test if what the user guessed is correct or not
                    if((chosenColorWord.equals(colorWord)) && (chosenShapeWord.equals(shapeWord))){
                        System.out.println("Correct: " + currentStr);
                        score++; //increment score
                        System.out.println("Current score: " + score);
                    } else {
                        System.out.println("Incorrect, you chose: " + currentShape + " When the correct answer was: " + currentStr);
                    }
                    //looking through choices list to see which item to remvoe that has been displayed by the shuffled list
                    for(int i = 0; i < cardChoices.size(); i++){
                        if(cardChoices.get(i).equals(shuffledChoices.get(currentItr))){
                            System.out.println("item shown in shuffled was: " + shuffledChoices.get(currentItr) + " item deleted from choices was: " + cardChoices.get(i));
                            shuffledChoices.remove(currentItr);
                            cardChoices.remove(i);  
                            break;
                        }
                    }
                        switch(numberOfShapes){
//CASE 3 --> CARDS 1-3 WILL BE USED HERE 
                            case 3:                       
                                
                                if(newRound == true){
                                    timeThrough = 0;
                                    newRound = false;
                                    v3.setVisible(false);
                                    r3.setVisible(false);
                                    s3.setVisible(false);
                                    d3.setVisible(false);
                                    c3.setVisible(false);
                                    e3.setVisible(false);
                                    t3.setVisible(false);

                                    v4.setVisible(false);
                                    r4.setVisible(false);
                                    s4.setVisible(false);
                                    d4.setVisible(false);
                                    c4.setVisible(false);
                                    e4.setVisible(false);
                                    t4.setVisible(false);

                                    v5.setVisible(false);
                                    r5.setVisible(false);
                                    s5.setVisible(false);
                                    d5.setVisible(false);
                                    c5.setVisible(false);
                                    e5.setVisible(false);
                                    t5.setVisible(false);
                                    Flip.setText("Flip");
                                }
                                
                                // Card 1/3
                                if(timeThrough == 0){
                                    
                                    if("Circle".equals(shapeWord)){ // Circle
                                        
                                        v3.setVisible(true);
                                        c3.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            c3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                        
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        
                                        v3.setVisible(true);
                                        e3.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            e3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        
                                        v3.setVisible(true);
                                        t3.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            t3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        
                                        v3.setVisible(true);
                                        s3.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            s3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        
                                        v3.setVisible(true);
                                        r3.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            r3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        
                                        v3.setVisible(true);
                                        d3.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            d3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                } // Card 2/3
                                if(timeThrough == 1){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        
                                        v4.setVisible(true);
                                        c4.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            c4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        
                                        v4.setVisible(true);
                                        e4.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            e4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        
                                        v4.setVisible(true);
                                        t4.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            t4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        
                                        v4.setVisible(true);
                                        s4.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            s4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        
                                        v4.setVisible(true);
                                        r4.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            r4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        
                                        v4.setVisible(true);
                                        d4.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            d4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                } // Card 3/3
                                if(timeThrough == 2){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        
                                        v5.setVisible(true);
                                        c5.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            c5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        
                                        v5.setVisible(true);
                                        e5.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            e5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        
                                        v5.setVisible(true);
                                        t5.setVisible(true);
                                       
                                        if("red".equals(colorWord)){
                                            t5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        
                                        v5.setVisible(true);
                                        s5.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            s5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        
                                        v5.setVisible(true);
                                        r5.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            r5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        
                                        v5.setVisible(true);
                                        d5.setVisible(true);
                                        
                                        if("red".equals(colorWord)){
                                            d5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                    //reset items when next round starts
                                    if(nextRound == 0){
                                        newRound = true;
                                        
                                        Thread.sleep(2000);
                                        
                                        Flip.setText("Round 2 [choose]");
                                        cardChoices.removeAll();
                                        shuffledChoices.removeAll();
                                        shuffledChoices.addAll(shuffledChoicesTwo);
                                        cardChoices.addAll(shuffledChoices);
                                        Collections.shuffle(cardChoices);
                                        
                                    }
                                    if(nextRound == 1){
                                        newRound = true;
                                        
                                        Thread.sleep(2000);
                                        
                                        Flip.setText("Round 3 [choose]");
                                        cardChoices.removeAll();
                                        shuffledChoices.removeAll();
                                        shuffledChoices.addAll(shuffledChoicesThree);
                                        cardChoices.addAll(shuffledChoices);
                                        Collections.shuffle(cardChoices);
                                        
                                    }
                                    if(nextRound == 2){ 
                                        System.out.println("Your final score is: " + score);
                                        textField.setText("Final Score: " + score);
                                        
                                        Thread.sleep(2000);
                                        
                                        cardChoices.removeAll();
                                        cardChoices.addAll(shuffledChoices);
                                        Flip.setDisable(true);
                                        
                                    }
                                    nextRound++; //increment rounds
                                }                 
                                
                                if(newRound == true){
                                    
                                } else {
                                    ++timeThrough; 
                                }
                                break;
                                
//CASE 5 --> GRIDPANE'S 2-6 WILL BE WORKING HERE    
                            case 5:
                                
                                if(newRound == true){
                                    timeThrough = 0;
                                    newRound = false;
                                    v2.setVisible(false);
                                    r2.setVisible(false);
                                    s2.setVisible(false);
                                    d2.setVisible(false);
                                    c2.setVisible(false);
                                    e2.setVisible(false);
                                    t2.setVisible(false);

                                    v3.setVisible(false);
                                    r3.setVisible(false);
                                    s3.setVisible(false);
                                    d3.setVisible(false);
                                    c3.setVisible(false);
                                    e3.setVisible(false);
                                    t3.setVisible(false);

                                    v4.setVisible(false);
                                    r4.setVisible(false);
                                    s4.setVisible(false);
                                    d4.setVisible(false);
                                    c4.setVisible(false);
                                    e4.setVisible(false);
                                    t4.setVisible(false);

                                    v5.setVisible(false);
                                    r5.setVisible(false);
                                    s5.setVisible(false);
                                    d5.setVisible(false);
                                    c5.setVisible(false);
                                    e5.setVisible(false);
                                    t5.setVisible(false);

                                    v6.setVisible(false);
                                    r6.setVisible(false);
                                    s6.setVisible(false);
                                    d6.setVisible(false);
                                    c6.setVisible(false);
                                    e6.setVisible(false);
                                    t6.setVisible(false);
                                    Flip.setText("Flip");
                                }
                                
                                // Card 1/5
                                if(timeThrough == 0){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v2.setVisible(true);
                                        c2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v2.setVisible(true);
                                        e2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v2.setVisible(true);
                                        t2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v2.setVisible(true);
                                        s2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v2.setVisible(true);
                                        r2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v2.setVisible(true);
                                        d2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                } // Card 2/5
                                if(timeThrough == 1){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v3.setVisible(true);
                                        c3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v3.setVisible(true);
                                        e3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v3.setVisible(true);
                                        t3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v3.setVisible(true);
                                        s3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v3.setVisible(true);
                                        r3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v3.setVisible(true);
                                        d3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 2;
                                } // Card 3/5
                                if(timeThrough == 2){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v4.setVisible(true);
                                        c4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v4.setVisible(true);
                                        e4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v4.setVisible(true);
                                        t4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v4.setVisible(true);
                                        s4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v4.setVisible(true);
                                        r4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v4.setVisible(true);
                                        d4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 3;
                                } // Card 4/5
                                if(timeThrough == 3){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v5.setVisible(true);
                                        c5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v5.setVisible(true);
                                        e5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v5.setVisible(true);
                                        t5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v5.setVisible(true);
                                        s5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v5.setVisible(true);
                                        r5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v5.setVisible(true);
                                        d5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 4;
                                } // Card 5/5
                                if(timeThrough == 4){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v6.setVisible(true);
                                        c6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v6.setVisible(true);
                                        e6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v6.setVisible(true);
                                        t6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v6.setVisible(true);
                                        s6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v6.setVisible(true);
                                        r6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v6.setVisible(true);
                                        d6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                    //reset items when next round starts
                                    if(nextRound == 0){
                                        newRound = true;
                                        
                                        Thread.sleep(2000);
                                        
                                        Flip.setText("Round 2 [choose]");
                                        cardChoices.removeAll();
                                        shuffledChoices.removeAll();
                                        shuffledChoices.addAll(shuffledChoicesTwo);
                                        cardChoices.addAll(shuffledChoices);
                                        Collections.shuffle(cardChoices);
                                        
                                    }
                                    if(nextRound == 1){
                                        newRound = true;
                                        
                                        Thread.sleep(2000);
                                        
                                        Flip.setText("Round 3 [choose]");
                                        cardChoices.removeAll();
                                        shuffledChoices.removeAll();
                                        shuffledChoices.addAll(shuffledChoicesThree);
                                        cardChoices.addAll(shuffledChoices);
                                        Collections.shuffle(cardChoices);
                                    }
                                    if(nextRound == 2){ 
                                        System.out.println("Your final score is: " + score);
                                        textField.setText("Final Score: " + score);
                                        
                                        Thread.sleep(2000);
                                        
                                        cardChoices.removeAll();
                                        cardChoices.addAll(shuffledChoices);
                                        Flip.setDisable(true);
                                        
                                    }
                                    nextRound++; //increment rounds
                                }
                                if(newRound == true){
                                    
                                } else {
                                    ++timeThrough; 
                                }
                                break;
//THIS IS CASE 7 IT USES CARDS 1-7
                            case 7:
                                
                                if(newRound == true){
                                    timeThrough = 0;
                                    newRound = false;
                                    v1.setVisible(false);
                                    r1.setVisible(false);
                                    s1.setVisible(false);
                                    d1.setVisible(false);
                                    c1.setVisible(false);
                                    e1.setVisible(false);
                                    t1.setVisible(false);

                                    v2.setVisible(false);
                                    r2.setVisible(false);
                                    s2.setVisible(false);
                                    d2.setVisible(false);
                                    c2.setVisible(false);
                                    e2.setVisible(false);
                                    t2.setVisible(false);

                                    v3.setVisible(false);
                                    r3.setVisible(false);
                                    s3.setVisible(false);
                                    d3.setVisible(false);
                                    c3.setVisible(false);
                                    e3.setVisible(false);
                                    t3.setVisible(false);

                                    v4.setVisible(false);
                                    r4.setVisible(false);
                                    s4.setVisible(false);
                                    d4.setVisible(false);
                                    c4.setVisible(false);
                                    e4.setVisible(false);
                                    t4.setVisible(false);

                                    v5.setVisible(false);
                                    r5.setVisible(false);
                                    s5.setVisible(false);
                                    d5.setVisible(false);
                                    c5.setVisible(false);
                                    e5.setVisible(false);
                                    t5.setVisible(false);

                                    v6.setVisible(false);
                                    r6.setVisible(false);
                                    s6.setVisible(false);
                                    d6.setVisible(false);
                                    c6.setVisible(false);
                                    e6.setVisible(false);
                                    t6.setVisible(false);

                                    v7.setVisible(false);
                                    r7.setVisible(false);
                                    s7.setVisible(false);
                                    d7.setVisible(false);
                                    c7.setVisible(false);
                                    e7.setVisible(false);
                                    t7.setVisible(false);
                                    Flip.setText("Flip");
                                }
                                
                                // Card 1/7
                                if(timeThrough == 0){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v1.setVisible(true);
                                        c1.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c1.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c1.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c1.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c1.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c1.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c1.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c1);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v1.setVisible(true);
                                        e1.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e1.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e1.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e1.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e1.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e1.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e1.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e1);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v1.setVisible(true);
                                        t1.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t1.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t1.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t1.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t1.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t1.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t1.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t1);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v1.setVisible(true);
                                        s1.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s1.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s1.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s1.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s1.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s1.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s1.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s1);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v1.setVisible(true);
                                        r1.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r1.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r1.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r1.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r1.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r1.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r1.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r1);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v1.setVisible(true);
                                        d1.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d1.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d1.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d1.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d1.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d1.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d1.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d1);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 1;
                                } 
                                // Card 2/7
                                if(timeThrough == 1){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v2.setVisible(true);
                                        c2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v2.setVisible(true);
                                        e2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v2.setVisible(true);
                                        t2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v2.setVisible(true);
                                        s2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v2.setVisible(true);
                                        r2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v2.setVisible(true);
                                        d2.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d2.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d2.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d2.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d2.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d2.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d2.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d2);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                } // Card 3/7
                                if(timeThrough == 2){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v3.setVisible(true);
                                        c3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v3.setVisible(true);
                                        e3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v3.setVisible(true);
                                        t3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v3.setVisible(true);
                                        s3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v3.setVisible(true);
                                        r3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v3.setVisible(true);
                                        d3.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d3.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d3.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d3.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d3.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d3.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d3.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d3);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 3;
                                } // Card 4/7
                                if(timeThrough == 3){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v4.setVisible(true);
                                        c4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v4.setVisible(true);
                                        e4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v4.setVisible(true);
                                        t4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v4.setVisible(true);
                                        s4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v4.setVisible(true);
                                        r4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v4.setVisible(true);
                                        d4.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d4.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d4.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d4.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d4.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d4.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d4.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d4);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 4;
                                } // Card 5/7
                                if(timeThrough == 4){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v5.setVisible(true);
                                        c5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v5.setVisible(true);
                                        e5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v5.setVisible(true);
                                        t5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v5.setVisible(true);
                                        s5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v5.setVisible(true);
                                        r5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v5.setVisible(true);
                                        d5.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d5.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d5.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d5.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d5.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d5.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d5.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d5);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
//                                    timeThrough = 5;
                                } // Card 6/7
                                if(timeThrough == 5){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v6.setVisible(true);
                                        c6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v6.setVisible(true);
                                        e6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v6.setVisible(true);
                                        t6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v6.setVisible(true);
                                        s6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v6.setVisible(true);
                                        r6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v6.setVisible(true);
                                        d6.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d6.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d6.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d6.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d6.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d6.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d6.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d6);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                } // Card 7/7
                                if(timeThrough == 6){
                                    if("Circle".equals(shapeWord)){ // Circle
                                        v7.setVisible(true);
                                        c7.setVisible(true);
                                        if("red".equals(colorWord)){
                                            c7.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            c7.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            c7.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            c7.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            c7.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            c7.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(c7);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Oval".equals(shapeWord)){ // Oval
                                        v7.setVisible(true);
                                        e7.setVisible(true);
                                        if("red".equals(colorWord)){
                                            e7.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            e7.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            e7.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            e7.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            e7.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            e7.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(e7);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Triangle".equals(shapeWord)){ //Triangle
                                        v7.setVisible(true);
                                        t7.setVisible(true);
                                        if("red".equals(colorWord)){
                                            t7.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            t7.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            t7.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            t7.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            t7.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            t7.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(t7);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Square".equals(shapeWord)){ // Square
                                        v7.setVisible(true);
                                        s7.setVisible(true);
                                        if("red".equals(colorWord)){
                                            s7.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            s7.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            s7.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            s7.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            s7.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            s7.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(s7);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Rectangle".equals(shapeWord)){ // Rectangle
                                        v7.setVisible(true);
                                        r7.setVisible(true);
                                        if("red".equals(colorWord)){
                                            r7.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            r7.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            r7.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            r7.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            r7.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            r7.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(r7);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }if("Diamond".equals(shapeWord)){ // Diamond
                                        v7.setVisible(true);
                                        d7.setVisible(true);
                                        if("red".equals(colorWord)){
                                            d7.setFill(Color.RED);
                                        }if("orange".equals(colorWord)){
                                            d7.setFill(Color.ORANGE);
                                        }if("yellow".equals(colorWord)){
                                            d7.setFill(Color.YELLOW);
                                        }if("green".equals(colorWord)){
                                            d7.setFill(Color.GREEN);
                                        }if("blue".equals(colorWord)){
                                            d7.setFill(Color.BLUE);
                                        }if("violet".equals(colorWord)){
                                            d7.setFill(Color.VIOLET);
                                        }
                                        FadeTransition fadeTransition = new FadeTransition();
                                        fadeTransition.setDuration( new Duration(4000));
                                        fadeTransition.setNode(d7);
                                        fadeTransition.setFromValue(0.0);
                                        fadeTransition.setToValue(1.0);
                                        fadeTransition.play();
                                    }
                                    //reset items when next round starts
                                    if(nextRound == 0){
                                        newRound = true;
                                        
                                        Thread.sleep(2000);
                                        
                                        Flip.setText("Round 2 [choose]");
                                        cardChoices.removeAll();
                                        shuffledChoices.removeAll();
                                        shuffledChoices.addAll(shuffledChoicesTwo);
                                        cardChoices.addAll(shuffledChoices);
                                        Collections.shuffle(cardChoices);
                                        
                                    }
                                    if(nextRound == 1){
                                        newRound = true;
                                        
                                        Thread.sleep(2000);
                                        
                                        Flip.setText("Round 3 [choose]");
                                        cardChoices.removeAll();
                                        shuffledChoices.removeAll();
                                        shuffledChoices.addAll(shuffledChoicesThree);
                                        cardChoices.addAll(shuffledChoices);
                                        Collections.shuffle(cardChoices);
                                    }
                                    if(nextRound == 2){ 
                                        System.out.println("Your final score is: " + score);
                                        textField.setText("Final Score: " + score);
                                        
                                        Thread.sleep(2000);
                                        
                                        cardChoices.removeAll();
                                        cardChoices.addAll(shuffledChoices);
                                        Flip.setDisable(true);
                                        
                                    }
                                    nextRound++; //increment rounds
                                }
                                if(newRound == true){
                                    
                                } else {
                                    ++timeThrough; 
                                }
                                break;
                        }
                    currentItr++;
		} catch ( InterruptedException e ) {
                    e.printStackTrace(System.err);
		}
            }
	});
        
        Reset.setOnAction( new EventHandler<ActionEvent>() {
            @Override
            public void handle( ActionEvent event ) {
		try {
                   //turn back on access to buttons/lists
                    Go.setDisable(false); 
                    Colors.setDisable(false); 
                    Shapes.setDisable(false);
                    numShapes.setDisable(false);
                    //turn back off access so player can begin again
                    Flip.setDisable(true); 
                    Choices.setDisable(true);
                    //set integer values back to zero
                    timeThrough = 0;
                    nextRound = 0;
                    numberOfShapes = 0;
                    score = 0;
                    //set newRound to false
                    newRound = false;
                    //remove items from lists
                    shuffledChoices.removeAll();
                    shuffledChoicesOne.removeAll();
                    shuffledChoicesTwo.removeAll();
                    shuffledChoicesThree.removeAll();
                    cardChoices.removeAll();
                    holderChoices.removeAll();
                    //set currentShape to null
                    currentShape = null;
                    //make shapes invisible again
                    v1.setVisible(false);
                    r1.setVisible(false);
                    s1.setVisible(false);
                    d1.setVisible(false);
                    c1.setVisible(false);
                    e1.setVisible(false);
                    t1.setVisible(false);

                    v2.setVisible(false);
                    r2.setVisible(false);
                    s2.setVisible(false);
                    d2.setVisible(false);
                    c2.setVisible(false);
                    e2.setVisible(false);
                    t2.setVisible(false);

                    v3.setVisible(false);
                    r3.setVisible(false);
                    s3.setVisible(false);
                    d3.setVisible(false);
                    c3.setVisible(false);
                    e3.setVisible(false);
                    t3.setVisible(false);

                    v4.setVisible(false);
                    r4.setVisible(false);
                    s4.setVisible(false);
                    d4.setVisible(false);
                    c4.setVisible(false);
                    e4.setVisible(false);
                    t4.setVisible(false);

                    v5.setVisible(false);
                    r5.setVisible(false);
                    s5.setVisible(false);
                    d5.setVisible(false);
                    c5.setVisible(false);
                    e5.setVisible(false);
                    t5.setVisible(false);

                    v6.setVisible(false);
                    r6.setVisible(false);
                    s6.setVisible(false);
                    d6.setVisible(false);
                    c6.setVisible(false);
                    e6.setVisible(false);
                    t6.setVisible(false);

                    v7.setVisible(false);
                    r7.setVisible(false);
                    s7.setVisible(false);
                    d7.setVisible(false);
                    c7.setVisible(false);
                    e7.setVisible(false);
                    t7.setVisible(false);
                    //set button back to say "Flip"
                    Flip.setText("Flip");
		} catch ( Exception e ) {
                    e.printStackTrace(System.err);
		}
            }
	});
        
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
        
        primaryStage.setTitle("The Shapes Are Right!!!");
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
