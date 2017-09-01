/**
 * 
 */
package bfgElements.gameMechanics;

/**
 * An object that represents a resource. An object implementing this interface is considered to be a resourse that can be gathered by the players during the game. 
 * @author kostadinos
 *
 */
public interface Resource extends Accountable, Concept{
	
	/**
	 * Allows for increasing the bulk by the specified amount. 
	 * @param units the number to add to the bulk
	 */
	public void add(int units);
	
	/**
	 * Allows for decreasing the bulk by the specified amount.
	 * @param units the number to subtract from the bulk
	 */
	public void remove(int units);
	
}
