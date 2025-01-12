package presentation;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HistoryClosePageUI extends VBox{
	public HistoryClosePageUI(Stage stage, int id)
	{
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/HistoryClosePage.fxml"));
		try
		{
			this.getChildren().add(fxmlLoader.load());
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		HistoryClosePageUIController controller = fxmlLoader.getController();
		controller.init(stage,id);
	}
}
