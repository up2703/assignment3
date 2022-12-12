import JavaFX.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SeatingArrangementApplication extends Application {  	
    public static final String BLANK = ""; 	 	
    GridPane grid; 	
    Label teacherLabel, studentNameLabel, colorLabel; 	
    TextField studentNameField; 	
    Button bookSeatButton, seat1, seat2, seat3, seat4, seat5, seat6, seat7, seat8, seat9; 	
    ComboBox<String> colorCb; 	  	
    @Override 	public void start(Stage stage) { 		
        stage.setTitle("Seating Arrangement Application");  		
        grid = new GridPane(); 		
        grid.setAlignment(Pos.CENTER); 		
        grid.setHgap(10); 		
        grid.setVgap(10); 		
        grid.setPadding(new Insets(25, 25, 25, 25));  		
        teacherLabel = new Label("Teacher"); 		
        teacherLabel.setStyle("-fx-border-color:white; -fx-background-color: blue;"); 		
        grid.add(teacherLabel, 0, 0); 		 		 		 		
        seat1 = new Button(); 		 		
        seat2 = new Button(); 		 		
        seat3 = new Button(); 		 		
        HBox hBox1 = new HBox(20, seat1, seat2, seat3); 		
        grid.add(hBox1, 0, 1, 2, 1); 		 		
        seat4 = new Button(); 		 		
        seat5 = new Button(); 		 		
        seat6 = new Button(); 		 		
        HBox hBox2 = new HBox(20, seat4, seat5, seat6); 		
        grid.add(hBox2, 0, 2, 2, 1); 		 		 		
        seat7 = new Button(); 		 		
        seat8 = new Button(); 		 		
        seat9 = new Button(); 		 		
        HBox hBox3 = new HBox(20, seat7, seat8, seat9); 		
        grid.add(hBox3, 0, 3, 2, 1); 		 		 		
        studentNameLabel = new Label("Student Name"); 		
        grid.add(studentNameLabel, 0, 5); 		 		
        studentNameField = new TextField(); 		
        grid.add(studentNameField, 1, 5); 		 		
        colorLabel = new Label("Select a color"); 		
        grid.add(colorLabel, 0, 6); 		 		
        colorCb = new ComboBox<String>(); 		
        colorCb.getItems().add("Red"); 		
        colorCb.getItems().add("Green"); 		
        colorCb.getItems().add("Blue"); 		
        colorCb.getItems().add("White"); 		
        colorCb.getItems().add("Black"); 		
        colorCb.getItems().add("Yellow"); 		
        colorCb.getItems().add("Orange"); 		
        colorCb.getItems().add("Pink"); 		
        colorCb.getItems().add("Violet"); 		
        grid.add(colorCb, 1, 6); 		 		
        bookSeatButton = new Button("Book Seat"); 		
        grid.add(bookSeatButton, 0, 7, 2, 1); 		 		 		 		
        bookSeatButton.setOnAction(actionEvent -> { 			 		}); 		 		 		
        Scene scene = new Scene(grid, 700, 400); 		
        stage.setScene(scene);  		
        stage.show(); 	
    }  	
    public void alert(String title, String message, AlertType alertType) { 		
        Alert alert = new Alert(alertType); 		
        alert.setTitle(title); 		
        alert.setHeaderText(null); 		
        alert.setContentText(message); 		
        alert.showAndWait(); 	
    }  
        public static void main(String[] args) { 		
            launch(args); 	
        
        } 
    } 