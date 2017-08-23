/**
 * 
 */
package bfgElements.concepts;

/**
 * @author kostadinos
 *
 */
public class CharacterPlayableMaker extends PlayableMaker {

	public CharacterPlayableMaker(PlayableRole role) {
		super(role);
	}

	/* (non-Javadoc)
	 * @see bfgElements.concepts.PlayableMaker#mapToPlayer(bfgElements.concepts.Player)
	 */
	@Override
	public void mapToPlayer(Player player) {
		super.role.mapToPlayer(player);
	}
		
}
