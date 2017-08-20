package bfgElements.concepts;

/**
 * A class responsible for managing the turn succession between players. Supports only fixed turn succession (in linear order) during a game.
 * @author kostadinos
 */
public class Turn {
	
	private Player[] players;
	private int totalTurnSum = 0;
	private int index = 0;
	
	/**
	 * @param players an array of the fixed linear order of the players
	 */
	public Turn (Player[] players) {
		this.players = players;
	}
	
	/**
	 * Call this method to report whose player's turn is.
	 * @return a reference to the Player
	 */
	public Player getPlayerTurn() {
		return this.players[this.index]; 
	}
	
	/**
	 * Reports the number of turns played so far.
	 * @return the total turns played
	 */
	public int getAccumulatedTurnsSum() {
		return this.totalTurnSum;
	}
	
	/**
	 * Call this method whenever signaling the start of the next player's turn.
	 */
	public void next() {
		this.totalTurnSum ++;
		this.index = (this.index + 1) % this.players.length;  
	}
	
	/**
	 * Call this method to prepare the state of the object for a new game.
	 * @param players an array of the fixed linear order of the players 
	 */
	public void initialize(Player[] players) {
		this.players = players;
		this.totalTurnSum = 0;
		this.index = 0;
	}
}
