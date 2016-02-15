import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
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

		//Form
		TextField nameInput = new TextField();
		
		button = new Button("Click me");
		button.setOnAction(e -> {
			isInt(nameInput,nameInput.getText());
		});
		
		//Layout
		VBox layout = new VBox();
		layout.setPadding(new Insets(20,20,10,10));
		layout.getChildren().addAll(nameInput, button);
		
		Scene scene = new Scene(layout,300,300);
		window.setScene(scene);
		window.show();
	}

	private boolean isInt(TextField input, String message) {
		try {
			int age = Integer.parseInt(input.getText());
			System.out.println("User is " + age);
			return true;
		} catch(NumberFormatException e) {
			System.out.println("Error: " + message + "is not a number");
			return false;
		}
	}
}
