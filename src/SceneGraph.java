/**
 * I'm currently using vim text editor to write all my
 * javafx programs so I'm not making use of the autocomplete intellisense nor debugger. 
 * I kind of find it better to type everything from scratch while
 * learning to use a framework or a new programming language 
 * instead of making use of the autocompletion from an IDE. 
 * It really helps me learn the framework or languages a
 * lot better. However, after this sample I will
 * start to use the Netbeans IDE instead of vim for 
 * all my programs. 
 *  -Antonio Rios
 **/

// import the necessary classes needed for the application
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Label;

//Every javafx application must extend the Application class
public class SceneGraph extends Application {

   
    public static void main(String[] args){
      launch(args);
    }

    // main entry point of the javafx application
    public void start(Stage primaryStage){

      // The layout used for this application is the BorderPane.
   
      BorderPane root = new BorderPane();

      // adding leaf node
      Circle circle = new Circle(200, 200, 100);
      circle.setFill(Color.CORAL);

      Label lblTitle = new Label("My First Javafx Application Adding Shapes to A Scene");

      root.setAlignment(lblTitle, Pos.CENTER);
      root.setCenter(lblTitle);
      lblTitle.setVisible(true); 

      root.setAlignment(circle, Pos.CENTER);
      root.setBottom(circle);

      Scene scene = new Scene(root, 400,400);

      primaryStage.setTitle("Adding a Circle Shape to the Scene");
      primaryStage.setScene(scene);
      primaryStage.show();

    }
}
