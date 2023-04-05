import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
public class phpResultController {
    private Stage stage;
    private Scene scene;
    @FXML
    private Label resultLabel;

    @FXML
    private Button showResultButton;

    @FXML
    private Button gohomeButton;

    @FXML
    private Button quitButton;

    @FXML
    void quitButtonClicked(ActionEvent event) {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();
    }

    @FXML
    void gohomeButtonClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Main Page");
        stage.show();
    }
    @FXML
    void showResultButtonClicked(ActionEvent event) {

        System.out.println("JS Result" + PhpController.correct);
        String resString = "Result\nCorrect Answers : " + PhpController.correct + "\nWrong Answers : "
                + PhpController.wrong;
        resultLabel.setText(resString);
    }

}