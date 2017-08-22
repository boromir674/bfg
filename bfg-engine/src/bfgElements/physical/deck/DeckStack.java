package bfgElements.physical.deck;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Models the common uses of a deck created out of a set (i.e. cards, marks, tokens) used in a game.
 * @author kostadinos
 *
 */
public class DeckStack {
	
	private LinkedList<Revealable> stack;

	/**
	 * @param items array of all the items in the deck 
	 */
	public DeckStack(Revealable[] items) {
		super();
		this.stack = new LinkedList<Revealable>(Arrays.asList(items));
	}
	
	/**
	 * Call this method to draw the top item in the deck.
	 * @return the top item.
	 */
	public Revealable draw() {
		return this.stack.pop();
	}
	
	/**
	 * Call this method to reveal the top item in the deck.
	 */
	public void revealTop() {
		this.stack.peek().reveal();
	}
	
	
	/**
	 * Call this method to shuffle the deck (stack). 
	 */
	public void shuffle() {
		Collections.shuffle(this.stack);
	}
	
}
