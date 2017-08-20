package bfgSession;

import bfgElements.concepts.GameSession;
import bfgElements.concepts.Player;
import bfgExceptions.InvalidNumberOfPlayersException;

public class Croupier {
	
	private Table table;
	private GameSession session;
	
	public Croupier() {
		
	}
	
	public void setTable(Table aTable) { 
		this.table = aTable;
	}
	
	/**
	 * Creates an instance of GameSession which the Croupier is going to manage through the gameplay.
	 */
	public void createGameSession() {
		try {
			this.session = new GameSession(table.getBoardGame().getGenerator().generatePlayers(table.getTablePopulation()), table.getBoardGame());
		} catch (InvalidNumberOfPlayersException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void assignAvatarToPlayer(Avatar anAvatar, Player aPlayer) {
		this.session.mapAvatarToPlayer(anAvatar, aPlayer);
	}
}
