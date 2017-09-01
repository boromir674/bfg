package bfgElements.gameMechanics;

/**
 * An object that can be counted.
 * @author kostadinos
 *
 */
public interface Accountable {
	
	/**
	 * Allows for reporting the current total bulk of the accumulated resource.
	 * @return the current total amount
	 */
	public int getValue();

}
