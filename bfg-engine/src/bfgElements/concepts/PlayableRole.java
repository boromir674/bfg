/**
 * 
 */
package bfgElements.concepts;

/** 
 * A class implementing this interface indicates that it represents a playable role (Frodo, the Starks, Blue Baron, etc) for a player.
 * @author kostadinos
 */
public interface PlayableRole {
	
	/**
	 * This method associates the object implementing the PlayableRole interface with a Player instance. 
	 * @param player a reference to the object to map this to
	 */
	public void mapToPlayer(Player player);
}
