import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	TableView<Product> table;
	TextField nameInput, priceInput, quantityInput;
	
	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("JavaFX");
		
		//name column
		TableColumn<Product,String> nameColumn = new TableColumn<>("Name"); 
		nameColumn.setMinWidth(200);
		nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		//price column
		TableColumn<Product,Double> priceColumn = new TableColumn<>("Price"); 
		priceColumn.setMinWidth(200);
		priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
		
		//quantity column
		TableColumn<Product,Integer> quantityColumn = new TableColumn<>("Quantity"); 
		quantityColumn.setMinWidth(200);
		quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

		//nameInput
		nameInput = new TextField();
		nameInput.setPromptText("Name");
		nameInput.setMinWidth(100);
		
		//priceInput
		priceInput = new TextField();
		priceInput.setPromptText("Price");
		priceInput.setMinWidth(100);
		
		//quantityInput
		quantityInput = new TextField();
		quantityInput.setPromptText("Quantity");
		quantityInput.setMinWidth(100);
		
		//Button
		Button addButton = new Button("Add");
		addButton.setOnAction(e-> addButtonClicked());
		Button deleteButton = new Button("Delete");
		deleteButton.setOnAction(e-> deleteButtonClicked());
		
		HBox hBox = new HBox();
		hBox.setPadding(new Insets(10,10,10,10));
		hBox.setSpacing(10);
		hBox.getChildren().addAll(nameInput,priceInput,quantityInput,addButton,deleteButton);
		
		
		table = new TableView<>();
		table.setItems(getProduct());
		table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);
		
		//Layout
		VBox layout = new VBox();
		layout.getChildren().addAll(table,hBox);
		Scene scene = new Scene(layout);
		window.setScene(scene);
		window.show();
	}
	public void deleteButtonClicked() {
		ObservableList<Product> productSelected, allProducts;
		allProducts = table.getItems();
		productSelected = table.getSelectionModel().getSelectedItems();
		productSelected.forEach(allProducts::remove);
	}

	public void addButtonClicked() {
		Product product = new Product();
		product.setName(nameInput.getText());
		product.setPrice(Double.parseDouble(priceInput.getText()));
		product.setQuantity(Integer.parseInt(quantityInput.getText()));
		table.getItems().addAll(product);
		nameInput.clear();
		priceInput.clear();
		quantityInput.clear();
	}

	public ObservableList<Product> getProduct() {
		ObservableList<Product> products = FXCollections.observableArrayList();
		products.add(new Product("LapTop", 859, 20));
		products.add(new Product("Bouncy Ball", 2.49, 198));
		products.add(new Product("Toilet", 99, 74));
		products.add(new Product("The Notebook DVD", 19.99, 12));
		products.add(new Product("Corn", 1.49, 256));
		return products;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

