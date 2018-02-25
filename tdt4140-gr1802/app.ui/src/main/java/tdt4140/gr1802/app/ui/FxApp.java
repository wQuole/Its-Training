package tdt4140.gr1802.app.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FxApp extends Application {
	
	Stage window;
	Scene loginScreen, signUpScreen, mainScreen;
	


	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Parent root = FXMLLoader.load(getClass().getResource("LoginScreen.fxml"));
		Scene scene = new Scene(root, 800, 600);
		// scene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
	
	public void setToSignUpStage(Stage stage) {
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	

}
