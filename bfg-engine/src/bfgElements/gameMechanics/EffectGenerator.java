package bfgElements.gameMechanics;

import bfgElements.concepts.effect.Effect;

/**
 * This interface allows an object to generate an Effect. Can be considered an effect Factory. It models objects, such as cards and token, "carrying" either active or passive effects, such as "move track", "move figure", "take card", ect.
 * @author kostadinos
 */
public interface EffectGenerator {

	/**
	 * 
	 */
	/**
	 * @param specs
	 * @return
	 */
	public Effect generate(AbstractEffecGeneratorSpecs specs);
}
