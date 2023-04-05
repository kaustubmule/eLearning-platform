import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LearningResourcesController {
    private Stage stage;
    private Scene scene;
    @FXML
    private Button javaButton;

    @FXML
    private Button cppButton;

    @FXML
    private Button cButton;

    @FXML
    private Button pythonButton;

    @FXML
    private Button phpButton;

    @FXML
    private Button gohomeButton;

    @FXML
    private Button jsButton;
    
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
    void cClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LearnC.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String csss = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(csss);
        stage.setScene(scene);
        stage.setTitle("C Page");
        stage.show();
    }

    @FXML
    void cppClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LearnCpp.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String csss = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(csss);
        stage.setScene(scene);
        stage.setTitle("Cpp Page");
        stage.show();
    }

    @FXML
    void javaClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LearnJava.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String csss = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(csss);
        stage.setScene(scene);
        stage.setTitle("Java Page");
        stage.show();
    }

    @FXML
    void jsClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LearnJS.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String csss = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(csss);
        stage.setScene(scene);
        stage.setTitle("JavaScript Page");
        stage.show();
    }

    @FXML
    void phpClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LearnPHP.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String csss = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(csss);
        stage.setScene(scene);
        stage.setTitle("PHP Page");
        stage.show();
    }

    @FXML
    void pythonClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("LearnPy.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String csss = this.getClass().getResource("login.css").toExternalForm();
        scene.getStylesheets().add(csss);
        stage.setScene(scene);
        stage.setTitle("PHP Page");
        stage.show();
    }

}
