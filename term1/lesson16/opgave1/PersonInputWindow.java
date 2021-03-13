package term1.lesson16.opgave1;

import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class PersonInputWindow extends Stage {
    
	private TextField txtName;
	private TextField txtTitle;
	private CheckBox isSenior;

    

		
    private void createPerson() {
        String name = this.txtName.getText().trim();
		String title = this.txtTitle.getText().trim();
		boolean senior = this.isSenior.isSelected();
    }

    }
