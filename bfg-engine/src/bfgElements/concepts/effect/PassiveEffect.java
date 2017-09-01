package bfgElements.concepts.effect;

public class PassiveEffect extends Effect {

	public PassiveEffect(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	
	/* (non-Javadoc)
	 * @see bfgElements.concepts.effect.Effect#clone()
	 */
	@Override
	public Effect clone() throws CloneNotSupportedException {
		return new PassiveEffect(this.toString());
	}

}

class PassiveEffectFactory extends AbstractEffectFactory {

	@Override
	public Effect TrackProgression() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Effect ActivePlayerThowDice() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
