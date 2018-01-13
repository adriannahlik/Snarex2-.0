package de.hftstuttgart.snarex.main;

import de.hftstuttgart.snarex.view.ZugriffsKlasse;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		Pane mainPane = (Pane) FXMLLoader.load(ZugriffsKlasse.class.getResource(("View.fxml")));
		primaryStage.setScene(new Scene(mainPane));
		primaryStage.setTitle("Snarex");
		primaryStage.show();
	}

}
