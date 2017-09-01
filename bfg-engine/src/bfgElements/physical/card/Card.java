package bfgElements.physical.card;

import java.util.Map;

import bfgElements.concepts.effect.Effect;
import bfgElements.physical.BfgItem;
import graphics.Graphic;
import javax.annotation.Generated;

public class Card extends BfgItem {

	private String type;
	private Effect effect;
	private Graphic image;
	private Map<String, Integer> symbols;
	private String color;
	private int numericValue;

	@Generated("SparkTools")
	private Card(Builder builder) {
		this.type = builder.type;
		this.effect = builder.effect;
		this.image = builder.image;
		this.symbols = builder.symbols;
		this.color = builder.color;
		this.numericValue = builder.numericValue;
	}

//	public Card(String name, String label, String type) {
//		super(name, label);
//		this.type = type;
//	}
	
	/**
	 * Reports the type of card that this object represents.
	 * @return the type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Creates builder to build {@link Card}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link Card}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String type;
		private Effect effect;
		private Graphic image;
		private Map<String, Integer> symbols;
		private String color;
		private int numericValue;

		private Builder() {
		}

		public Builder withType(String type) {
			this.type = type;
			return this;
		}

		public Builder withEffect(Effect effect) {
			this.effect = effect;
			return this;
		}

		public Builder withImage(Graphic image) {
			this.image = image;
			return this;
		}

		public Builder withSymbols(Map<String, Integer> symbols) {
			this.symbols = symbols;
			return this;
		}

		public Builder withColor(String color) {
			this.color = color;
			return this;
		}

		public Builder withNumericValue(int numericValue) {
			this.numericValue = numericValue;
			return this;
		}

		public Card build() {
			return new Card(this);
		}
	}

}
