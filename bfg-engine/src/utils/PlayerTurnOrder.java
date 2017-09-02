package utils;

/**
 * This class encapsulates the functionality that models an ordering of players.
 * @author kostadinos
 */
public class PlayerTurnOrder {
	
	private int[] orderedPlayersIds;
	
	/**
	 * 
	 * @param orderedIds
	 */
	public PlayerTurnOrder(int[] orderedIds) {
		this.orderedPlayersIds = orderedIds;
	}
}
