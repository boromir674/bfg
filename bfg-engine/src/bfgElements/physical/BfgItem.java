package bfgElements.physical;

import java.util.Map;

import bfgElements.concepts.Phase;
import bfgElements.concepts.effect.Effect;
import graphics.Graphic;

/**
 * Models any generic item that be found in a board game. 
 * @author kostadinos
 */
public abstract class BfgItem {
	
	private String name;
	private String label;
	
	private String type;
	private Effect effect;
	private Map<Phase, Effect> multiEffects;
	private Graphic image;
	private Map<String, Integer> symbols;
	private String color;
	private int numericValue;
	
//	public BfgItem(String name, String label) {
//		this.name = name;
//		this.label = label;
//	}
//	
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
