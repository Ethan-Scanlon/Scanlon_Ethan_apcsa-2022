/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card sixClubs = new Card("6", "clubs", 6);
		Card queenHearts = new Card("queen", "hearts", 12);
		Card tenSpades = new Card("10", "spades", 10);
		
		System.out.println(sixClubs.pointValue());
		System.out.println(sixClubs.rank());
		System.out.println(sixClubs.suit());
		System.out.println(sixClubs);
		System.out.println(queenHearts.pointValue());
		System.out.println(queenHearts.rank());
		System.out.println(queenHearts.suit());
		System.out.println(queenHearts);
		System.out.println(tenSpades.pointValue());
		System.out.println(tenSpades.rank());
		System.out.println(tenSpades.suit());
		System.out.println(tenSpades);
	}
}
