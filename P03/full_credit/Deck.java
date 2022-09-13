import java.util.*;

public class Deck{
	private Stack<Card> deck = new Stack<>();

	public Deck(){
		this.deck=deck;

		for(Suit suit : Suit.values()){
			for(int i=0; i<10; i++){
				deck.push(new Card(new Rank(i), suit));
			}
		}	
	}

	public void shuffle(){
		Collections.shuffle(this.deck);
	};

	public Card deal(){
		
		if(deck.empty() == true) throw new IndexOutOfBoundsException();
		
		else return deck.pop();
	}

	public boolean isEmpty(){
		return deck.empty();
	}
}