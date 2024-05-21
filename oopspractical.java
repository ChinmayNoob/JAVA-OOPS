import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Main extends Application{
  @Override
    public void start(Stage primaryStage) {
        Circle circle = new Circle(200, 200, 100, Color.BLUE);

        circle.setOnMousePressed(e -> {
            circle.setFill(Color.RED);
        });
        circle.setOnMouseReleased(e -> {
            circle.setFill(Color.BLUE);
        });
        Pane root = new Pane();
        root.getChildren().add(circle);

        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Circle Mouse Events");  
        primaryStage.setScene(scene);
        primaryStage.show();
    }  
    public static void main(String[] args) {
        launch(args);
    }
}