// Write a GUI program that use button to move the message to the left and right and use the radio button to change the color for the message displayed.

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    private Text message;

    @Override
    public void start(Stage primaryStage) {
        message = new Text("Hello, Replit!");
        message.setFont(Font.font(20));

        Button moveLeftButton = new Button("Move Left");
        moveLeftButton.setOnAction(e -> moveMessageLeft());

        Button moveRightButton = new Button("Move Right");
        moveRightButton.setOnAction(e -> moveMessageRight());

        ToggleGroup colorGroup = new ToggleGroup();
        RadioButton redRadio = new RadioButton("Red");
        redRadio.setToggleGroup(colorGroup);
        redRadio.setOnAction(e -> setMessageColor("red"));

        RadioButton blueRadio = new RadioButton("Blue");
        blueRadio.setToggleGroup(colorGroup);
        blueRadio.setOnAction(e -> setMessageColor("blue"));

        HBox controls = new HBox(10, moveLeftButton, moveRightButton, redRadio, blueRadio);
        StackPane root = new StackPane(message, controls);

        Scene scene = new Scene(root, 400, 200);

        primaryStage.setTitle("Message Mover and Color Changer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void moveMessageLeft() {
        message.setTranslateX(message.getTranslateX() - 10);
    }

    private void moveMessageRight() {
        message.setTranslateX(message.getTranslateX() + 10);
    }

    private void setMessageColor(String color) {
        message.setFill(Color.valueOf(color.toUpperCase()));
    }

    public static void main(String[] args) {
        launch(args);
    }
}