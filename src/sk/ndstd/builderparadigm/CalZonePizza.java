/*
 * Purpose : Leaning how to do method chaining to build new classes and objects.
 * 
 * Depends on the abstract class pizza.java in this package
 *
 * Date: 05-January-2019
 */

package sk.ndstd.builderparadigm;

public class CalZonePizza extends Pizza {

	private final boolean sauceInside;

	class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false; // Default

		public Builder sauceInside() { // call to this method indicates the user wants to add sauce
			this.sauceInside = true;
			return this;
		}

		@Override
		protected Builder self() { return this; }

		@Override
		public CalZonePizza build() {
			return new CalZonePizza(this);

		}
		
	} // EO class Builder

	private CalZonePizza(Builder builder) { // constructor
		super(builder);
		sauceInside = builder.sauceInside;
	}

} // EO public class CalZonePizza extends Pizza
