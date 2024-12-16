package org.example.app_for_studing_java;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class TestForTopicController {

    private Stage stage;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ask_1;
    @FXML
    private Button ask_2;
    @FXML
    private Button ask_3;
    @FXML
    private Button ask_4;
    @FXML
    private Button ask_5;
    @FXML
    private Button ask_6;
    @FXML
    private Button ask_7;
    @FXML
    private Button ask_8;
    @FXML
    private Button ask_9;
    @FXML
    private Button ask_10;

    @FXML
    private RadioButton radioButton_1;
    @FXML
    private RadioButton radioButton_2;
    @FXML
    private RadioButton radioButton_3;
    @FXML
    private RadioButton radioButton_4;

    public ToggleGroup radioToggleGroup;

    @FXML
    private CheckBox checkBox_1;
    @FXML
    private CheckBox checkBox_2;
    @FXML
    private CheckBox checkBox_3;
    @FXML
    private CheckBox checkBox_4;
    @FXML
    private CheckBox checkBox_5;

    @FXML
    private ChoiceBox<String> choiceBox;

    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private TextArea textArea;

    @FXML
    private Button Btn_get_answer;

    @FXML
    private Button end_test;

    private int numberOfTest;

    private int askNum;

    private int currentTest;

    private int[][] arrOfCorrectAnswer = new int[10][5];

    private int[][] arrOfUserAnswer = new int[10][5];

    private String[][] arrToConclusion = new String[10][4];


    List<Object> tests= (List<Object>) TestGenerator.generateRandomTest();

    RezultsOfTestController rezultsOfTestController;

    public void initNumberOfTest(int testNumber){
        numberOfTest=testNumber;
    }


    @FXML
    void getTest(ActionEvent event) {
        Button buttonClicked = (Button) event.getSource();

        setTestVisible(false ,"");
        switch (buttonClicked.getId()) {
            case "ask_1":
                currentTest=1;
                setTestVisible(true, initTest(1));

                break;
            case "ask_2":
                currentTest=2;
                setTestVisible(true, initTest(2));
                break;
            case "ask_3":
                currentTest=3;
                setTestVisible(true, initTest(3));
                break;
            case "ask_4":
                currentTest=4;
                setTestVisible(true, initTest(4));
                break;
            case "ask_5":
                currentTest=5;
                setTestVisible(true, initTest(5));
                break;
            case "ask_6":
                currentTest=6;
                setTestVisible(true, initTest(6));
                break;
            case "ask_7":
                currentTest=7;
                setTestVisible(true, initTest(7));
                break;
            case "ask_8":
                currentTest=8;
                setTestVisible(true, initTest(8));
                break;
            case "ask_9":
                currentTest=9;
                setTestVisible(true,initTest(9) );
                break;
            case "ask_10":
                currentTest=10;
                setTestVisible(true, initTest(10));

                System.out.println("Contents of arrOfAnswer:");
                for (int i = 0; i < arrOfCorrectAnswer.length; i++) { // Проходимо по рядках
                    System.out.print("Row " + i + ": ");
                    for (int j = 0; j < arrOfCorrectAnswer[i].length; j++) { // Проходимо по стовпцях
                        System.out.print(arrOfCorrectAnswer[i][j] + " ");
                    }
                    System.out.println(); // Перехід на новий рядок після кожного рядка масиву

                }

                break;

        }
    }
    @FXML
    void getAnswer(ActionEvent event) {
        switch (currentTest){
            case 1:
                saveAnswer(1);
                break;
            case 2:
                saveAnswer(2);
                break;
            case 3:
                saveAnswer(3);
                break;
            case 4:
                saveAnswer(4);
                break;
            case 5:
                saveAnswer(5);
                break;
            case 6:
                saveAnswer(6);
                break;
            case 7:
                saveAnswer(7);
                break;
            case 8:
                saveAnswer(8);
                break;
            case 9:
                saveAnswer(9);
                break;
            case 10:
                saveAnswer(10);
                System.out.println("Contents of arrOfUserAnswer:");
                for (int i = 0; i < arrOfUserAnswer.length; i++) { // Проходимо по рядках
                    System.out.print("Row " + i + ": ");
                    for (int j = 0; j < arrOfUserAnswer[i].length; j++) { // Проходимо по стовпцях
                        System.out.print(arrOfUserAnswer[i][j] + " ");
                    }
                    System.out.println(); // Перехід на новий рядок після кожного рядка масиву

                }

                System.out.println("Contents of arrToConclution:");
                for (int i = 0; i < arrToConclusion.length; i++) { // Проходимо по рядках
                    System.out.print("Row " + i + ": ");
                    for (int j = 0; j < arrToConclusion[i].length; j++) { // Проходимо по стовпцях
                        System.out.print(arrToConclusion[i][j] + " ");
                    }
                    System.out.println(); // Перехід на новий рядок після кожного рядка масиву

                }
                break;
                
        }
    }
    @FXML
    void endTest(ActionEvent event) {

        if(showAlert()) {


            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("rezults_of_test.fxml"));
            try {
                Stage stage = new Stage();
                Scene scene = new Scene(fxmlLoader.load(), 960, 520);

                stage.setScene(scene);
                stage.setTitle("Reszults");
                stage.setResizable(true);
                stage.show();

                rezultsOfTestController = fxmlLoader.getController();
                rezultsOfTestController.setArrToConclusion(arrToConclusion);
                rezultsOfTestController.loadTestResults();
                rezultsOfTestController.setFinal_score("на " + countFullyCorrectQuestions(arrOfCorrectAnswer, arrOfUserAnswer) + " з 10 питаннь ви відповіли правильно");
//            rezultsOfTestController.setAmountOfCorrectAnswer(countCorrectAnswers(arrOfCorrectAnswer,arrOfUserAnswer));

            } catch (IOException e) {
                e.printStackTrace();
            }
            stage.close();

        }
    }
    
    public void saveAnswer(int testNum){
        testNum =testNum -1;
        if(radioButton_1.isVisible()&&radioButton_2.isVisible()&&radioButton_3.isVisible()&&radioButton_4.isVisible()){
            if (radioButton_1.isSelected()){
                arrOfUserAnswer[testNum][0]=1;
                arrToConclusion[testNum][2]=radioButton_1.getText();
            } else if (radioButton_2.isSelected()){
                arrOfUserAnswer[testNum][0]=2;
                arrToConclusion[testNum][2]=radioButton_2.getText();
            } else if (radioButton_3.isSelected()){
                arrOfUserAnswer[testNum][0]=3;
                arrToConclusion[testNum][2]=radioButton_3.getText();
            } else if (radioButton_4.isSelected()){
                arrOfUserAnswer[testNum][0]=4;
                arrToConclusion[testNum][2]=radioButton_4.getText();

            }
        } else if (checkBox_1.isVisible()&&checkBox_2.isVisible()&&checkBox_3.isVisible()&&checkBox_4.isVisible()&&checkBox_5.isVisible()) {

            int a=0;
            arrToConclusion[testNum][2]="";
            if (checkBox_1.isSelected()){
                arrToConclusion[testNum][2] += checkBox_1.getText();
                arrOfUserAnswer[testNum][a++]=1;
            }
            if (checkBox_2.isSelected()){
                arrToConclusion[testNum][2] += checkBox_2.getText();
                arrOfUserAnswer[testNum][a++]=2;
            }
            if (checkBox_3.isSelected()){
                arrToConclusion[testNum][2] += checkBox_3.getText();
                arrOfUserAnswer[testNum][a++]=3;
            }
            if (checkBox_4.isSelected()){
                arrToConclusion[testNum][2] += checkBox_4.getText();
                arrOfUserAnswer[testNum][a++]=4;
            }
            if (checkBox_5.isSelected()){
                arrToConclusion[testNum][2] += checkBox_5.getText();
                arrOfUserAnswer[testNum][a++]=5;
            }

        } else if (comboBox.isVisible()){
            switch (comboBox.getValue().charAt(0)){
                case 'A':
                    arrToConclusion[testNum][2]=comboBox.getValue();
                    arrOfUserAnswer[testNum][0]=1;
                    break;
                case 'B':
                    arrToConclusion[testNum][2]=comboBox.getValue();
                    arrOfUserAnswer[testNum][0]=2;
                    break;
                case 'C':
                    arrToConclusion[testNum][2]=comboBox.getValue();
                    arrOfUserAnswer[testNum][0]=3;
                    break;
                default:
                    break; // Нічого не вибрано або невідоме значення

            }
        } else if (choiceBox.isVisible()) {
            switch (choiceBox.getValue()){
                case "Правильно":
                    arrToConclusion[testNum][2]=choiceBox.getValue();
                    arrOfUserAnswer[testNum][0]=1;
                    break;
                case "Неправильно":
                    arrToConclusion[testNum][2]=choiceBox.getValue();
                    arrOfUserAnswer[testNum][0]=2;
                    break;
                default:
                    break; // Нічого не вибрано або невідоме значення
            }
        }

    }

    public String initTest(int numOfTest){

        numOfTest = numOfTest - 1;

        int[] arr;
        System.out.println(tests.get(numOfTest).getClass().getSimpleName());
        switch (tests.get(numOfTest).getClass().getSimpleName()) {
            case "RadioButtonTest":
                // Логіка для radioButtonTest
                TestByTopic.RadioButtonTest radioButtonTest = (TestByTopic.RadioButtonTest) tests.get(numOfTest);

                arr = TestGenerator.setTestForRadioButton(textArea,radioButton_1,radioButton_2,radioButton_3,radioButton_4,
                        radioButtonTest.getQuestion(),radioButtonTest.getVar1(),radioButtonTest.getVar2(),radioButtonTest.getVar3(), radioButtonTest.getVar4(),radioButtonTest.getAnswer());
                arrOfCorrectAnswer[numOfTest][0]=arr[0];
                arrToConclusion[numOfTest][0]=String.valueOf(numOfTest+1);
                arrToConclusion[numOfTest][1]=radioButtonTest.getQuestion();
                if (arr[0]==1){
                    arrToConclusion[numOfTest][3]=radioButton_1.getText();
                } else if (arr[0]==2){
                    arrToConclusion[numOfTest][3]=radioButton_2.getText();
                } else if (arr[0]==3) {
                    arrToConclusion[numOfTest][3]=radioButton_3.getText();
                } else if (arr[0]==4) {
                    arrToConclusion[numOfTest][3]=radioButton_4.getText();
                }

                System.out.println("This is a RadioButtonTest");
                numOfTest =0;
                return "RadioButtonTest";

            case "CheckBoxTest":
                // Логіка для CheckBoxTest
                TestByTopic.CheckBoxTest checkBoxTest = (TestByTopic.CheckBoxTest) tests.get(numOfTest);

                arr = TestGenerator.setTestForCheckBox(textArea,checkBox_1,checkBox_2,checkBox_3,checkBox_4,checkBox_5,
                        checkBoxTest.getQuestion(), checkBoxTest.getVar1(), checkBoxTest.getVar2(), checkBoxTest.getVar3(), checkBoxTest.getVar4(), checkBoxTest.getVar5(), checkBoxTest.getCorrectAnswer());
                arrToConclusion[numOfTest][0]=String.valueOf(numOfTest+1);
                arrToConclusion[numOfTest][1]= checkBoxTest.getQuestion();
                String answer = "";

                for (int i =0;i<arr.length;i++){
                    for (int l=0 ; l<5;l++){
                        if (arr[i]==l){
                            switch (l){
                                case 1:
                                    answer += checkBox_1.getText();
                                    break;
                                case 2:
                                    answer += checkBox_2.getText();
                                    break;
                                case 3:
                                    answer += checkBox_3.getText();
                                    break;
                                case 4:
                                    answer += checkBox_4.getText();
                                    break;
                                case 5:
                                    answer += checkBox_5.getText();
                                    break;

                                default:
                                    throw new IllegalStateException("Unexpected value: " + l);
                            }
                        }
                    }
                }

                arrToConclusion[numOfTest][3]=answer;
                int a=0;

                for ( int el:arr){
                    arrOfCorrectAnswer[numOfTest][a++]=el;
                }
                a=0;
                System.out.println("This is a CheckBoxTest");
                numOfTest =0;
                return "CheckBoxTest";

            case "ComboBoxTest":
                // Логіка для ComboBoxTest
                TestByTopic.ComboBoxTest comboBoxTest= (TestByTopic.ComboBoxTest) tests.get(numOfTest);

                if (arrOfCorrectAnswer[numOfTest][0]==0){
                    arr = TestGenerator.setTestForComboBox(textArea, comboBox, comboBoxTest.getQuestion(), comboBoxTest.getVar1(),
                            comboBoxTest.getVar2(), comboBoxTest.getVar3(), comboBoxTest.getCorrectAnswer());
                    arrToConclusion[numOfTest][0]=String.valueOf(numOfTest+1);
                    arrToConclusion[numOfTest][1]= comboBoxTest.getQuestion();

                    switch (arr[0]){
                        case 1:
                            arrToConclusion[numOfTest][3]= comboBoxTest.getVar1();
                            break;
                        case 2:
                            arrToConclusion[numOfTest][3]= comboBoxTest.getVar2();
                            break;
                        case 3:
                            arrToConclusion[numOfTest][3]= comboBoxTest.getVar3();
                            break;
                    }
                    arrOfCorrectAnswer[numOfTest][0] = arr[0];
                    System.out.println("This is a ComboBoxTest");
                    return "ComboBoxTest";
                } else {
                    TestGenerator.setTestForComboBox(textArea, comboBoxTest.getQuestion());
                    System.out.println("This is a ComboBoxTest");
                    return "ComboBoxTest";

                }

            case "ChoiceBoxTest":
                // Логіка для ChoiceBoxTest
                TestByTopic.ChoiceBoxTest choiceBoxTest = (TestByTopic.ChoiceBoxTest) tests.get(numOfTest);

                if (arrOfCorrectAnswer[numOfTest][0]==0){

                    arr = TestGenerator.setTestForChoiceBox(textArea,choiceBox, choiceBoxTest.getQuestion(),
                            choiceBoxTest.getVarTrue(), choiceBoxTest.getVarFalse(), choiceBoxTest.getCorrectAnswer());
                    arrToConclusion[numOfTest][0]=String.valueOf(numOfTest+1);
                    arrToConclusion[numOfTest][1]= choiceBoxTest.getQuestion();

                    if (arr[0]==1){
                        arrToConclusion[numOfTest][3]=choiceBoxTest.getVarTrue();
                    } else if (arr[0]==2){
                        arrToConclusion[numOfTest][3]="choiceBoxTest.getVarFalse()";

                    }
                    arrOfCorrectAnswer[numOfTest][0]=arr[0];

                    System.out.println("This is a ChoiceBoxTest");

                    return "ChoiceBoxTest";
                } else {
                    TestGenerator.setTestForChoiceBox(textArea,choiceBoxTest.getQuestion());
                    System.out.println("This is a CheckBoxTest");
                    return "ChoiceBoxTest";
                }

        }
        System.out.println("Test is not initiated");
        return "error";
    }






    public void setTestVisible(boolean action, String test) {
        if (action) {
            switch (test) {
                case "RadioButtonTest":
                    radioButton_1.setVisible(true);
                    radioButton_2.setVisible(true);
                    radioButton_3.setVisible(true);
                    radioButton_4.setVisible(true);
                    break;
                case "CheckBoxTest":
                    checkBox_1.setVisible(true);
                    checkBox_2.setVisible(true);
                    checkBox_3.setVisible(true);
                    checkBox_4.setVisible(true);
                    checkBox_5.setVisible(true);
                    break;
                case "ComboBoxTest":
                    comboBox.setVisible(true);
                    break;
                case "ChoiceBoxTest":
                    choiceBox.setVisible(true);
                    break;
                case "":
                    radioButton_1.setVisible(true);
                    radioButton_2.setVisible(true);
                    radioButton_3.setVisible(true);
                    radioButton_4.setVisible(true);

                    checkBox_1.setVisible(true);
                    checkBox_2.setVisible(true);
                    checkBox_3.setVisible(true);
                    checkBox_4.setVisible(true);
                    checkBox_5.setVisible(true);

                    comboBox.setVisible(true);

                    choiceBox.setVisible(true);
                    break;
            }
        } else if (!action) {
            switch (test) {
                case "RadioButtonTest":
                    radioButton_1.setVisible(false);
                    radioButton_2.setVisible(false);
                    radioButton_3.setVisible(false);
                    radioButton_4.setVisible(false);

                    radioButton_1.setSelected(false);
                    radioButton_2.setSelected(false);
                    radioButton_3.setSelected(false);
                    radioButton_4.setSelected(false);
                    break;
                case "CheckBoxTest":
                    checkBox_1.setVisible(false);
                    checkBox_2.setVisible(false);
                    checkBox_3.setVisible(false);
                    checkBox_4.setVisible(false);
                    checkBox_5.setVisible(false);

                    checkBox_1.setSelected(false);
                    checkBox_2.setSelected(false);
                    checkBox_3.setSelected(false);
                    checkBox_4.setSelected(false);
                    checkBox_5.setSelected(false);
                    break;
                case "ComboBoxTest":
                    comboBox.setVisible(false);


                    break;
                case "ChoiceBoxTest":
                    choiceBox.setVisible(false);


                    break;
                case "":
                    radioButton_1.setVisible(false);
                    radioButton_2.setVisible(false);
                    radioButton_3.setVisible(false);
                    radioButton_4.setVisible(false);

                    radioButton_1.setSelected(false);
                    radioButton_2.setSelected(false);
                    radioButton_3.setSelected(false);
                    radioButton_4.setSelected(false);

                    checkBox_1.setVisible(false);
                    checkBox_2.setVisible(false);
                    checkBox_3.setVisible(false);
                    checkBox_4.setVisible(false);
                    checkBox_5.setVisible(false);

                    checkBox_1.setSelected(false);
                    checkBox_2.setSelected(false);
                    checkBox_3.setSelected(false);
                    checkBox_4.setSelected(false);
                    checkBox_5.setSelected(false);

                    comboBox.setVisible(false);

                    choiceBox.setVisible(false);
                    break;
            }
        }
    }

    public int countFullyCorrectQuestions(int[][] arrOfCorrectAnswer, int[][] arrOfUserAnswer) {
        int correctQuestions = 0;

        // Перевіряємо, щоб розміри масивів збігалися
        if (arrOfCorrectAnswer.length != arrOfUserAnswer.length) {
            throw new IllegalArgumentException("Розміри масивів не збігаються!");
        }
        if (arrOfUserAnswer[0][0]==0&&arrOfUserAnswer[1][0]==0&&arrOfUserAnswer[2][0]==0&&arrOfUserAnswer[3][0]==0&&arrOfUserAnswer[4][0]==0
        &&arrOfUserAnswer[5][0]==0&&arrOfUserAnswer[6][0]==0&&arrOfUserAnswer[7][0]==0&&arrOfUserAnswer[8][0]==0&&arrOfUserAnswer[9][0]==0){
            return 0;
        }

        for (int i = 0; i < arrOfCorrectAnswer.length; i++) {
            if (arrOfCorrectAnswer[i].length != arrOfUserAnswer[i].length) {
                throw new IllegalArgumentException("Розміри рядків масивів не збігаються!");
            }

            // Перевіряємо всі відповіді для поточного запитання
            boolean isFullyCorrect = true; // Припускаємо, що всі відповіді правильні
            for (int j = 0; j < arrOfCorrectAnswer[i].length; j++) {
                if (arrOfCorrectAnswer[i][j] != arrOfUserAnswer[i][j]) {
                    isFullyCorrect = false; // Знайдено невідповідність
                    break;
                }
            }

            if (isFullyCorrect) {
                correctQuestions++; // Якщо всі відповіді правильні, додаємо до лічильника
            }
        }

        return correctQuestions;
    }


    private boolean showAlert() {
        // Створюємо алерт
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Ви впевнені що хочете завершити тестування", ButtonType.YES, ButtonType.CANCEL);
        alert.setTitle("End test?");
        alert.setHeaderText("Завершення тестування");

        // Показуємо алерт і чекаємо на відповідь користувача
        alert.showAndWait();

        // Перевірка результату (OK чи CANCEL)
        if (alert.getResult() == ButtonType.YES) {
            return true;  // Повертаємо true, якщо натиснуто OK
        } else {
            return false;  // Повертаємо false, якщо натиснуто CANCEL або закрито вікно
        }
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    void initialize() {
        assert ask_2 != null : "fx:id=\"ask_2\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_3 != null : "fx:id=\"ask_3\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_4 != null : "fx:id=\"ask_4\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_5 != null : "fx:id=\"ask_5\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert radioButton_1 != null : "fx:id=\"radioButton_1\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_1 != null : "fx:id=\"ask_1\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_10 != null : "fx:id=\"ask_10\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert checkBox_1 != null : "fx:id=\"checkBox_1\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert checkBox_2 != null : "fx:id=\"checkBox_2\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert checkBox_3 != null : "fx:id=\"checkBox_3\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert radioButton_3 != null : "fx:id=\"radioButton_3\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert checkBox_4 != null : "fx:id=\"checkBox_4\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert radioButton_2 != null : "fx:id=\"radioButton_2\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert checkBox_5 != null : "fx:id=\"checkBox_5\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert choiceBox != null : "fx:id=\"choiceBox\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert radioButton_4 != null : "fx:id=\"radioButton_4\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_6 != null : "fx:id=\"ask_6\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_7 != null : "fx:id=\"ask_7\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_8 != null : "fx:id=\"ask_8\" was not injected: check your FXML file 'testForTopic.fxml'.";
        assert ask_9 != null : "fx:id=\"ask_9\" was not injected: check your FXML file 'testForTopic.fxml'.";


        radioToggleGroup=new ToggleGroup();
        radioButton_1.setToggleGroup(radioToggleGroup);
        radioButton_2.setToggleGroup(radioToggleGroup);
        radioButton_3.setToggleGroup(radioToggleGroup);
        radioButton_4.setToggleGroup(radioToggleGroup);

    }
}