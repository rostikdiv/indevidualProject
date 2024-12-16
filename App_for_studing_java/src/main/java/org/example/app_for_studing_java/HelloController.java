package org.example.app_for_studing_java;


import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private MenuItem topic_1;
    @FXML
    private MenuItem topic_2;
    @FXML
    private MenuItem topic_3;
    @FXML
    private MenuItem topic_4;
    @FXML
    private MenuItem topic_5;
    @FXML
    private MenuItem topic_6;
    @FXML
    private MenuItem topic_7;
    @FXML
    private MenuItem topic_8;
    @FXML
    private MenuItem topic_9;
    @FXML
    private MenuItem topic_10;
    @FXML
    private MenuItem topic_11;


    @FXML
    private MenuItem test_1;
    @FXML
    private MenuItem test_2;
    @FXML
    private MenuItem test_3;
    @FXML
    private MenuItem test_4;
    @FXML
    private MenuItem test_5;
    @FXML
    private MenuItem test_6;
    @FXML
    private MenuItem test_7;
    @FXML
    private MenuItem test_8;
    @FXML
    private MenuItem test_9;
    @FXML
    private MenuItem test_10;
    @FXML
    private MenuItem test_11;

    @FXML
    private TextArea text_area;




    TestForTopicController testForTopicController;





    void openWindowWithTests() throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("testForTopic.fxml"));
        try {
            Stage stage = new Stage();
            System.out.println("1------------------------------------------------");
            Scene scene = new Scene(fxmlLoader.load(), 960, 520);
            System.out.println("2------------------------------------------------");

            stage.setScene(scene);
            stage.setTitle("Test");
            stage.setResizable(true);
            stage.show();

            testForTopicController = fxmlLoader.getController();
            testForTopicController.setStage(stage);
//            if (testForTopicController != null) {
//                System.out.println("Controller successfully loaded.");
//            } else {
//                System.out.println("Controller is null!");
//            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void open_lecture(ActionEvent event) {
        MenuItem clickedMenuItem = (MenuItem) event.getSource();
        switch (clickedMenuItem.getId()){
            case "topic_1":
                SetLectures.setTextOfTopic_1(text_area);
                break;
            case "topic_2":
                SetLectures.setTextOfTopic_2(text_area);
                break;
            case "topic_3":
                SetLectures.setTextOfTopic_3(text_area);
                break;
            case "topic_4":
                SetLectures.setTextOfTopic_4(text_area);
                break;
            case "topic_5":
                SetLectures.setTextOfTopic_5(text_area);
                break;
            case "topic_6":
                SetLectures.setTextOfTopic_6(text_area);
                break;
            case "topic_7":
                SetLectures.setTextOfTopic_7(text_area);
                break;
            case "topic_8":
                SetLectures.setTextOfTopic_8(text_area);
                break;
            case "topic_9":
                SetLectures.setTextOfTopic_9(text_area);
                break;
            case "topic_10":
                SetLectures.setTextOfTopic_10(text_area);
                break;
            case "topic_11":
                SetLectures.setTextOfTopic_11(text_area);
                break;
        }

    }

    @FXML
    void open_test(ActionEvent event) throws IOException {
        MenuItem clickedMenuItem = (MenuItem) event.getSource();
        switch (clickedMenuItem.getId()){
            case "test_1":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest1();
                openWindowWithTests();
                break;
            case "test_2":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest2();
                openWindowWithTests();
                break;
            case "test_3":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest3();
                openWindowWithTests();
                break;
            case "test_4":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest4();
                openWindowWithTests();
                break;
            case "test_5":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest5();
                openWindowWithTests();
                break;
            case "test_6":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest6();
                openWindowWithTests();
                break;
            case "test_7":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest7();
                openWindowWithTests();
                break;
            case "test_8":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest8();
                openWindowWithTests();
                break;
            case "test_9":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest9();
                openWindowWithTests();
                break;
            case "test_10":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest10();
                openWindowWithTests();
                break;
            case "test_11":
                ListOfTests.Test.clear();
                InitializatorOfListOfTests.intiateTest11();
                openWindowWithTests();
                break;
        }
    }


    @FXML
    void initialize() {
        assert topic_11 != null : "fx:id=\"topic_11\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_8 != null : "fx:id=\"topic_8\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_4 != null : "fx:id=\"test_4\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_9 != null : "fx:id=\"topic_9\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_3 != null : "fx:id=\"test_3\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_2 != null : "fx:id=\"test_2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_1 != null : "fx:id=\"test_1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_1 != null : "fx:id=\"topic_1\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_2 != null : "fx:id=\"topic_2\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_11 != null : "fx:id=\"test_11\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_3 != null : "fx:id=\"topic_3\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_9 != null : "fx:id=\"test_9\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_10 != null : "fx:id=\"test_10\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_4 != null : "fx:id=\"topic_4\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_8 != null : "fx:id=\"test_8\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_5 != null : "fx:id=\"topic_5\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_7 != null : "fx:id=\"test_7\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_6 != null : "fx:id=\"topic_6\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_6 != null : "fx:id=\"test_6\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_7 != null : "fx:id=\"topic_7\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert topic_10 != null : "fx:id=\"topic_10\" was not injected: check your FXML file 'hello-view.fxml'.";
        assert test_5 != null : "fx:id=\"test_5\" was not injected: check your FXML file 'hello-view.fxml'.";

    }

}
