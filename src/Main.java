import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 52: ");
        int start = scan.nextInt();
        int cards = Cards.cards(start);
        System.out.println("Enter your guess from 1 to 52");
        Cards guess = new Cards();
        int guessOne = scan.nextInt();
        while (guess.guesses() != guessOne)
        {
            System.out.println("Wrong!");
            System.out.print("Try again!");
            scan.nextLine();
        }
        System.out.println("Congratulations you guessed the " + " correctly!");

    }
}