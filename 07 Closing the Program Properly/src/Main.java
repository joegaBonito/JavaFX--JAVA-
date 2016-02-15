import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	Button button;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JAVAFX - Joe");
		button = new Button("Close Program");
		
		//Already requestes "yes", so the window closes even after clicking "no"
		window.setOnCloseRequest(e -> {
			e.consume(); //<- Telling java that we are going to take care of it.
			closeProgram();
		});
		
		button.setOnAction(e -> {
			closeProgram();
		});
		
		StackPane layout = new StackPane();
		layout.getChildren().add(button);
		Scene scene  = new Scene(layout, 300, 200);
		window.setScene(scene);
		window.show();
	}

	private void closeProgram() {
		Boolean answer = ConfirmBox.display("Title","Sure you want to exit?");
		if(answer) {
			window.close();
		}
	}
}
