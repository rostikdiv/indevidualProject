package org.example.app_for_studing_java;

public class TestByTopic {
    public static int RadioButtonTest;

    public static class RadioButtonTest{
        private String question;
        private String var1;
        private String var2;
        private String var3;
        private String var4;
        private int[] answer;

        public RadioButtonTest(String test, String var1, String var2, String var3, String var4, int[] answer) {
            this.question = test;
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
            this.var4 = var4;
            this.answer = answer;
        }

        public String getVar1() {
            return var1;
        }

        public void setVar1(String var1) {
            this.var1 = var1;
        }

        public String getVar2() {
            return var2;
        }

        public void setVar2(String var2) {
            this.var2 = var2;
        }

        public String getVar3() {
            return var3;
        }

        public void setVar3(String var3) {
            this.var3 = var3;
        }

        public String getVar4() {
            return var4;
        }

        public void setVar4(String var4) {
            this.var4 = var4;
        }

        public int[] getAnswer() {
            return answer;
        }

        public void setAnswer(int answer[]) {
            this.answer = answer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }
    }
    public static class CheckBoxTest{
        private String question;
        private String var1;
        private String var2;
        private String var3;
        private String var4;
        private String var5;
        private int[] correctAnswer;

        public CheckBoxTest(String question, String var1, String var2, String var3, String var4, String var5, int[] correctAnswer) {
            this.question = question;
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
            this.var4 = var4;
            this.var5 = var5;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getVar1() {
            return var1;
        }

        public void setVar1(String var1) {
            this.var1 = var1;
        }

        public String getVar2() {
            return var2;
        }

        public void setVar2(String var2) {
            this.var2 = var2;
        }

        public String getVar3() {
            return var3;
        }

        public void setVar3(String var3) {
            this.var3 = var3;
        }

        public String getVar4() {
            return var4;
        }

        public void setVar4(String var4) {
            this.var4 = var4;
        }

        public String getVar5() {
            return var5;
        }

        public void setVar5(String var5) {
            this.var5 = var5;
        }

        public int[] getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(int[] correctAnswer) {
            this.correctAnswer = correctAnswer;
        }
    }

    public static class ComboBoxTest{
        private String question;
        private String var1;
        private String var2;
        private String var3;
        private int[] correctAnswer;

        public ComboBoxTest(String question, String var1, String var2, String var3, int[] correctAnswer) {
            this.question = question;
            this.var1 = var1;
            this.var2 = var2;
            this.var3 = var3;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getVar1() {
            return var1;
        }

        public void setVar1(String var1) {
            this.var1 = var1;
        }

        public String getVar2() {
            return var2;
        }

        public void setVar2(String var2) {
            this.var2 = var2;
        }

        public String getVar3() {
            return var3;
        }

        public void setVar3(String var3) {
            this.var3 = var3;
        }

        public int[] getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(int[] correctAnswer) {
            this.correctAnswer = correctAnswer;
        }
    }

    public static class ChoiceBoxTest{
        private String question;
        private String varTrue;
        private String varFalse;
        private int[] correctAnswer;

        public ChoiceBoxTest(String question, String varTrue, String varFalse, int[] correctAnswer) {
            this.question = question;
            this.varTrue = varTrue;
            this.varFalse = varFalse;
            this.correctAnswer = correctAnswer;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public int[] getCorrectAnswer() {
            return correctAnswer;
        }

        public void setCorrectAnswer(int[] correctAnswer) {
            this.correctAnswer = correctAnswer;
        }

        public String getVarFalse() {
            return varFalse;
        }

        public void setVarFalse(String varFalse) {
            this.varFalse = varFalse;
        }

        public String getVarTrue() {
            return varTrue;
        }

        public void setVarTrue(String varTrue) {
            this.varTrue = varTrue;
        }
    }

}
