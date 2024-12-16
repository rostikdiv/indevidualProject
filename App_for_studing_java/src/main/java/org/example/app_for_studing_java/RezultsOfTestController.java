package org.example.app_for_studing_java;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.controlsfx.control.WorldMapView;

public class RezultsOfTestController {
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private WorldMapView map;
    @FXML
    private Label final_score;
    @FXML
    private TableView<RezultOfTest> rezults_table;
    @FXML
    private TableColumn<RezultOfTest, String> test_num;
    @FXML
    private TableColumn<RezultOfTest, String> question_table;
    @FXML
    private TableColumn<RezultOfTest, String> user_answer_table;
    @FXML
    private TableColumn<RezultOfTest, String> correct_answer_table;

    private ObservableList<RezultOfTest> testResults = FXCollections.observableArrayList();

    private String[][] arrToConclusion = new String[10][4];

    public String[][] getArrToConclusion() {
        return arrToConclusion;
    }
    private int amountOfCorrectAnswer;

    public int getAmountOfCorrectAnswer() {
        return amountOfCorrectAnswer;
    }

    public void setAmountOfCorrectAnswer(int amountOfCorrectAnswer) {
        this.amountOfCorrectAnswer = amountOfCorrectAnswer;
    }

    public void setArrToConclusion(String[][] arrToConclusion) {
        this.arrToConclusion = arrToConclusion;
    }
    public void setFinal_score(String final_score){
        this.final_score.setText(final_score);
    }

    @FXML
    void initialize() {
        assert correct_answer_table != null : "fx:id=\"correct_answer_table\" was not injected: check your FXML file 'rezults_of_test.fxml'.";
        assert question_table != null : "fx:id=\"question_table\" was not injected: check your FXML file 'rezults_of_test.fxml'.";
        assert rezults_table != null : "fx:id=\"rezults_table\" was not injected: check your FXML file 'rezults_of_test.fxml'.";
        assert test_num != null : "fx:id=\"test_num\" was not injected: check your FXML file 'rezults_of_test.fxml'.";
        assert user_answer_table != null : "fx:id=\"user_answer_table\" was not injected: check your FXML file 'rezults_of_test.fxml'.";
        assert final_score != null : "fx:id=\"final_score\" was not injected: check your FXML file 'rezults_of_test.fxml'.";

        test_num.setCellValueFactory(new PropertyValueFactory<>("testNum"));
        question_table.setCellValueFactory(new PropertyValueFactory<>("question"));
        user_answer_table.setCellValueFactory(new PropertyValueFactory<>("userAnswer"));
        correct_answer_table.setCellValueFactory(new PropertyValueFactory<>("correctAnswer"));

        // Заповнення даними
//        loadTestResults();

        // Додавання даних до таблиці
        rezults_table.setItems(testResults);
    }
    public void loadTestResults() {
        // Приклад додавання даних

        for (int i=0;i<arrToConclusion.length;i++){

            testResults.add(new RezultOfTest(new SimpleStringProperty(arrToConclusion[i][0]),new SimpleStringProperty(arrToConclusion[i][1]),new SimpleStringProperty(arrToConclusion[i][2]),new SimpleStringProperty(arrToConclusion[i][3])));
        }
    }
}
