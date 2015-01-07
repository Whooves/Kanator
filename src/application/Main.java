package application;
	
import java.util.LinkedHashSet;

import data.Card;
import data.Director;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("/gui/mainGUI.fxml"));
			AnchorPane root = loader.load();
			Scene scene = new Scene(root);
			primaryStage.setTitle("Kanator - \u304B\u306a\u30c8\u30eb v.1.0.1");
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
