package bfgElements.physical;

/**
 * Models any generic item that be found in a board game. 
 * @author kostadinos
 */
public class BfgItem {
	
	private String name;
	private String label;
	
	/**
	 * Reports the title of the item object i.e. "Helm's Deep Region Card, Riders of Rohan".
	 * @return the name/title
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Reports a text as quick reference to the item object. Should be shorter, if possible, than the title i.e. "Riders of Rohan".
	 * @return the associated label
	 */
	public String getLabel() {
		return label;
	}
		
}
