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

public class pythonController {

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
            question.setText("1. What is a correct syntax to output 'Hello World' in Python?");
            opt1.setText("echo 'Hello World'");
            opt2.setText("p('Hello World')");
            opt3.setText("echo('Hello World')");
            opt4.setText("print'Hello World'");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Which one is NOT a legal variable name?");
            opt1.setText("MyVar");
            opt2.setText("my-var");
            opt3.setText("My_Var");
            opt4.setText("_MyVar");
        }
        if (counter == 2) { //Question 3
            question.setText(
                    "3. What is the correct way to create a function in Python?");
            opt1.setText("def Myfunc():");
            opt2.setText("create myFunc();");
            opt3.setText("function myFunc():");
            opt4.setText("Both A and C");
        }
        if (counter == 3) { //Question 4
            question.setText("4. What is a correct syntax to return the first character in a string?");
            opt1.setText("x=sub('Hello',0,1)");
            opt2.setText("x = 'Hello'.sub(0,1)");
            opt3.setText("x='Hello'[0]");
            opt4.setText("x='Hello'.charAt(0);");
        }
        if (counter == 4) {//Question 5
            question.setText(
                    "5. Which method can be used to remove any whitespace from both the beginning and the end of a string?");
            opt1.setText("ptrim()");
            opt2.setText("len()");
            opt3.setText("strip()");
            opt4.setText("trim()");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Which method can be used to return a string in upper case letters?");
            opt1.setText("uppercase()");
            opt2.setText("upper()");
            opt3.setText("upperCase()");
            opt4.setText("toUpperCase()");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Which of these collections defines a LIST?");
            opt1.setText("{'name':'apple','color':'green'}");
            opt2.setText("('apple','banana','cherry')");
            opt3.setText("{'apple','banana','cherry'}");
            opt4.setText("['apple','banana','cherry']");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Which collection is ordered, changeable, and allows duplicate members? ");
            opt1.setText("LIST");
            opt2.setText("SET");
            opt3.setText("TUPLE");
            opt4.setText("DICTIONARY");
        }
        if (counter == 8) { //Question 9
            question.setText("9. How do you create a variable with the floating number 2.8?");
            opt1.setText("x=2.8");
            opt2.setText("x=float(2.8)");
            opt3.setText("Both A and B");
            opt4.setText("None of the Above");
        }
        if (counter == 9) { //Question 10
            question.setText(
                    "10. What is the correct syntax to output the type of a variable or object in Python?");
            opt1.setText("print(typeof(x))");
            opt2.setText("print(typeOf(x))");
            opt3.setText("print(type(x))");
            opt4.setText("print(typeof x)");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("PythonResult.fxml"));
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
            if (answer.equals("print'Hello World'")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("my-var")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("def Myfunc():")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("x='Hello'[0]")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("strip()")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("upper()")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("['apple','banana','cherry']")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("LIST")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Both A and B")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("print(type(x))")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("PythonResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("PythonResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("PythonResult.fxml"));
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
