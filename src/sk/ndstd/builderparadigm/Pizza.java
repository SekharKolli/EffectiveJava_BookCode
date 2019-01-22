/*
 * Purpose : To build objects and methods using method chaining. This is an example from "Effective Java" book Pg 34 to 36 This class will be extended
 * by other classes
 *
 * Date: 05-January-2019
 */

package sk.ndstd.builderparadigm;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {
	public enum Topping {
		HAM, MUSHROOM, ONION, PEPPER, SAUSAGE, PINEAPPLE
	};

	final Set<Topping> toppings;

	abstract static class Builder<T extends Builder<T>> {
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		public T addTopping(Topping topping) {
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}

		/**
		 * Subclasses have to override this method and return "this"
		 * 
		 * @return this
		 */
		protected abstract T self();

		abstract Pizza build();

	} // EO Builder - abstract static class

	Pizza(Builder<?> builder) { // FIX THIS : Learn about generics and '<>' and '<?>'
		toppings = builder.toppings.clone();
	}

} // abstract class Pizza
