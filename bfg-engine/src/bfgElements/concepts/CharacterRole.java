package bfgElements.concepts;

public class CharacterRole implements PlayableRole {
	
	private String name;
	
	public CharacterRole(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

	@Override
	public void mapToPlayer(Player player) {
		// TODO Auto-generated method stub

	}

}
