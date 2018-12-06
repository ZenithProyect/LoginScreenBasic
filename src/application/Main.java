/*
@Author Alejandro Baro
*/

package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	private Stage ventanaInicio;
	
	@Override
	public void start(Stage primaryStage) {
		ventanaInicio = primaryStage;
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Login.fxml"));
		
		try {
			AnchorPane panelLogin = loader.load();
			
			ventanaInicio.setScene(new Scene(panelLogin));
			ventanaInicio.initStyle(StageStyle.UNDECORATED);
			ventanaInicio.centerOnScreen();
			ventanaInicio.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
