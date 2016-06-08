/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askme;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author Antonio
 */
public class FXMLDocumentController implements Initializable {

    String[] answers = {"It is certain",
        "It is decidedly so",
        "Without a doubt",
        "Yes, definitely",
        "You may rely on it",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes",
        "Reply hazy try again",
        "Ask again later",
        "Better not tell you now",
        "Cannot predict now",
        "Concentrate and ask again",
        "Don't count on it",
        "My reply is no",
        "My sources say no",
        "Outlook not so good",
        "Very doubtful"};

    private int index;
    @FXML
    private TextField txtFld;

    @FXML
    private Text magicAnswer;

    @FXML
    private void handleSubmitButtonAction(ActionEvent event) {
        if (!(txtFld.getText().equals(""))) {

            index = (int) (Math.random() * (answers.length - 1));
            System.out.println(index);
            txtFld.clear();
            System.out.println("The answer is: " + answers[index]);
            magicAnswer.setText(answers[index]);
        }
        else{
            System.out.println("Empty TextField");
            magicAnswer.setText("Please enter a question in the text field.");
                    
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
