/**
 * 
 */
package bfgElements.concepts;

/**
 * @author kostadinos
 *
 */
public abstract class PlayableMaker implements PlayableRole {
	
	protected PlayableRole role;
	
	public PlayableMaker(PlayableRole role) {
		this.role = role;
	}
	/* (non-Javadoc)
	 * @see bfgElements.concepts.Playable#mapToPlayer(bfgElements.concepts.Player)
	 */
	@Override
	public void mapToPlayer(Player player) {
		role.mapToPlayer(player);
	}

}
