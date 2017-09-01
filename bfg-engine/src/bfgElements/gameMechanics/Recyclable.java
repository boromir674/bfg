/**
 * 
 */
package bfgElements.gameMechanics;

/**
 * An object that can come in and out of play during a game session.
 * @author kostadinos
 *
 */
public interface Recyclable {
	
	/**
	 * The object goes out of play/gets "deactivated".  
	 */
	public void comeIntoPlay();
	
	/**
	 * The object comes back into play/ gets "activated". 
	 */
	public void goOutOfPlay();
}
