package bfgElements.concepts.phase;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import bfgElements.gameMechanics.AbstractPhase;

/**
 * Extending this class allows for composite phase abstraction.
 * @author kostadinos
 */
public abstract class AbstractMultiPhase implements AbstractPhase {
	
	private String name;
	private List<AbstractPhase> phases;
	
	public AbstractMultiPhase(String name) {
		this.name = name;
		this.phases = new ArrayList<AbstractPhase>();
	}
	
	@Override
	public void unfold() {
		for (AbstractPhase phase : phases ) {
			phase.unfold();
		}
		
	}

	public void add(AbstractPhase phase) {
		this.phases.add(phase);
	}

}
