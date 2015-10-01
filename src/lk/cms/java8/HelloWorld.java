package lk.cms.java8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * 
 * @author Shazin
 *
 */
public class HelloWorld extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Hello, World!");
		Button btn = new Button();
		btn.setText("Press to Greet");
		btn.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent e) {
				System.out.println("Hello, World!");
				
			}
		});
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 400, 400));
		primaryStage.show();
		
	}
	
	// Write a Java FX Application
	
	// To Stage a Scene with a Button which will print Hello, World! on click
	
	
	
}