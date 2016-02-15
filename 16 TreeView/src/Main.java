import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	TreeView<String> tree;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX");
	
		TreeItem<String> root, Joe, Lesley;
		
		//Root
		root = new TreeItem<>();
		root.setExpanded(true);
		
		//Joe Branch
		Joe = makeBranch("Joe",root);
		makeBranch("Joe New York", Joe);
		makeBranch("Youtube", Joe);
		makeBranch("Chicken", Joe);
		makeBranch("Soccer", Joe);
		
		//Lesley Branch
		Lesley = makeBranch("Lesley",root);
		makeBranch("Lesley New York", Lesley);
		makeBranch("Remember", Lesley);
		makeBranch("Love", Lesley);

		//Create tree
		tree = new TreeView<>(root);
		tree.setShowRoot(false);
		tree.getSelectionModel().selectedItemProperty().
			addListener((v, oldValue, newValue) -> {
				if(newValue != null) {
					System.out.println(newValue.getValue());
				}
			});
		
		//Layout
		StackPane layout = new StackPane();
		layout.getChildren().add(tree);
		Scene scene = new Scene(layout,300,250);
		window.setScene(scene);
		window.show();
	}

	private TreeItem<String> makeBranch(String title, TreeItem<String> parent) {
		TreeItem<String> item = new TreeItem<>(title);
		item.setExpanded(true);
		parent.getChildren().add(item);
		return item;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

