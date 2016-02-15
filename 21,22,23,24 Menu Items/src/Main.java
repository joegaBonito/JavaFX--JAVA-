import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	Stage window;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage)throws Exception {
		window = primaryStage;
		window.setTitle("JoeJung");
		
		//File Menu
		Menu fileMenu = new Menu("File");
		MenuItem newFile = new MenuItem("New...");
		newFile.setOnAction(e -> System.out.println("Create a new file"));
		fileMenu.getItems().add(newFile);
		fileMenu.getItems().addAll(new MenuItem("Open..."));
		fileMenu.getItems().addAll(new MenuItem("Save..."));
		fileMenu.getItems().addAll(new SeparatorMenuItem());
		fileMenu.getItems().addAll(new MenuItem("Settings..."));
		fileMenu.getItems().addAll(new SeparatorMenuItem());
		fileMenu.getItems().addAll(new MenuItem("Exit..."));
		
		//Edit Menu
		Menu editMenu  = new Menu("_Edit"); // _ is giving short cut with _ + e
		editMenu.getItems().addAll(new MenuItem("Cut"));
		editMenu.getItems().addAll(new MenuItem("Copy"));
		MenuItem paste = new MenuItem("Paste");
		paste.setOnAction(e -> System.out.println("Pasting some crap"));
		paste.setDisable(true);
		editMenu.getItems().add(paste);
		
		//Help Menu
		Menu helpMenu = new Menu("Help");
		CheckMenuItem showLines = new CheckMenuItem("Show Line numbers");
		showLines.setOnAction(e -> {
			if(showLines.isSelected()) {
				System.out.println("Program will now display line numbers");
			} else {
				System.out.println("Hiding line numbers");
			}
		});
		CheckMenuItem autoSave = new CheckMenuItem("Enable Autosave");
		autoSave.setSelected(true);
		helpMenu.getItems().addAll(showLines,autoSave);
		
		//Difficulty RadioMenuItems
		Menu difficultyMenu = new Menu("Difficulty");
		ToggleGroup difficultyToggle = new ToggleGroup();
		
		RadioMenuItem easy = new RadioMenuItem("Easy");
		RadioMenuItem medium = new RadioMenuItem("Medium");
		RadioMenuItem difficult = new RadioMenuItem("Difficult");
		easy.setToggleGroup(difficultyToggle);
		medium.setToggleGroup(difficultyToggle);
		difficult.setToggleGroup(difficultyToggle);
		
		difficultyMenu.getItems().addAll(easy,medium,difficult);
		
		//Main MenuBar
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(fileMenu,editMenu, helpMenu, difficultyMenu);
		
		
		BorderPane layout = new BorderPane();
		layout.setTop(menuBar);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}
}
