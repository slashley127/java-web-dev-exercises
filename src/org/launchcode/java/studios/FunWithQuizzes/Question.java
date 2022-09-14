package org.launchcode.java.studios.FunWithQuizzes;

public abstract class Question {
    private String question;
    private boolean isCorrect;
    private String answer;

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
        this.isCorrect = false;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
