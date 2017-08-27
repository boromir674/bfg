package bfgElements.mechanics;

/**
 * A object that behaves as a scoring concept. Contributes to calculating a player's score.
 * @author kostadinos
 */
public interface ScoringConcept {
	
	/**
	 * Reports the accountable numerical score.
	 * @return the score value
	 */
	public int getScore();
}
