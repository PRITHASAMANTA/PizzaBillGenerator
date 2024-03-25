package PizzaBillGenerator;

public class DeluxPizza  extends Pizza{
	public DeluxPizza(Boolean veg) {
		super(veg);
		
		super.addExtraCheese();
		super.addExtraToppings();
		
	}

	//disable extra cheese and topings method here//
	//override//
	public void addExtraCheese() {
		
	}

public void addExtraToppings() {
		
	}
	
}
