import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Title of the Window");
		
		button = new Button();
		button.setText("Click me");
		
		//This class will handle the button events
		/*button.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hey Baby~");
			}
		}); */
		button.setOnAction(e -> {
		System.out.println("hey now brown cow");
		System.out.println("BABY!!");
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().addAll(button);
		
		Scene scene = new Scene(layout,300,250);
		primaryStage.setScene(scene);
		primaryStage.show();
	}	
}
