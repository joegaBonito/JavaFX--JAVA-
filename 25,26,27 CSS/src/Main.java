import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Joe Jung - JavaFx");
		
		//GridPane with 10px padding around edge
		GridPane layout = new GridPane();
		layout.setPadding(new Insets(10,10,10,10));
		layout.setVgap(8);
		layout.setHgap(10);
		
		
		//Name Label - constraints use (child, column, row)
		Label nameLabel = new Label("Username: ");
		nameLabel.setId("bold-label");
		GridPane.setConstraints(nameLabel, 0, 0);
		
		//Name Input
		TextField nameInput = new TextField();
		GridPane.setConstraints(nameInput, 1, 0);
		nameInput.setPromptText("Name");
		
		//Password Label - constraints use (child, column, row)
		Label passLabel = new Label("Password: ");
		GridPane.setConstraints(passLabel, 0, 1);
		
		//Password Input
		TextField passInput = new TextField();
		GridPane.setConstraints(passInput, 1, 1);
		passInput.setPromptText("Password");
				
		 //Login
		Button loginButton = new Button("Log In");
		GridPane.setConstraints(loginButton, 1, 2);
		
		//Sign up
		Button signUpButton = new Button("Sign Up");
		signUpButton.getStyleClass().add("button-blue");
		GridPane.setConstraints(signUpButton,1,3);
		
		/*
		loginButton.setOnAction(e -> {
			setUserAgentStylesheet(STYLESHEET_CASPIAN);
		});
		*/
		
		//Add everything to grid
		layout.getChildren().addAll(nameLabel, nameInput, passLabel, passInput, loginButton, signUpButton);
		
		Scene scene = new Scene(layout, 300, 200);
		scene.getStylesheets().add("Viper.css");
		window.setScene(scene);
		
		window.show();
	}
}
