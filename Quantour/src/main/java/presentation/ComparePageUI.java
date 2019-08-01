package presentation;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class ComparePageUI extends VBox{
	public ComparePageUI(Stage stage, ScrollPane contentScrollPane, String stock1, String stock2, LocalDate startDate,LocalDate endDate) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/ComparePage1.fxml"));
		try{
			this.getChildren().add(fxmlLoader.load());
		}catch(IOException e){
			e.printStackTrace();
		}
			
		ComparePageUIController controller = fxmlLoader.getController();
		controller.init(this,stage,contentScrollPane,stock1,stock2,startDate,endDate);
	}
}
