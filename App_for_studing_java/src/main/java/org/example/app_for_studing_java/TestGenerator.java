package org.example.app_for_studing_java;

import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestGenerator {

    private static int numOftest;

    public static int[] setTestForRadioButton(TextArea textArea, RadioButton rb1, RadioButton rb2, RadioButton rb3, RadioButton rb4
            , String question,String var1, String var2, String var3, String var4, int[] correctAnswer){

        textArea.setText(question);
        rb1.setText(var1);
        rb2.setText(var2);
        rb3.setText(var3);
        rb4.setText(var4);
        return correctAnswer;
    }

    public static int[] setTestForCheckBox(TextArea textArea,CheckBox cb1,CheckBox cb2,CheckBox cb3,CheckBox cb4,CheckBox cb5
            , String question,String var1, String var2, String var3, String var4, String var5, int[] correctAnswer){

        textArea.setText(question);
        cb1.setText(var1);
        cb2.setText(var2);
        cb3.setText(var3);
        cb4.setText(var4);
        cb5.setText(var5);

        return correctAnswer;
    }

    public static int[] setTestForComboBox(TextArea textArea,ComboBox<String> comboBox,String question
            ,String cb1,String cb2, String cb3,int[] correctAnswer){
        textArea.setText(question);
        comboBox.getItems().addAll(cb1,cb2,cb3);
        return correctAnswer;
    }

    public static void setTestForComboBox(TextArea textArea,String question){
        textArea.setText(question);

    }

    public static int[] setTestForChoiceBox(TextArea textArea,ChoiceBox<String>choiceBox,String question
            ,String var1,String var2, int[] correctAnswer){
        textArea.setText(question);
        choiceBox.getItems().addAll(var1,var2);
        return correctAnswer;
    }

    public static void setTestForChoiceBox(TextArea textArea,String question){
        textArea.setText(question);
    }

    public static List<Object> generateRandomTest() {
        System.out.println("генератор викликано");
        // Списки для кожного типу тестів
        List<TestByTopic.RadioButtonTest> radioButtonTests = ListOfTests.Test.getListOfRadioButtonTest();
        List<TestByTopic.CheckBoxTest> checkBoxTests = ListOfTests.Test.getListOfCheckBoxTest();
        List<TestByTopic.ComboBoxTest> comboBoxTests = ListOfTests.Test.getListOfComboBoxTest();
        List<TestByTopic.ChoiceBoxTest> choiceBoxTests = ListOfTests.Test.getListOfChoiceBoxTest();

        // Результуючий список для зберігання тестів
        List<Object> selectedTests = new ArrayList<>();

        // Випадковий вибір 6 RadioButtonTest
        Collections.shuffle(radioButtonTests);
        selectedTests.addAll(radioButtonTests.subList(0, 6));

        // Випадковий вибір 2 CheckBoxTest
        Collections.shuffle(checkBoxTests);
        selectedTests.addAll(checkBoxTests.subList(0, 2));

        // Випадковий вибір 1 ComboBoxTest
        Collections.shuffle(comboBoxTests);
        selectedTests.add(comboBoxTests.get(0));

        // Випадковий вибір 1 ChoiceBoxTest
        Collections.shuffle(choiceBoxTests);
        selectedTests.add(choiceBoxTests.get(0));

        // Перемішування результатів для випадкового порядку
        Collections.shuffle(selectedTests);

        return selectedTests;
    }


}
