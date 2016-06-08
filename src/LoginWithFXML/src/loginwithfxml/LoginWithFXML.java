/*
 * The following javafx application demonstrates the
 * use of FXML to seperate the UI logic from the the 
 * main application.
 */
package loginwithfxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Antonio
 */
public class LoginWithFXML extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        // the important thing to note here is the way an FXML document containing
        // the actual UI is loaded to this application.
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root, 300, 275);
        stage.setTitle("Using FXML");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
