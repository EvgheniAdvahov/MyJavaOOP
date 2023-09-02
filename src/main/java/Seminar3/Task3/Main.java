package Seminar3.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the game: \n1- EngLetters \n2- RusLetters \n3- Numbers");
        String gameNumber = scanner.nextLine();
        Game game = new GameNumber();


        if (gameNumber.equals("1")) {
            System.out.println("You choose game- EngLetters");
            game = new EngGame();
        } else if (gameNumber.equals("2")) {
            System.out.println("You choose game- RusLetters");
            game = new RuGame();
        } else if (gameNumber.equals("3")) {
            System.out.println("You choose game- Numbers");
        } else {
            System.out.println("Default choise is game- Numbers");
        }
        System.out.println("You could restart restart the game by typing \"restart\" ");

        game.start(3, 3);
        List<Answer> answers = new ArrayList<>();

        Integer maxTry = ((GameNumber) game).getMaxTry();
        Integer sizeWord = ((GameNumber) game).getSizeWord();

        while (!game.getGameStatus().equals(GameStatus.WINNER)
                && !game.getGameStatus().equals(GameStatus.LOSE)) {
            String scannerWord = scanner.nextLine();
            if(scannerWord.equals("restart")){
                System.out.println("The game is restarted");
                game.start(sizeWord,maxTry);
                answers.clear();
                continue;
            }
            Answer answer = game.inputValue(scannerWord);
            System.out.println(answer);
            answers.add(answer);
        }
        System.out.println(game.getGameStatus());
        System.out.println("If you would like to see game History, type \"yes\" ");
        String output = scanner.nextLine();
        if (output.equals("yes")) {
            for (int i = 0; i < answers.size(); i++) {
                System.out.println(i + 1+ " " + answers.get(i));
            }
        }
    }
}