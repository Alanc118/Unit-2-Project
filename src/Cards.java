import org.xml.sax.ext.Attributes2;
import java.text.DecimalFormat;
public class Cards {
    private static int cardAmount = 52;
    //private int random = (int) ((Math.random()*4)+1);
    private int random = 1;
    DecimalFormat formatter = new DecimalFormat("00");

    public static int cards(int cardnumber) {
        cardnumber = cardAmount;
        System.out.println("This deck has " + cardnumber + " cards.");
        return cardnumber;
    }

    public String guesses() {
        return formatter.format(random);
    }

    public String cardValue() {
        String answer = "";
        for (int i = 0; i < 13; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = "D" + formatter.format(i);
            }
        }
        for (int i = 14; i < 26; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = "C" + formatter.format(i - 13);
            }
        }
        for (int i = 27; i < 39; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = "H" + formatter.format(i - 26);
            }
        }
        for (int i = 40; i < 52; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = "S" + formatter.format(i - 39);
            }
        }
        System.out.println(answer);
        return answer;
    }

    public String cardSuit() {
        int answer = 0;
        String suit = "";
        for (int i = 0; i < 13; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = i;
                suit = "D";
            }
        }
        for (int i = 14; i < 26; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = (i - 13);
                suit = "C";
            }
        }
        for (int i = 27; i < 39; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = (i - 26);
                suit = "H";

            }
        }
        for (int i = 40; i < 52; i++) {
            if (Integer.parseInt(guesses()) == i) {
                answer = (i - 39);
                suit = "S";
            }
        }
        System.out.println(suit);
        return suit;
    }

    public String fullCardName() {
        String name = "";
        if (cardSuit().charAt(0) == 'D') {
            String index = cardValue();
            int letterOne = index.charAt(1);
            int letterTwo = index.charAt(2);
            System.out.println(letterOne);
            System.out.println(letterTwo);
            String diamonds = letterOne + "" + letterTwo;
            if (letterOne == 0) {
                if (letterTwo == 1) {
                    diamonds = "Ace";
                }
            }
            if (letterOne == 1) {
                if (letterTwo == 1) {
                    diamonds = "Jack";
                } else if (letterTwo == 2) {
                    diamonds = "Queen";
                } else if (letterTwo == 3) {
                    diamonds = "King";
                }
                System.out.println(diamonds);
                name = diamonds + " of Diamonds";
            }
        } else if (cardSuit().charAt(0) == 'C') {
            String index = cardValue();
            char letterOne = index.charAt(1);
            char letterTwo = index.charAt(2);
            String clovers = letterOne + "" + letterTwo;
            if (letterOne == 0) {
                if (letterTwo == 1) {
                    clovers = "Ace";
                }
            }
            if (letterOne == 1) {
                if (letterTwo == 1) {
                    clovers = "Jack";
                } else if (letterTwo == 2) {
                    clovers = "Queen";
                } else if (letterTwo == 3) {
                    clovers = "King";
                }
                name = clovers + " of Clovers";
            }
        } else if (cardSuit().charAt(0) == 'H') {
            String index = cardValue();
            System.out.println("Index is " + index);
            char letterOne = index.charAt(1);
            char letterTwo = index.charAt(2);
            String hearts = letterOne + "" + letterTwo;
            if (letterOne == 0) {
                if (letterTwo == 1) {
                    hearts = "Ace";
                }
            }
            if (letterOne == 1) {
                if (letterTwo == 1) {
                    hearts = "Jack";
                } else if (letterTwo == 2) {
                    hearts = "Queen";
                } else if (letterTwo == 3) {
                    hearts = "King";
                }
                name = hearts + " of Hearts";
            }
        } else if (cardSuit().charAt(0) == 'S') {
            String index = cardValue();
            char letterOne = index.charAt(1);
            char letterTwo = index.charAt(2);

            String spades = letterOne + "" + letterTwo;
            if (letterOne == 0) {
                if (letterTwo == 1) {
                    spades = "Ace";
                }
            }
            if (letterOne == 1) {
                if (letterTwo == 1) {
                    spades = "Jack";
                } else if (letterTwo == 2) {
                    spades = "Queen";
                } else if (letterTwo == 3) {
                    spades = "King";
                }
                name = spades + " of Spades";
            }
        }
        System.out.println(name);
        return name;
    }
}