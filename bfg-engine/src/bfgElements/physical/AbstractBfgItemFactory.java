package bfgElements.physical;

public abstract class AbstractBfgItemFactory {

	private enum Architecture {
		CARD, TOKEN
	}

	private static final CardToolkit CARD_TOOLKIT = new CardToolkit();
	private static final TokenToolkit TOKEN_TOOLKIT = new TokenToolkit();

	// Returns a concrete factory object that is an instance of the
	// concrete factory class appropriate for the given architecture.
	static AbstractBfgItemFactory getFactory(Architecture architecture) {
		AbstractBfgItemFactory factory = null;
		switch (architecture) {
		case CARD:
			factory = CARD_TOOLKIT;
		case TOKEN:
			factory = TOKEN_TOOLKIT;
		}
		return factory;
	}

	public abstract CPU createCPU();

	public abstract MMU createMMU();
}
