/*
 * Purpose : Leaning how to do method chaining to build new classes and objects.
 * 
 * Depends on the abstract class pizza.java in this package
 *
 * Date: 05-January-2019
 */

package sk.ndstd.builderparadigm;

import java.util.Objects;

import sk.ndstd.builderparadigm.NewYorkPizza.Builder;
import sk.ndstd.builderparadigm.NewYorkPizza.Size;

public class NewYorkPizza extends Pizza {

	public enum Size {
		SMALL, MEDIUM, LARGE
	}; // EO SIZE

	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;

		public Builder(Size size) { this.size = Objects.requireNonNull(size); }

		@Override
		protected Builder self() { return this; }

		@Override
		NewYorkPizza build() { return new NewYorkPizza(this); }

	} // public static class Builder

	public NewYorkPizza(Builder builder) { // Constructor
		super(builder);
		this.size = builder.size;
	}

} // EO NewYorkPizza


