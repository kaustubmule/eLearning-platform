import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LearnPHPController {
    private Stage stage;
    private Scene scene;
    @FXML
    private Button backButton;

    @FXML
    private Button quizButton;

    @FXML
    void backButtonClicked(ActionEvent event) throws IOException {
        System.out.println("back");
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
        System.out.println("quiz");
        Parent root = FXMLLoader.load(getClass().getResource("Php.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.setTitle("Quiz Page");
        stage.show();
    }

}
