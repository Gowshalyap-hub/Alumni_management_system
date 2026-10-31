
package alumni;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginApp extends Application {

    @Override
    public void start(Stage stage) {

        Label title = new Label("ALUMNI MANAGEMENT SYSTEM");
        title.setStyle(
            "-fx-font-size: 20px;" +
            "-fx-font-weight: bold;"
        );

        Label userLabel = new Label("Username");

        TextField username = new TextField();
        username.setPromptText("Enter username");

        Label passLabel = new Label("Password");

        PasswordField password = new PasswordField();
        password.setPromptText("Enter password");

        Button loginButton = new Button("Login");

        Label message = new Label();

        loginButton.setOnAction(event -> {

        	if (username.getText().equals("admin")
        	        && password.getText().equals("1234")) {

        	    message.setText("Login successful!");

        	    stage.close();

        	    JavaProject.Main.main(new String[0]);

        	} else {

        	    message.setText("Invalid username or password!");
        	}
        });

        VBox layout = new VBox(
            12,
            title,
            userLabel,
            username,
            passLabel,
            password,
            loginButton,
            message
        );

        layout.setAlignment(Pos.CENTER);
        layout.setPadding(new Insets(25));

        Scene scene = new Scene(layout, 400, 350);

        stage.setTitle("Alumni Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
