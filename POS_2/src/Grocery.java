import java.util.Scanner;
import java.util.StringTokenizer;

public class Grocery {		
		public static final int maxFoodItems = 10; // max num of food items 
		public static final int boughtItems = 10; 
		static String name; 
		static double amount; 
		
		//arrays to keep track of store's inventory
		private static Food[] foodItems = new Food[maxFoodItems]; // created an obj of array for Food items 
		private static String[] buy = new String[boughtItems];
		private static int totalFoodItems = 0; 
		
		
		public static void main(String[] args) {
			
			//accepts input 
			Scanner keyboard = new Scanner(System.in); 
			String input; 
			StringTokenizer inputTokenizer;
			
		Grocery inventory = new Grocery(); 
		
		inventory.addFoodItem(new Fruit("apple", "lb", 1.50, 2.00));
		inventory.addFoodItem(new Fruit("bannana", "lb", .89, 1.25));
		inventory.addFoodItem(new Fruit("Orange", "lb", 1.00, 1.20));
		inventory.addFoodItem(new Meat("Chicken", "lb", 5.50, 3.00));
		inventory.addFoodItem(new Meat("Beef", "lb", 4.50, 2.00));
		
		inventory.printInventory();
	}
		
		public boolean addFoodItem(Food f) {
			if (totalFoodItems >= maxFoodItems) {
				return false; 
			}
			foodItems[totalFoodItems] = f; 
			totalFoodItems++; 
			return true;
		}
		
		public void printInventory() { 
			for(int i=0; i<totalFoodItems; i++) {
				System.out.println(foodItems[i].toString()); 
				
			}
		}

}
