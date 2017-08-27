package bfgElements.mechanics;

/**
 * Models any generic concept represented as a String (text of words) such as "influence", "battle", etc. 
 * @author kostadinos
 */
public interface Concept {

	/**
	 * This method should return the title of the Concept object i.e. "
	 * @return the name/title
	 */
	public String getName();
	
	/**
	 * This method should return a text as quick reference to the Concept object. Should be shorter, if possible, than the title.
	 * @return the associated label
	 */
	public String getLabel();
	
}
