/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {

    public static void main(String[] args){
        Card card1 = new Card("King","Spades",10);
        Card card2 = new Card("Six","Hearts",6);
        Card card3 = new Card("Ace","Diamonds",1);
        Card card4 = new Card("King","Spades",10);

        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);

        System.out.println();
        System.out.println(card1.matches(card4));
        System.out.println(card2.suit());
        System.out.println(card3.rank());
        System.out.println(card2.pointValue());
    }

}
