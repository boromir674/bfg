package bfgElements.physical;

import bfgElements.concepts.Player;
import bfgElements.concepts.Specs;
import bfgExceptions.InvalidNumberOfPlayersException;

public class BfgGenerator implements PlayerGenerator{
	
	private Specs specs;
	
	public BfgGenerator(Specs specs) {
		this.specs = specs;
	}

	@Override
	public Player[] generatePlayers(int players) throws InvalidNumberOfPlayersException {
		if (players < specs.getMinimumPlayers() || players > specs.getMaximumPlayers()) {
			throw new InvalidNumberOfPlayersException(String.format("Requested to create %d players, whereas %s supports between %d and %d", players, specs.getBfgName(), specs.getMinimumPlayers(), specs.getMaximumPlayers()));
		}
		return null;
	}
	
}
