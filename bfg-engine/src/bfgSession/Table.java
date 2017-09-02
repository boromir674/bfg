package bfgSession;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private List<Avatar> avatars;
	private BoardGame bfg;
	
	public Table() {
		this.avatars = new ArrayList<Avatar>();
	}
	public void addAvatar(Avatar avatar) {
		this.avatars.add(avatar);
	}
	public void setBoardGame(BoardGame bfg) {
		this.bfg = bfg;
	}
	/**
	 * @return the players
	 */
	public List<Avatar> getAvatars() {
		return avatars;
	}
	public int getTablePopulation() {
		return this.avatars.size();
	}
	public BoardGame getBoardGame() {
		return this.bfg;
	}
	
}
