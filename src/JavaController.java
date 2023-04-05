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

public class JavaController {

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
            question.setText("1. Number of primitive data types in Java are?");
            opt1.setText("6");
            opt2.setText("7");
            opt3.setText("8");
            opt4.setText("9");
        }
        if (counter == 1) { //Question 2
            question.setText("2. What is the size of float and double in java?");
            opt1.setText("32 and 32");
            opt2.setText("32 and 64");
            opt3.setText("64 and 32");
            opt4.setText("64 and 64");
        }
        if (counter == 2) { //Question 3
            question.setText("3. Automatic type conversion is possible in which of the possible cases?");
            opt1.setText("Byte to Int");
            opt2.setText("Int to Long");
            opt3.setText("Long to Int");
            opt4.setText("Short to Long");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Select the valid statement.");
            opt1.setText("char[] ch = new char(5)");
            opt2.setText("char[] ch = new char[5]");
            opt3.setText("char[] ch = new char()");
            opt4.setText("char[] ch = new char[]");
        }
        if (counter == 4) {//Question 5
            question.setText("5. When an array is passed to a method, what does the method receive?");
            opt1.setText("Reference of the array");
            opt2.setText("Copy of the array");
            opt3.setText("Length of the array");
            opt4.setText("Copy of the first element");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Arrays in java are ?");
            opt1.setText("Object References");
            opt2.setText("Objects");
            opt3.setText("Primirive Data Type");
            opt4.setText("None");
        }
        if (counter == 6) { //Question 7
            question.setText("7. When is the object created with new keyword?");
            opt1.setText("At run time");
            opt2.setText("At compile time");
            opt3.setText("Depends on the code");
            opt4.setText("None");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Total constructor string class have?");
            opt1.setText("3");
            opt2.setText("7");
            opt3.setText("13");
            opt4.setText("20");
        }
        if (counter == 8) { //Question 9
            question.setText("9. To which of the following does the class string belong to.");
            opt1.setText("java.lang");
            opt2.setText("java.awt");
            opt3.setText("java.applet");
            opt4.setText("java.string");
        }
        if (counter == 9) { //Question 10
            question.setText("10. compareTo() returns");
            opt1.setText("True");
            opt2.setText("False");
            opt3.setText("Int value");
            opt4.setText("None");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JavaResult.fxml"));
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
            if (answer.equals("8")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("32 and 64")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("Int to long")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("char[] ch = new char[5]")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("the reference of the array")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("Objects")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("At run-time")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("13")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("java.lang")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("An int value")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JavaResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JavaResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("JavaResult.fxml"));
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
