package bfgElements.concepts;

import java.util.HashMap;

import bfgSession.Avatar;
import bfgSession.BoardGame;

/**
 * This class is responsible for simulating a board game session between players.
 * @author kostadinos
 */
public class GameSession {
	
	private Player[] players;
	private BoardGame bfg;
	private HashMap<Avatar, Player> avatar2Player = new HashMap<Avatar, Player>();
	
	/**
	 * @param players an array with the Player objects
	 * @param bfg an instance of the bfg to play on
	 */
	public GameSession(Player[] players, BoardGame bfg) {
		this.players = players;
		this.bfg = bfg;
	}
	
	/**
	 * Return the resulting mapping of the input Avatar.
	 * @param anAvatar 
	 * @return the reference to the Player object mapped by the Avatar object
	 */
	public Player getPlayer(Avatar anAvatar) {
		return this.avatar2Player.get(anAvatar);
	}
	
	/**
	 * Stores a mapping between the given Avatar and Player objects.
	 * @param anAvatar
	 * @param aPlayer
	 */
	public void mapAvatarToPlayer(Avatar anAvatar, Player aPlayer) {
		this.avatar2Player.put(anAvatar, aPlayer);
	}
	
}
