package bfgSession;

public class Avatar {
	
	private String name;
	
	public Avatar(String aName) {
		this.name = aName;
	}
	
	public void sitOnTable(Table aTable) {
		aTable.addAvatar(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	
	
}
