package PizzaBillGenerator;

public class Pizza {
	private int price;
	private Boolean veg;
	private int extraCheesePrice =100;
	private int extraToppingsPrice =150;
	private int backPackPrice =20;
	
	private int basePizzaPrice;
	
	
	private boolean isExtraCheeseAdded = false;
	private boolean isExtraToppingsAdded = false;
	private boolean isOptedTakeAway = false;
	
	
	//constructor//
	
	//1 veg or non veg//
	public Pizza(Boolean veg) {
		this.veg =veg;
		if(this.veg) {
			this.price =300;
		}
		else {
			this.price =400;
		}
		basePizzaPrice = this.price;
	}
	
	
	//2---extra cheese//
	public void addExtraCheese() {
		isExtraCheeseAdded=true;
//		System.out.println("extra cheese added.");
		this.price += extraCheesePrice;
	}
	
	//3 -- extra toppings//
	public void addExtraToppings() {
		isExtraToppingsAdded=true;
//		System.out.println("extra toppings added.");
		this.price += extraToppingsPrice;
	}
	
	//4-- take Away//
	
	public void takeAway() {
		isOptedTakeAway=true;
//		System.out.println("Take away opted.");
		this.price += backPackPrice;
	}
	
	//Making bill//
	
	public void getBill() {
		String bill = " ";
		
		System.out.println("Base Pizza price is Rs." + basePizzaPrice );
		
		if(isExtraCheeseAdded) {
			bill += "Extra cheese added Rs." + extraCheesePrice +"\n";
		}
		if(isExtraToppingsAdded) {
			bill += "Extra toppings added Rs." + extraToppingsPrice +"\n";
		}
		if(isOptedTakeAway) {
			bill += "Take Away Rs." + backPackPrice +"\n";
		}
		bill += "Total Bill is Rs." + this.price + "\n";
		System.out.println(bill);
	}

	
}
