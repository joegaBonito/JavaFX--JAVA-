import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	Button button;
	Scene scene;
	ComboBox<String> comboBox;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Joe's Meat Subs");
		button = new Button("Submit");
		
		comboBox = new ComboBox<>();
		comboBox.getItems().addAll(
			"Good will Hunting",
			"St.Vincent",
			"Blackhat"
		);
		
		comboBox.setPromptText("What is your favorite movie?");
		comboBox.setEditable(true);
		
		
		comboBox.setOnAction(e -> System.out.println("User Selected " + comboBox.getValue()));
		button.setOnAction(e -> printMovie());
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20,20,20,20));
		layout.getChildren().addAll(comboBox, button);
		
		scene = new Scene(layout,300,300);
		window.setScene(scene);
		window.show();
	}

	private void printMovie() {
		System.out.println(comboBox.getValue());
	}
}
