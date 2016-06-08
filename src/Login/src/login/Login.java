/**
 * A simple login screen example demonstrating how to do
 * a simple javafx application. Makes use of the GridPane
 * and HBox layouts. The TextField, Label, Button, and Text
 * controls are used and how to aligned the nodes on the scene
 * is demonstrated.
 *
 **/
package login;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Antonio Rios
 */
public class Login extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        
        Scene scene = new Scene(grid, 300, 275);
        
        Text sceneTitle = new Text("Please Loging: ");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Label userName = new Label("User Name: ");
        
        TextField userTextField = new TextField();
        Label pw = new Label("Password: ");
        PasswordField pwBox = new PasswordField();
        
        grid.add(sceneTitle, 0, 0, 2, 1);
        grid.add(userName, 0,1);
        grid.add(userTextField, 1,1);
        grid.add(pw, 0,2);
        grid.add(pwBox, 1,2);
        
        //grid.setGridLinesVisible(true);
        
        Button btn = new Button("Sign in");
           
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_CENTER);
        hbBtn.getChildren().add(btn);
        
        grid.add(hbBtn, 1, 4);
        
        final Text actionTarget = new Text();
        
        grid.add(actionTarget, 1,6);
        
        btn.setOnAction(event -> {
                actionTarget.setFill(Color.FIREBRICK);
                actionTarget.setText("Sign in button pressed");
        }
        );
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
