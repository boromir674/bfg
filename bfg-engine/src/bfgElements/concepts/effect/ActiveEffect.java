package bfgElements.concepts.effect;

public class ActiveEffect extends Effect {

	/* (non-Javadoc)
	 * @see bfgElements.concepts.effect.Effect#clone()
	 */
	@Override
	public Effect clone() throws CloneNotSupportedException {
		return new ActiveEffect(this.toString());
	}

	public ActiveEffect(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

}
