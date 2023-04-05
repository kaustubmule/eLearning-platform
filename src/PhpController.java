import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PhpController {

    @FXML
    public Label question;

    @FXML
    public Button opt1, opt2, opt3, opt4;

    static int counter = 0;
    static int correct = 0;
    static int wrong = 0;

    @FXML
    private void initialize() {
        loadQuestions();
    }

    private void loadQuestions() {

        if (counter == 0) { //Question 1
            question.setText("1. What does Php stand for?");
            opt1.setText("Personal Hypertext Processor");
            opt2.setText("Hypertext Preprocessor");
            opt3.setText("Pretext Hypertext processor");
            opt4.setText("Private home page");
        }
        if (counter == 1) { //Question 2
            question.setText("2. How does name of the variable in PHP start?");
            opt1.setText("!");
            opt2.setText("$");
            opt3.setText("&");
            opt4.setText("#");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Correect way to declare constants in php?");
            opt1.setText("const");
            opt2.setText("define");
            opt3.setText("var");
            opt4.setText("let");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Which of the below method is used to generate the unique id in Php?");
            opt1.setText("unique()");
            opt2.setText("id()");
            opt3.setText("mid()");
            opt4.setText("None of the above");
        }
        if (counter == 4) {//Question 5
            question.setText("5. Which of the following is the correct way to concrete() the two strings in PHP?");
            opt1.setText(".");
            opt2.setText("+");
            opt3.setText("Append");
            opt4.setText("All of the above");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Which of the below function display the configuration in PHP? ?");
            opt1.setText("php_display()");
            opt2.setText("phpinfo()");
            opt3.setText("info_config()");
            opt4.setText("none of the above");
        }
        if (counter == 6) { //Question 7
            question.setText("7. What is the correct way to create a function in php");
            opt1.setText("function myFunc()");
            opt2.setText("create myFunc()");
            opt3.setText("new_function myFunc()");
            opt4.setText("def myFunc()");
        }
        if (counter == 7) { //Question 8
            question.setText("8. How do you create a cookie in PHP?");
            opt1.setText("createcookie");
            opt2.setText("setcookie");
            opt3.setText("makecookie");
            opt4.setText("havecookie");
        }
        if (counter == 8) { //Question 9
            question.setText("9. How do you create an array in php?");
            opt1.setText("$cars = array['Volvo','BMW','Toyota']");
            opt2.setText("$cars='Volvo','BMW','Toyota'");
            opt3.setText("$cars = array('Volvo','BMW','Toyota')");
            opt4.setText("$cars={'Volvo','Toyota','BMW'}");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Which operator is used to check if two values are equal and of same data type?");
            opt1.setText("=");
            opt2.setText("!=");
            opt3.setText("==");
            opt4.setText("===");
        }

    }

    @FXML
    public void opt1clicked(ActionEvent event) {
        checkAnswer(opt1.getText().toString());
        if (checkAnswer(opt1.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("phpResult.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);

                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }

    }

    boolean checkAnswer(String answer) {

        if (counter == 0) {
            if (answer.equals("Hypertext Preprocessor")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("$")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("define")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("unique()")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals(".")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("phpinfo()")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("function myFunc()")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("setcookie")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("$cars = array('Volvo','BMW','Toyota')")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("===")) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @FXML
    public void opt2clicked(ActionEvent event) {
        checkAnswer(opt2.getText().toString());
        if (checkAnswer(opt2.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("phpResult.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);

                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt3clicked(ActionEvent event) {
        checkAnswer(opt3.getText().toString());
        if (checkAnswer(opt3.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("phpResult.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);

                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

    @FXML
    public void opt4clicked(ActionEvent event) {
        checkAnswer(opt4.getText().toString());
        if (checkAnswer(opt4.getText().toString())) {
            correct = correct + 1;
        } else {
            wrong = wrong + 1;
        }
        if (counter == 9) {
            try {
                System.out.println(correct);
                Stage thisstage = (Stage) ((Button) event.getSource()).getScene().getWindow();
                thisstage.close();
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("phpResult.fxml"));
                Scene quizscene = new Scene(quiz.load());
                quizscene.setFill(Color.TRANSPARENT);
                Stage quizstage = new Stage();
                quizstage.setScene(quizscene);

                quizstage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            counter++;
            loadQuestions();
        }
    }

}
