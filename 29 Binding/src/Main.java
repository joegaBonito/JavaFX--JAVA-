import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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
		window.setTitle("Joe Jung java-fx");
		
		button = new Button("Submit");
		
		IntegerProperty x = new SimpleIntegerProperty(3);
		IntegerProperty y = new SimpleIntegerProperty();
		
		y.bind(x.multiply(10));
		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue() + "\n");
		
		x.setValue(9);
		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue() + "\n");
		
		StackPane stackpane = new StackPane();
		stackpane.getChildren().addAll(button);
			
		Scene scene = new Scene(stackpane,300,250);
		window.setScene(scene);
		window.show();
	}

}
