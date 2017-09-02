package bfgSession;

import java.util.ArrayList;
import java.util.List;

import bfgCommands.Command;
import utils.PlayerTurnOrder;

public class BfgMachine {
	
	private List<Command> history;
	private Table t;
	
	public BfgMachine() {
		this.history = new ArrayList<Command>();
	}
	
	public void storeAndExecute(Command cmd) {
		this.history.add(cmd);
		cmd.execute();
	}
	
	public void plugIntoTable(Table table) {
		this.t = table;
	}

}
