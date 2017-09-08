package bfgElements.gameMechanics;

/**
 * A class implementing this interface behaves as a discrete phase of the game during a play session.
 * @author kostadinos
 */
public interface AbstractPhase {
	
	/**
	 * Let's the gameplay flow.
	 */
	public void unfold();
	
}
