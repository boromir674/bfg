package bfgElements.gameMechanics;

/**
 * Implementing this interface allows an object to behave like a generic area on a map i.e. "Winterfell region"
 * @author kostadinos
 */
public interface MapRegion {
	
	/**
	 * This method reports the name of the region.
	 * @return the name
	 */
	public String getName();
	
	/**
	 * This method reports the current controller, occupant party of the region i.e. "red baron", the Lanisters.
	 * @return the controller
	 */
	public String getController();
}
