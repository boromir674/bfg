package bfgCommands;

import bfgElements.concepts.Player;
import bfgElements.physical.BfgItem;

public class RemoveItemFromPlayer implements Command{
	
	private BfgItem item;
	private Player player;
	
	public RemoveItemFromPlayer(BfgItem item, Player player) {
		this.item = item;
		this.player = player;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
	}
	
}
