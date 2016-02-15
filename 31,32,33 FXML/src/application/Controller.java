package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class Controller implements Initializable {

	public Label firstLabel;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
			System.out.println("Loading User data...");
	}
	/*
	public Button button;
	
	public void handleButtonClick() {
		System.out.println("Run some code the user doesn't see");
		button.setText("Stop Touching ME!");
	}
	*/
	
}
