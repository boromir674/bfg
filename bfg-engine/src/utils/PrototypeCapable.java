package utils;

public interface PrototypeCapable extends Cloneable {

	/**
	 * This method should contain the filed-by-field copy of the instance.
	 * @return a copy of the isntance
	 * @throws CloneNotSupportedException 
	 */
	public PrototypeCapable clone() throws CloneNotSupportedException;

}
