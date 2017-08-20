package bfgElements.concepts;

/**
 * @author kostadinos
 * A class responsible for managing the round progression during a game. Supports descending rounds.
 */
public class Round {
	
	private int counter;
	private boolean descending = false;
	
	/**
	 * @param initialCounter the initial arithmetic value of the round counter
	 */
	public Round(int initialCounter) {
		this.counter = initialCounter;
	}
	
	/**
	 * @param initialCounter the initial arithmetic value of the round counter
	 * @param descending if true then round counter decreases, else increases
	 */
	public Round(int initialCounter, boolean descending) {
		this.descending = descending;
		this.counter = initialCounter;
	}
	
	/**
	 * Reports the current round number.
	 * @return the round counter
	 */
	public int getRoundNumber() {
		return this.counter;
	}
	
	/**
	 * Call this method to reset the state of the object to initial values.
	 * @param initialCounter the initial arithmetic value of the round counter
	 * @param descending if true then round counter decreases, else increases
	 */
	public void initialize(int initialCounter, boolean descending) {
		this.counter = initialCounter;
		this.descending = descending;
	}
	
	/**
	 * Call this method whenever signaling the start of the next round
	 */
	public void next() {
		this.counter = ((descending == false) ? counter + 1 : counter - 1);
	}
}
