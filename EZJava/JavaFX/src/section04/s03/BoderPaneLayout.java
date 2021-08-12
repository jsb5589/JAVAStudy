/*
 * BorderPane Container Layout
 * 	- 수직, 수평으로 배치하는 컨테이너
 */
package section04.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BoderPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("BorderPane Layout");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
