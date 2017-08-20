package bfgElements.physical;

import bfgElements.concepts.Player;
import bfgExceptions.InvalidNumberOfPlayersException;

/**
 * Implementing this interface allows for generation of Player objects capability. 
 * @author kostadinos
 *
 */
public interface PlayerGenerator {
	
	/**
	 * @param players the number of players to generate
	 * @return an array of the Player objects that participate in a game.
	 * @throws InvalidNumberOfPlayersException throws if the requested number of players are not supported
	 */
	public Player[] generatePlayers(int players) throws InvalidNumberOfPlayersException;
}
