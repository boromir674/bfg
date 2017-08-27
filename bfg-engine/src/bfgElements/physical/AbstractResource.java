package bfgElements.physical;

import bfgElements.mechanics.Resource;

public class AbstractResource implements Resource {
	
	private String name;
	private String label;
	
	public AbstractResource(String name, String label) {
		super();
		this.name = name;
		this.label = label;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void add(int units) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(int units) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
