package bfgSession;

import bfgElements.concepts.Player;
import bfgElements.concepts.Specs;
import bfgElements.physical.BfgGenerator;
import bfgExceptions.InvalidNumberOfPlayersException;

public class BoardGame {
	
	private String name;
	
	public BoardGame(String name) {
		this.name = name;
	}
	
	private Specs specs;
	
	
	public Player[] generatePlayers(int players) throws InvalidNumberOfPlayersException {
		if (players < specs.getMinimumPlayers() || players > specs.getMaximumPlayers()) {
			throw new InvalidNumberOfPlayersException(String.format("Requested to create %d players, whereas %s supports between %d and %d", players, name, specs.getMinimumPlayers(), specs.getMaximumPlayers()));
		}
		return null;
	}

	public BfgGenerator getGenerator() {
		// TODO Auto-generated method stub
		return null;
	}

}
