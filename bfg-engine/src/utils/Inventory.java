package utils;

import java.util.HashMap;
import java.util.Map;

import bfgElements.gameMechanics.Resource;
import bfgElements.physical.BfgItem;
import bfgElements.physical.Figure;

/**
 * This class serves as the personal manager of all the players belongings (cards, resources, tokens, etc). It registers Items and resources.
 * @author kostadinos
 */
public class Inventory {
	
	private Map<String, BfgItem> items;
	private Map<String, Integer> resources;
	private Map<String, Figure> figures;
	
	private Inventory() {
		this.items = new HashMap<String, BfgItem>();
		this.resources = new HashMap<String, Integer>();
		this.figures = new HashMap<String, Figure>();
	}
	
	/**
	 * Factory method. Initializes a fresh empty Inventory instance.
	 * @return the instance
	 */
	public Inventory initialize() {
		return new Inventory();
	}
//	public void initialize() {
//		this.items = new ArrayList<BfgItem>();
//		this.resources = new HashMap<String, Integer>();
//		this.figures = new ArrayList<Figure>();
//	}
	/**
	 * Call this method to register an item (card, figure, token, ..) object in the inventory. 
	 * @param item the newly inserted into the inventory
	 */
	public void add(BfgItem item) {
		if (item.getClass().equals(Figure.class)) {
			this.figures.put(item.getLabel(), (Figure) item);
		}
		else {
			this.items.put(item.getLabel(), item);
		}
	}
	
	/**
	 * Call this method to request a reference to a registered item (card, token, figure, ..) object in the inventory.
	 * @param label the unique identifier key
	 * @return the reference to the item if found. Returns null if the object is not found.
	 */
	public BfgItem get(String label) {
		BfgItem found = this.items.get(label);
		if (found != null)
			return found;
		else {
			return this.figures.get(label);
		}
	}
	
	/**
	 * Call this method to remove a registered item from the inventory. If not found nothing happens.
	 * @param label the unique identifier key
	 */
	public void remove(String label) {
		BfgItem found = this.items.get(label);
		if (found != null)
			this.items.remove(label);
		else {
			this.figures.remove(label);
		}
	}
	
	/**
	 * Call this method to remove the specified bulk of a registered resource collected into the inventory. If not found nothing happens.
	 * @param resource an object encapsulating the bulk of the resource to be removed
	 */
	public void remove(Resource resource) {
		String l = resource.getLabel();
		if (resources.containsKey(l)) {
			resources.put(l, resources.get(l) - resource.getValue());
		}
	}
	
	/**
	 * Call this method to add the specified bulk of resource into the inventory.
	 * @param resource an object encapsulating the bulk of the resource to be added
	 */
	public void add(Resource resource) {
		String l = resource.getLabel();
		if (resources.containsKey(l)) {
			resources.put(l, resources.get(l) + resource.getValue());
		}
		else {
			resources.put(l, resource.getValue());
		}
	}
	
}
