package GUI_josh;
// TestApp.java
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestApp extends Application {
    @Override
    public void start(Stage stage) {
        Label label = new Label("JavaFX 설정 성공 🎉");
        Scene scene = new Scene(label, 400, 200);
        stage.setScene(scene);
        stage.setTitle("JavaFX 테스트");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

public class todolist {




}
