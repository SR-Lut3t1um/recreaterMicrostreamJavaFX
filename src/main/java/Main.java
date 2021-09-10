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
		TableView<Test> asd = new TableView<>();
		asd.getItems().add(new Test());
		Scene scene = new Scene(asd);
		primaryStage.setScene(scene);
		primaryStage.show();
		storageManager.setRoot(asd);
		storageManager.storeRoot();
	}
}
