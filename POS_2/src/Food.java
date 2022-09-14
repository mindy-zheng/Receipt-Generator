
public abstract class Food {
		 
	    private String name;        // name of the item
	    private String measurement; // Unit of measurement
	    private double price;       // Price per unit
	    private double stock;       // amount in stock
	     
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
	     
	    // if the amount needed is lower than stock num, 
	    // return true and decrease stock. if not, return false
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

