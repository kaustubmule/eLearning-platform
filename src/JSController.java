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

public class JSController {

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
            question.setText("1. Correct place to insert JavaScript?");
            opt1.setText("The <head> section");
            opt2.setText("The <body> section");
            opt3.setText("Both of the above");
            opt4.setText("None of the above");
        }
        if (counter == 1) { //Question 2
            question.setText("2. What is the correct syntax for referring to an external script called 'xxx.js'?");
            opt1.setText("<script name='xyz.js'");
            opt2.setText("<script src='xyz.js'");
            opt3.setText("<script href='xyz.js'");
            opt4.setText("<script link='xyz.js'");
        }
        if (counter == 2) { //Question 3
            question.setText("3. How do you write 'Hello World' in an alert box?");
            opt1.setText("alert('Hello World');");
            opt2.setText("alertBox('Hello World);");
            opt3.setText("msg('Hello World');");
            opt4.setText("msgBox('Hello World');");
        }
        if (counter == 3) { //Question 4
            question.setText("4. How do you create a function in JavaScript?");
            opt1.setText("function myFunc()");
            opt2.setText("function = myFunc()");
            opt3.setText("function: myFunc()");
            opt4.setText("None of the above");
        }
        if (counter == 4) {//Question 5
            question.setText("5. How to write an IF statement in JavaScript?");
            opt1.setText("if i=5");
            opt2.setText("if i = 5 then");
            opt3.setText("if i==5 then");
            opt4.setText("if(i==5)");
        }
        if (counter == 5) { //Question 6
            question.setText("6. WHat is teh output of: new Array(5).toString();");
            opt1.setText("[]");
            opt2.setText("'[]'");
            opt3.setText("[',,,,']");
            opt4.setText("',,,,'");
        }
        if (counter == 6) { //Question 7
            question.setText("7. String('hello')==='hello'");
            opt1.setText("true");
            opt2.setText("false");
            opt3.setText("Error");
            opt4.setText("None of the above");
        }
        if (counter == 7) { //Question 8
            question.setText("8.What is the result of: '1'--'1'");
            opt1.setText("0");
            opt2.setText("'11'");
            opt3.setText("2");
            opt4.setText("11");
        }
        if (counter == 8) { //Question 9
            question.setText("9. (true+false) > 2 + true");
            opt1.setText("true");
            opt2.setText("false");
            opt3.setText("Error");
            opt4.setText("None of the above");
        }
        if (counter == 9) { //Question 10
            question.setText("10.What is the output: Number('1')-1==0");
            opt1.setText("true");
            opt2.setText("false");
            opt3.setText("TypeError");
            opt4.setText("None of the above");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JSResult.fxml"));
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
            if (answer.equals("Both of the above")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("<script src='xyz.js'")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("alert('Hello World');")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("function myFunc()")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("if(i==5)")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("',,,,'")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("true")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("2")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("false")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("true")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JSResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JSResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JSResult.fxml"));
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
