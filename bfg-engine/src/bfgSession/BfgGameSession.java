package bfgSession;

public class BfgGameSession {
	
	private Table table;
	private Croupier croupier;
	private BoardGame bg;
	private BfgMachine box;
	
	public BfgGameSession(BoardGame bg) {
		this.bg = bg;
		this.table = new Table();
		this.croupier = new Croupier(this.table);
		this.box = new BfgMachine();
	}
	
	public void addAvatar(Avatar avatar) {
		this.croupier.registerAvatar(avatar);
	}
	
	public void removeAvatar(Avatar avatar) {
		this.croupier.deregisterAvatar(avatar);
	}
	
	
}
