package pizza;

public class Pizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 50;
    private int extraToppingPrice = 100;
    private int takeAwayPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingAdded = false;
    private boolean isTakeAway = false;
    private String bill = "";

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg){
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
        this.isExtraCheeseAdded = true;
    }

    public void addExtraToppings(){
        System.out.println("Extra toppings added");
        this.price += extraToppingPrice;
        this.isExtraToppingAdded = true;
    }

    public void takeAway(){
        System.out.println("Take away");
        this.price += takeAwayPrice;
        this.isTakeAway = true;
    }

    public void getBill(){
        System.out.println("\nPizza: " + basePizzaPrice);
        if (this.isExtraCheeseAdded){
            bill += "Cheese added: " + this.extraCheesePrice;
        } if (this.isExtraToppingAdded){
            bill += "\nToppings added: " + this.extraToppingPrice;
        } if (this.isTakeAway){
            bill += "\nTake away: " + this.takeAwayPrice;
        }
        bill += "\nTotal price: " + this.price;
        System.out.println(bill);

    }
}
