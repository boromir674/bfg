package bfgElements.physical.deck;

/**
 * An item (card, marker, token, etc) that has a dual state of visible/hidden and that under circumstances is has to be revealed and/or hidden.
 * @author kostadinos
 *
 */
public interface Revealable {
	
	/**
	 * Makes the object visible. Reveals the contents of the item (card, marker, token, etc).
	 */
	public void reveal();
	
	/**
	 * Hides the contents of the item (card, marker, token, etc).
	 */
	public void hide();
}
