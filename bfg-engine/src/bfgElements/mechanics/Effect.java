package bfgElements.mechanics;

/**
 * A possible effect during gameplay i.e. "give card to player". Can be either active or passive.
 * @author kostadinos
 */
public interface Effect {
	
	/**
	 * Activates the effect.
	 */
	public void activate();
}
