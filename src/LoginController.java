import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController {

    public String name = "admin";
    public String pwd = "admin";
    private Stage stage;
    private Scene scene;

    @FXML
    private Button loginButton;

    @FXML
    private Label loginLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField passwordField;

    @FXML
    private Label pwdLabel;

    @FXML
    private TextField userField;

    @FXML
    private Label wrongnameLabel;

    @FXML
    private Label wrongpwdLabel;

    @FXML
    private Label successMSG;

    @FXML
    void afterClicked(ActionEvent event) throws IOException {
        String username = userField.getText();
        String password = passwordField.getText();

        if (username.equals(name) && password.equals(pwd)) {
            System.out.println("Logged in successfuly");
            wrongnameLabel.setText("");
            wrongpwdLabel.setText("");
            loginLabel.setText("");
            nameLabel.setText("");
            pwdLabel.setText("");
            passwordField.setVisible(false);
            userField.setVisible(false);
            successMSG.setText("Logged in successfuly");

            //gotohomepg
            Parent root = FXMLLoader.load(getClass().getResource("MainPage.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            String css = this.getClass().getResource("login.css").toExternalForm();
            scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.setTitle("Main Page");
            stage.show();
        } else {
            System.out.println("Error");
            if (!username.equals("admin"))
                wrongnameLabel.setText("Wrong Name");
            else
                wrongpwdLabel.setText("Wrong Password");
        }

    }

}
