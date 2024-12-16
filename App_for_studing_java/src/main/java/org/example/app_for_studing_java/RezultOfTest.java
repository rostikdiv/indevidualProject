package org.example.app_for_studing_java;

import javafx.beans.property.SimpleStringProperty;

public class RezultOfTest {
    private SimpleStringProperty testNum = new SimpleStringProperty("");
    private SimpleStringProperty question = new SimpleStringProperty("");
    private SimpleStringProperty userAnswer = new SimpleStringProperty("");
    private SimpleStringProperty correctAnswer = new SimpleStringProperty("");

    public RezultOfTest(SimpleStringProperty testNum,SimpleStringProperty question, SimpleStringProperty userAnswer, SimpleStringProperty correctAnswer) {
        this.testNum = testNum;
        this.question = question;
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
    }

    public String getTestNum() {
        return testNum.get();
    }

    public SimpleStringProperty testNumProperty() {
        return testNum;
    }

    public void setTestNum(String testNum) {
        this.testNum.set(testNum);
    }

    public String getQuestion() {
        return question.get();
    }

    public SimpleStringProperty questionProperty() {
        return question;
    }

    public void setQuestion(String question) {
        this.question.set(question);
    }

    public String getUserAnswer() {
        return userAnswer.get();
    }

    public SimpleStringProperty userAnswerProperty() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer.set(userAnswer);
    }

    public String getCorrectAnswer() {
        return correctAnswer.get();
    }

    public SimpleStringProperty correctAnswerProperty() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer.set(correctAnswer);
    }

    @Override
    public String toString() {
        return "RezultOfTest{" +
                "question=" + question +
                ", userAnswer=" + userAnswer +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
