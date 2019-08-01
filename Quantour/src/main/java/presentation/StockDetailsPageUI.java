package presentation;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class StockDetailsPageUI extends VBox{
	public StockDetailsPageUI(VBox beforeVBox,Stage stage,String stockName,ScrollPane contentScrollPane){
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/StockDetailsPage2.fxml"));
		try{
			this.getChildren().add(fxmlLoader.load());
		}catch(IOException e){
			e.printStackTrace();
		}
		
		StockDetailsPageUIController controller = fxmlLoader.getController();
		controller.init(beforeVBox,stage,stockName,contentScrollPane);
	}
}
