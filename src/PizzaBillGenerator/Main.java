package PizzaBillGenerator;

public class Main {

	public static void main(String[] args) {
		
		Pizza p = new Pizza(false);
		p.addExtraToppings();
		p.addExtraCheese();
		p.takeAway();
		p.getBill();
		
		DeluxPizza dp = new DeluxPizza(true);
		dp.addExtraCheese();
		dp.addExtraToppings();
		// for Delux pizza we make add ons method empty//
		
		dp.takeAway();
		dp.getBill();

	}

}
