
public abstract class Food {
		 
	    private String name;        // name of the item (ex: Apple, Orange, Chicken, ...)
	    private String measurement; // Unit of measurement (ex. kg)
	    private double price;       // Price per unit of measurement (ex. $1.50/kg)
	    private double stock;       // amount of item the store has in stock
	     
	    public Food(String name, String measurement, double price, double stock) {
	        this.name = name;
	        this.measurement = measurement;
	        this.price = price;
	        this.stock = stock;
	    }
	     
	    public String getName() {
	        return name;
	    }
	     
	    public double getPrice() {
	        return price;
	    }
	     
	    // Decrease the stock in a safe manner
	    // true = success, false = failure
	    public boolean decreaseStock(double amount) {
	        if(amount <= stock) {
	            stock -= amount;
	            return true;
	        }
	         
	        return false;
	    }
	     
	    public String toString() {
	        return name + ", " +
	               "$" + price + "/" + measurement + ", " +
	               stock + " " + measurement + " in stock";
	    }
	     
	}

