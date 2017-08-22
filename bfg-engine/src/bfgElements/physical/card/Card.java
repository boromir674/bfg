package bfgElements.physical.card;

import bfgElements.concepts.Effect;
import graphics.Graphic;

public class Card {
	
	private final String name;
	private final String label;
	private final String type;
	private final Effect effect;
	private final Graphic image;
	private final String symbol;
	private final int numOfSymbols;
	private final String color;
	private final int numericValue;
	
	private Card(CardBuilder builder) {
		this.name = builder.name;
		this.label = builder.label;
		this.type = builder.type;
		this.effect = builder.effect;
		this.image = builder.image;
		this.symbol = builder.symbol;
		this.numOfSymbols = builder.numOfSymbols;
		this.color = builder.color;
		this.numericValue = builder.numericalValue;
	}
	
	public String getName() {
		return name;
	}
	public String getLabel() {
		return label;
	}
	public String getType() {
		return type;
	}
	public Effect getEffect() {
		return effect;
	}
	public Graphic getImage() {
		return image;
	}
	public String getSymbol() {
		return symbol;
	}
	public int getNumOfSymbols() {
		return numOfSymbols;
	}
	public String getColor() {
		return color;
	}
	public int getNumericValue() {
		return numericValue;
	}
	
	public static class CardBuilder {
		
		private final String name;
		private String label;
		private final String type;
		private Effect effect;
		private Graphic image;
		private String symbol;
		private int numOfSymbols;
		private String color;
		private int numericalValue;
		
		public CardBuilder(String name, String type) {
			this.name = name;
			this.type = type;
		}
		
		public CardBuilder label(String label) {
			this.label = label;
			return this;
		}
		public CardBuilder effect(Effect effect) {
			this.effect = effect;
			return this;
		}
		public CardBuilder graphic(Graphic image) {
			this.image = image;
			return this;
		}
		public CardBuilder symbol(String symbol) {
			this.symbol = symbol;
			return this;
		}
		public CardBuilder numOfSymbols(int numOfSymbols) {
			this.numOfSymbols = numOfSymbols;
			return this;
		}
		public CardBuilder color(String color) {
			this.color = color;
			return this;
		}
		public CardBuilder numericalValue(int numericalValue) {
			this.numericalValue = numericalValue;
			return this;
		}
		
		public Card build() {
			return new Card(this);
		}
		
	}
	
	
}
