import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.types.StorageManager;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		StorageManager storageManager = EmbeddedStorage.start();
		TableView<Test> tableView = new TableView<>();
		var test = new Test();
		tableView.getItems().add(test);
		Scene scene = new Scene(tableView);
		primaryStage.setScene(scene);
		primaryStage.show();
		storageManager.setRoot(test);
		storageManager.storeRoot();
	}
}
