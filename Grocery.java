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
		
		System.out.println("Items available in Inventory: ");
		inventory.printInventory();
		
		System.out.println("Enter <item> <amount> to buy followed by ENTER"); 
		System.out.println("When you are done, type 'done' to finish."); 
		
		double totalPrice = 0; 
		double numofItems = 0; 
		
		int i =0; // array counter
		while(!(input = keyboard.nextLine()).equals("done")) {
			inputTokenizer = new StringTokenizer(input); 
			
			name = inputTokenizer.nextToken(); 
			amount = Double.parseDouble(inputTokenizer.nextToken()); 
			buy[i]=name+"        " + inventory.foodItems[i].getPrice()+"         " + amount;
			
			
			for(int j = 0; j <inventory.totalFoodItems; j++) {
				if(inventory.foodItems[j].getName().equals(name)) {
					inventory.foodItems[j].decreaseStock(amount);
					totalPrice += amount * inventory.foodItems[j].getPrice(); 
					break;
				}
				}
				numofItems++;
				i++;
			}
		System.out.println("Dear customer, your payment info is as follows: "); 
		System.out.println("------------------------------------------");
		double finalCost = totalPrice; 
		System.out.println("Your total payment is $" + (int)(finalCost * 100)/100.0); 
	
		
		//print results: 
		
        System.out.println("\nDo you want to proceed (y/n) ? ");
	Scanner input1 = new Scanner(System.in);
			String cInput = input1.next();
	char cClub = cInput.charAt(0);
	
	   if (cClub == 'y' || cClub == 'Y'){
	       
           System.out.println("\n");
           System.out.println("Updated Inventory:");
           System.out.println("-------------------");
           inventory.printInventory();
            
           System.out.println("\nPlease enter 'y' for a Receipt ? ");
           Scanner input2 = new Scanner(System.in);
           String dInput = input2.next();
           char dClub = dInput.charAt(0);  

           if (dClub == 'y' || dClub == 'Y'){
               System.out.println("\n\n");
               System.out.println("-----------------------------------------------");
               System.out.println("           		 Grocery Store\n");
               System.out.println("                   RECEIPT");
               System.out.println("                  ----------\n");
               System.out.println("Item        "+"Unit Price       "+"Amount");
               System.out.println("______________________________________________\n");
               for(int j = 0; j < numofItems; j++) {
                   System.out.println(buy[j].toString());
               }
               System.out.println("\nTotal number of items purchased : "+numofItems);
               System.out.println("\nThe subtotal is $ " + (int)(totalPrice * 100) / 100.0);
               System.out.println("\n               End of Receipt");
               System.out.println("\nThank you for shopping with  the  Grocery Store");
               System.out.println("             Please come back again");
               System.out.println("-------------------------------------------------");
           }
           input2.close();
        }
        else{
             
            System.out.println("Thank you and we wish to serve you better next time"); 
        }
        keyboard.close();
        input1.close();
        
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
