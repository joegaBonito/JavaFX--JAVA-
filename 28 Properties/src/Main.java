import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Joe Jung java-fx");
		
		Person Joe = new Person();
		Joe.firstNameProperty().addListener((v, oldValue, newValue)-> {
			System.out.println("Name Change to " + newValue);
			System.out.println("firstNameProperty" + Joe.firstNameProperty());
			System.out.println("getFirstName()" + Joe.getFirstName());
		});
		
		Button button = new Button("Submit");
		button.setOnAction(e->Joe.setFirstName("Porky"));
		
		StackPane stackpane = new StackPane();
		stackpane.getChildren().addAll(button);
		Scene scene = new Scene(stackpane);
		window.setScene(scene);
		window.show();
	}
}
