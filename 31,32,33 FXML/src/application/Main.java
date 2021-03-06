package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {	
		try {
			Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
			primaryStage.setTitle("Hello World");
			primaryStage.setScene(new Scene(root,300,275));
			primaryStage.show();
		} catch(Exception e) {
	 		e.printStackTrace();
		}
	}
}
