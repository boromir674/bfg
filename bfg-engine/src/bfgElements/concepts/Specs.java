package bfgElements.concepts;

public class Specs {
	
	private int minimumPlayers;
	private int maximumPlayers;
	private String bfgName;
	
	public Specs(int minimumPlayers, int maximumPlayers) {
		this.minimumPlayers = minimumPlayers;
		this.maximumPlayers = maximumPlayers;
	}
	/**
	 * @return the minimumPlayers
	 */
	public int getMinimumPlayers() {
		return minimumPlayers;
	}
	/**
	 * @return the maximumPlayers
	 */
	public int getMaximumPlayers() {
		return maximumPlayers;
	}
	/**
	 * @return the bfgName
	 */
	public String getBfgName() {
		return bfgName;
	}
	/**
	 * @param bfgName the bfgName to set
	 */
	public void setBfgName(String bfgName) {
		this.bfgName = bfgName;
	}
	
}
