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

public class cController {

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
            question.setText("1. In the C language, the constant is defined _______.");
            opt1.setText("Before main");
            opt2.setText("After main");
            opt3.setText("Anywhere, but starting on a new line.");
            opt4.setText("None of the these.");
        }
        if (counter == 1) { //Question 2
            question.setText("2. Which one of the following is a loop construct that will always be executed once?");
            opt1.setText("for");
            opt2.setText("while");
            opt3.setText("switch");
            opt4.setText("do while");
        }
        if (counter == 2) { //Question 3
            question.setText("3. How many bytes does int = D use?");
            opt1.setText("0");
            opt2.setText("1");
            opt3.setText("2 or 4");
            opt4.setText("10");
        }
        if (counter == 3) { //Question 4
            question.setText("4. Each instance of a class has a different set of");
            opt1.setText("Class interfaces");
            opt2.setText("Methods");
            opt3.setText("Return types");
            opt4.setText("Attribute values");
        }
        if (counter == 4) {//Question 5
            question.setText("5. How many instances of a class can be declared?");
            opt1.setText("1");
            opt2.setText("10");
            opt3.setText("As per required");
            opt4.setText("None of the these");
        }
        if (counter == 5) { //Question 6
            question.setText("6. Which of the following statement is not true?");
            opt1.setText("A pointer to an int and a pointer to a double are of the same size.");
            opt2.setText("A pointer must point to a data item on the heap (free store).");
            opt3.setText("A pointer can be reassigned to point to another data item.");
            opt4.setText("A pointer can point to an array.");
        }
        if (counter == 6) { //Question 7
            question.setText("7. Which of the following has a global scope in the program?");
            opt1.setText(" Formal parameters");
            opt2.setText("Constants");
            opt3.setText("Marcos");
            opt4.setText("Local Variables");
        }
        if (counter == 7) { //Question 8
            question.setText("8. Which of the following statements about functions is false?");
            opt1.setText("The main() function can be called recursively");
            opt2.setText(" Functions cannot return more than one value at a time");
            opt3.setText("A function can have multiple return statements with different return values");
            opt4.setText("The maximum number of arguments a function can take is 128");
        }
        if (counter == 8) { //Question 9
            question.setText("9. Which of the following statements about unions is incorrect?");
            opt1.setText("A bit field cannot be used in a union");
            opt2.setText("A pointer to a union exists");
            opt3.setText("Union elements can be of different sizes");
            opt4.setText("A union can be nested into a structure");
        }
        if (counter == 9) { //Question 10
            question.setText("10. Which of the following is not a valid C variable name?");
            opt1.setText("int number;");
            opt2.setText("float rate;");
            opt3.setText("int variable_count;");
            opt4.setText("int $main;");
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("cResult.fxml"));
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
            if (answer.equals("Anywhere, but starting on a new line.")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 1) {
            if (answer.equals("do while")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 2) {
            if (answer.equals("2 or 4")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 3) {
            if (answer.equals("Attribute values")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 4) {
            if (answer.equals("As per required")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 5) {
            if (answer.equals("A pointer must point to a data item on the heap (free store).")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 6) {
            if (answer.equals("Marcos")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 7) {
            if (answer.equals("The maximum number of arguments a function can take is 128")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 8) {
            if (answer.equals("A bit field cannot be used in a union")) {
                return true;
            } else {
                return false;
            }
        }
        if (counter == 9) {
            if (answer.equals("int $main;")) {
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("cResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("cResult.fxml"));
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
                FXMLLoader quiz = new FXMLLoader(getClass().getResource("cResult.fxml"));
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
