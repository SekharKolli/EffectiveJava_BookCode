/* 
 * Purpose : class to run the pizza classes developed
 * 
 *  * Depends on the abstract class pizza.java in this package
*
* Date: 05-January-2019
*/


package sk.ndstd.builderparadigm;

import sk.ndstd.builderparadigm.Pizza.Topping;

public class MainClass {

	public static void main(String[] args) {
		
		NewYorkPizza NYpizza = new NewYorkPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
		CalZonePizza calzone = new CalZonePizza.Builder().addTopping(PINEAPPLE).addTopping(HAM).build();

	}

}
