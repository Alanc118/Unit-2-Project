import org.xml.sax.ext.Attributes2;

public class Cards {
    private static int cardAmount = 52;
    //private int random = (int) ((Math.random()*4)+1);
    private int random = 2;
    public static int cards (int cardnumber)
    {
        cardnumber = cardAmount;
        System.out.println("This deck has " + cardnumber + " cards.");
        return cardnumber;
    }

    public int guesses ()
    {
        int guess = 0;
        guess = random;
        return guess;
    }
    public String cardValue ()
    {
        String answer = "";
        String [] cardName = {"A1" + "A2" + "A3" + "A4"};
        for (int i = 0; i < 13; i++) {
            if (guesses() == i)
            {
                answer = "D" + i;
            }
        }
        for (int i = 14; i < 26; i++)
        {
            if (guesses() == i)
            {
                answer = "C" + (i-13);
            }
        }
        for (int i = 27; i < 39; i++)
        {
            if (guesses() == i)
            {
                answer = "H" + (i-26);
            }
        }
        for (int i = 40; i < 52; i++)
        {
            if (guesses() == i)
            {
                answer = "S" + (i-39);
            }
        }
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
            return suit;
        }
        public String fullCardName()
    {
            {
                String diamonds = "D";
                if (cardValue().indexOf(0) == 68) {
                    String name = "Diamonds" + cardValue().indexOf(1);


                }
            }
        }
    }