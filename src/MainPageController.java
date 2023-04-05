import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPageController {
    private Stage stage;
    private Scene scene;
    @FXML
    private Button learningResourcesButton;

    @FXML
    private Button quizButton;

    @FXML
    void learningResourcesButtonClicked(ActionEvent event) throws IOException {
        System.out.println("lr clicked");
        Parent root = FXMLLoader.load(getClass().getResource("LearningResources.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Learning Page");
        stage.show();
    }

    @FXML
    void quizButtonClicked(ActionEvent event) throws IOException {
        System.out.println("quiz clicked");
        Parent root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Quiz Page");
        stage.show();
    }

}
