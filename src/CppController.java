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

public class CppController {

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
            question.setText("1. Which of the following is the correct identifier?");
            opt1.setText("$var_name");
            opt2.setText("VAR_123");
            opt3.setText("varname@");
            opt4.setText("None of the above");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Which of the following is the address operator?");
            opt1.setText("@");
            opt2.setText("#");
            opt3.setText("&");
            opt4.setText("%");
        }
        if (counter == 2) { //Question 3
            question.setText(
                    "3. Which of the following features must be supported by any programming language to become a pure object-oriented programming language?");
            opt1.setText("Encapsulation");
            opt2.setText("Inheritance");
            opt3.setText("Polymorphism");
            opt4.setText("All of the above");
        }
        if (counter == 3) { //Question 4
            question.setText("4. The programming language that has the ability to create new data types is called___.");
            opt1.setText("Overloaded");
            opt2.setText("Encapsulated");
            opt3.setText("Reprehensible");
            opt4.setText("Extensible");
        }
        if (counter == 4) {//Question 5
            question.setText(
                    "5. If we stored five elements or data items in an array, what will be the index address or the index number of the array's last data item?");
            opt1.setText("3");
            opt2.setText("4");
            opt3.setText("5");
            opt4.setText("88");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Which of the following is the correct syntax for declaring the array?");
            opt1.setText("init array []");
            opt2.setText("int array [5];");
            opt3.setText("Array[5];");
            opt4.setText("None");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Which type of memory is used by an Array in C++ programming language?");
            opt1.setText("Contiguous");
            opt2.setText("Non-Contiguous");
            opt3.setText("Both A and B");
            opt4.setText("None");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Which of the following can be considered as the object of an array?");
            opt1.setText("Index of an array");
            opt2.setText("Elements of the Array");
            opt3.setText("Functions of the Array");
            opt4.setText("All of the above");
        }
        if (counter == 8) { //Question 9
            question.setText(
                    "9. Elements of a one-dimensional array are numbered as 0,1,2,3,4,5, and so on; these numbers are known as ____");
            opt1.setText("Members of Array");
            opt2.setText("Subscript of Array");
            opt3.setText("Index values");
            opt4.setText("Both B and C");
        }
        if (counter == 9) { //Question 10
            question.setText(
                    "10. Which of the following can be considered as the members that can be inherited but not accessible in any class?");
            opt1.setText("Public");
            opt2.setText("Protected");
            opt3.setText("Private");
            opt4.setText("Both A and C");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("CppResult.fxml"));
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
            if (answer.equals("VAR_123")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("&")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("All of the above")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Extensible")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("4")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("int array [5];")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Contiguous")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("Elements of the Array")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("Both B and C")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("Private")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("CppResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("CppResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("CppResult.fxml"));
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
