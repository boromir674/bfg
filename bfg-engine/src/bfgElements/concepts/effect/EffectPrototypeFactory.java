package bfgElements.concepts.effect;

import java.util.HashMap;
import java.util.Map;

import utils.PrototypeCapable;

public class EffectPrototypeFactory {

	public static class EffectType {
		public static final String GIVE_ITEM_TO_PLAYER = "give item to player";
		public static final String REQUEST_CONTRIBUTION = "request contribution";
		public static final String PROGRESS_ON_TRACK = "progress on track";
	}

	private static Map<String, PrototypeCapable> prototypes = new HashMap<String, PrototypeCapable>();

	static {
		prototypes.put(EffectType.GIVE_ITEM_TO_PLAYER, new GiveItemEffect(EffectType.GIVE_ITEM_TO_PLAYER));
		prototypes.put(EffectType.REQUEST_CONTRIBUTION, new RequestContributionEffect(EffectType.REQUEST_CONTRIBUTION));
		prototypes.put(EffectType.PROGRESS_ON_TRACK, new ProgressOnTrackEffect(EffectType.PROGRESS_ON_TRACK));
	}

	public static PrototypeCapable getInstance(final String s) throws CloneNotSupportedException {
		return ((PrototypeCapable) prototypes.get(s)).clone();
	}
}
