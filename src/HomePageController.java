import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.Node;
import javafx.scene.Parent;

public class HomePageController {
    private Stage stage;
    private Scene scene;
    @FXML
    private ImageView homeicon;

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
    private Button jsButton;

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
    void cppClicked(ActionEvent event) throws IOException {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Cpp.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);
        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

    @FXML
    void javaClicked(ActionEvent event) throws IOException {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Java.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

    @FXML
    void cClicked(ActionEvent event) throws IOException {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("C.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

    @FXML
    void pythonClicked(ActionEvent event) throws IOException {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Python.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

    @FXML
    void jsClicked(ActionEvent event) throws IOException {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("JS.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

    @FXML
    void phpClicked(ActionEvent event) throws IOException {
        Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        thisstage.close();

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Php.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.show();
    }

}
