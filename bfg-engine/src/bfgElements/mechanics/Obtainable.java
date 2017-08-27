/**
 * 
 */
package bfgElements.mechanics;

import bfgElements.concepts.Player;

/**
 * An instance of a class implementing this interface can be obtained by a player during a game. 
 * @author kostadinos
 * 
 */
public interface Obtainable {
	
	/**
	 * The object comes into the possesion of the referenced player @see Player. This method implements the possesion change of the object.
	 * @param player the @Player which siezes possesion of the object
	 */
	public void giveTo(Player player);
}
