import java.util.Scanner;
import java.text.DecimalFormat;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("00");
        Cards value = new Cards();
        Scanner scan = new Scanner(System.in);
        System.out.println("Write Yes to start:  ");
        String start = scan.nextLine();
        int deck = 52;
        int cards = Cards.cards(deck);
        System.out.println("Enter your guess from 1 to 52");
        Cards guess = new Cards();
        int guessOne = scan.nextInt();
        while (Integer.parseInt(guess.guesses()) != guessOne)
        {
            System.out.println("Wrong!");
            System.out.print("Try again!");
            scan.nextLine();
        }

        String card = value.fullCardName();
        System.out.println(card);
        System.out.println("Congratulations you guessed the " + card + " correctly!");

    }
}