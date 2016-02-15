import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
	private StringProperty firstName = new SimpleStringProperty();

	//returns the StringProperty object
	public StringProperty firstNameProperty(){
		return firstName;
	}
	//Return the firstName value (i.e. "Bucky")
	public String getFirstName() {
		return firstName.get();
	}
	//Set the firstName value 
	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}
	
	
}
