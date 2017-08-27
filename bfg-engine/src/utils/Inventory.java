package utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bfgElements.mechanics.Resource;
import bfgElements.physical.BfgItem;
import bfgElements.physical.Figure;

/**
 * This class serves as the personal manager of all the players belongings (cards, resources, tokens, etc).
 * @author kostadinos
 */
public class Inventory {
	
	private List<BfgItem> items;
	private Map<String, Integer> resources;
	private List<Figure> figures;
	
	public Inventory() {
		this.items = new ArrayList<BfgItem>();
		this.resources = new HashMap<String, Integer>();
		this.figures = new ArrayList<Figure>();
	}
	
	public void add(BfgItem item) {
		this.items.add(item);
	}
	public void add(Figure figure) {
		this.figures.add(figure);
	}
	public void add(Resource resource) {
		if (resources.containsKey(resource.getValue()))
	}
}
