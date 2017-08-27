package bfgElements.physical;

import java.util.Random;

import bfgElements.concepts.effect.Effect;

/** 
 * Base class for modeling a dice.
 * @author kostadinos
 *
 */
public class Dice {
	
	private Effect[] sides;
	private String label;
	private Random rand;
	private int state;
	
	/**
	 * @param sides an array of Effect objects, one per side
	 * @param label a text label
	 */
	public Dice(Effect[] sides, String label) {
		this.sides = sides;
		this.label = label;
		this.state = 0;
	}
	
	/**
	 * Call this method to set the internal seed of the Random instant.
	 * @param aSeed the numrical value to set to
	 */
	public void setSeed(int aSeed) {
		this.rand.setSeed(aSeed);
	}
	
	/**
	 * Call this method to (pseudo) randomly roll the dice, changing its state.
	 */
	public void roll() {
		this.state = this.rand.nextInt(sides.length);
	}
	
	/**
	 * Reports the resulting effect according to face-up side of the die.
	 * @return the reference to the Effect object
	 */
	public Effect getResult() {
		return this.sides[this.state];
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

}
