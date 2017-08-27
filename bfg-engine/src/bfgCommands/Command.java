package bfgCommands;

/**
 * Implement this interface to allow for command execution capabilities. 
 * @author kostadinos
 */
public interface Command {
	
	/**
	 * The implemented the command functionality gets executed.
	 */
	public void execute();
}
