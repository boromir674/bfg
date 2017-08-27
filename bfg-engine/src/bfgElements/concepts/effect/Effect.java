package bfgElements.concepts.effect;

import bfgCommands.Command;

public abstract class Effect implements Cloneable, Command {
	
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
	protected Effect clone() throws CloneNotSupportedException {
		Effect clone = null;
		try {
            clone = (Effect)super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return clone;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.label;
	}
	
}

abstract class AbstractFactory {
    public Effect prototype;

    public Effect makePhase() throws CloneNotSupportedException {
        return prototype.clone();
    }
    
    // Here is the place to define all the necessary methods for the API to be able to create all necessary effects in got, lotr and wk.
    public abstract Effect create();

    public abstract Effect makeGrade();
}