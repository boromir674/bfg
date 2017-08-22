package bfgCommands;

import bfgElements.concepts.Player;
import bfgElements.physical.BfgItem;

public class GiveItemToPlayer implements BfgCommand {
	
	private BfgItem item;
	private Player player;
	
	public GiveItemToPlayer(BfgItem item, Player player) {
		this.item = item;
		this.player = player;
	}

	@Override
	public void execute() {
		player.take(item);
	}

}
