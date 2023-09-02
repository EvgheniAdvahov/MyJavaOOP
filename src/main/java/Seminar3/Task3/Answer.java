package Seminar3.Task3;

public class Answer {
    private String userInput;
    private Integer bull;
    private Integer cow;


    @Override
    public String toString() {
        return "Input is " + userInput +
                " bull=" + bull +
                " cow=" + cow;
    }

    public Answer(String userInput, Integer bull, Integer cow) {
        this.userInput = userInput;
        this.bull = bull;
        this.cow = cow;
    }
}