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

