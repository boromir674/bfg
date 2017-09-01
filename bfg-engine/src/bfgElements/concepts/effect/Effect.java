package bfgElements.concepts.effect;

import bfgCommands.Command;
import utils.PrototypeCapable;

public abstract class Effect implements PrototypeCapable, Command {
	
	private String label;
//	private Graphic image;
//	private Command command;
	
	public Effect(String name) {
		this.label = name;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Effect clone() throws CloneNotSupportedException {
		return (Effect) super.clone();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.label;
	}	
}
