package bfgElements.gameMechanics;

/**
 * A class implementing this interface allows for moving the object on a map.
 * @author kostadinos
 */
public interface MoveableOnMap {
	
	/**
	 * This method rellocates the object on the given map region.
	 * @param area the designated map region
	 */
	public void move(MapRegion area);
}
