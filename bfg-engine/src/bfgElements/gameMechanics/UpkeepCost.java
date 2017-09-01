/**
 *
 */
package bfgElements.gameMechanics;

/**
 * An object that has an upkeep cost for the player to maintain during the game.
 * @author kostadinos
 */
public interface UpkeepCost {
	
	/**
	 * Reports the amount required to maintain.
	 * @return the upkeep cost
	 */
	public int getCost();

}
