import org.xml.sax.ext.Attributes2;

public class Cards {
    private static int cardAmount = 52;
    //private int random = (int) ((Math.random()*4)+1);
    private int random = 37;

    public static int cards(int cardnumber) {
        cardnumber = cardAmount;
        System.out.println("This deck has " + cardnumber + " cards.");
        return cardnumber;
    }

    public int guesses() {
        int guess = 0;
        guess = random;
        return guess;
    }

    public String cardValue() {
        String answer = "";
        for (int i = 0; i < 13; i++) {
            if (guesses() == i) {
                answer = "D" + i;
            }
        }
        for (int i = 14; i < 26; i++) {
            if (guesses() == i) {
                answer = "C" + (i - 13);
            }
        }
        for (int i = 27; i < 39; i++) {
            if (guesses() == i) {
                answer = "H" + (i - 26);
            }
        }
        for (int i = 40; i < 52; i++) {
            if (guesses() == i) {
                answer = "S" + (i - 39);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public String cardSuit() {
        int answer = 0;
        String suit = "";
        for (int i = 0; i < 13; i++) {
            if (guesses() == i) {
                answer = i;
                suit = "D";
            }
        }
        for (int i = 14; i < 26; i++) {
            if (guesses() == i) {
                answer = (i - 13);
                suit = "C";
            }
        }
        for (int i = 27; i < 39; i++) {
            if (guesses() == i) {
                answer = (i - 26);
                suit = "H";

            }
        }
        for (int i = 40; i < 52; i++) {
            if (guesses() == i) {
                answer = (i - 39);
                suit = "S";
            }
        }
        System.out.println(suit);
        return suit;
    }
    public String fullCardName ()
    {

        String name = "";
        if (cardSuit().charAt(0) == 'D')
        {
            String index = cardValue();
            String diamonds = (String.valueOf((index.charAt(1) + index.charAt(2))));
            name = diamonds + " of Diamonds";
        }
        else if (cardSuit().charAt(0) == 'C')
        {
            String index = cardValue();
            String clovers = String.valueOf((index.charAt(1) + index.charAt(2)));
            name = clovers + " of Clovers";
        }
        else if (cardSuit().charAt(0) == 'H')
        {
            String index = cardValue();
            String hearts = String.valueOf((index.charAt(1) + index.charAt(2)));
            name = hearts + " of Hearts";
        }
        else if (cardSuit().charAt(0) == 'S')
        {
            String index = cardValue();
            String spades = String.valueOf((index.charAt(1) + index.charAt(2)));
            name = spades + " of Spades";
        }
        System.out.println(name);
        return name;
    }
}