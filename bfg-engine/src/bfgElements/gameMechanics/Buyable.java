/**
 * 
 */
package bfgElements.gameMechanics;

import bfgElements.concepts.Player;

/**
 * An object that can be bought during the game by a player.
 * @author kostadinos
 *
 */
public interface Buyable extends Obtainable {
	
	/**
	 * Sell the object to the referenced player. Implement the transaction logic.
	 * @param player the @player which buys the object
	 */
	public void sellTo(Player player);
	
	/**
	 * Reports the purchasing cost of the object. 
	 * @return the actual cost (value)
	 */
	public int getValue();
}
