package org.example.app_for_studing_java;

import java.util.ArrayList;

public class ListOfTests {

    static class Test {
        private static ArrayList<TestByTopic.RadioButtonTest> listOfRadioButtonTest = new ArrayList<>();
        private static ArrayList<TestByTopic.CheckBoxTest> listOfCheckBoxTest  = new ArrayList<>();
        private static ArrayList<TestByTopic.ComboBoxTest> listOfComboBoxTest =new ArrayList<>();
        private static ArrayList<TestByTopic.ChoiceBoxTest> listOfChoiceBoxTest = new ArrayList<>();

        public static ArrayList<TestByTopic.RadioButtonTest> getListOfRadioButtonTest() {
            return listOfRadioButtonTest;
        }

        public static ArrayList<TestByTopic.ChoiceBoxTest> getListOfChoiceBoxTest() {
            return listOfChoiceBoxTest;
        }

        public static ArrayList<TestByTopic.ComboBoxTest> getListOfComboBoxTest() {
            return listOfComboBoxTest;
        }

        public static ArrayList<TestByTopic.CheckBoxTest> getListOfCheckBoxTest() {
            return listOfCheckBoxTest;
        }

        public static void setListOfRadioButtonTest(ArrayList<TestByTopic.RadioButtonTest> listOfRadioButtonTest) {
            Test.listOfRadioButtonTest = listOfRadioButtonTest;
        }

        public static void setListOfCheckBoxTest(ArrayList<TestByTopic.CheckBoxTest> listOfCheckBoxTest) {
            Test.listOfCheckBoxTest = listOfCheckBoxTest;
        }

        public static void setListOfComboBoxTest(ArrayList<TestByTopic.ComboBoxTest> listOfComboBoxTest) {
            Test.listOfComboBoxTest = listOfComboBoxTest;
        }

        public static void setListOfChoiceBoxTest(ArrayList<TestByTopic.ChoiceBoxTest> listOfChoiceBoxTest) {
            Test.listOfChoiceBoxTest = listOfChoiceBoxTest;
        }
        public static void clear(){
            listOfRadioButtonTest.clear();
            listOfComboBoxTest.clear();
            listOfCheckBoxTest.clear();
            listOfChoiceBoxTest.clear();

            System.out.println("tests was cleared");
        }
    }



}
