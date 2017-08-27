package bfgElements.concepts;

import bfgCommands.Command;
import graphics.Graphic;
import javax.annotation.Generated;

public class Effect {
	
	private final String name;
	private final Graphic image;
	private final Command command;
	
	@Generated("SparkTools")
	private Effect(Builder builder) {
		this.name = builder.name;
		this.image = builder.image;
		this.command = builder.command;
	}
	/**
	 * Creates builder to build {@link Effect}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}
	/**
	 * Builder to build {@link Effect}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String name;
		private Graphic image;
		private Command command;

		private Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withImage(Graphic image) {
			this.image = image;
			return this;
		}

		public Builder withCommand(Command command) {
			this.command = command;
			return this;
		}

		public Effect build() {
			return new Effect(this);
		}
	}
	
}
