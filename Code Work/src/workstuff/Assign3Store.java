package workstuff;
import java.util.Scanner;
public class Assign3Store {
	
	public static void main(String[] args) {

		Scanner sW = new Scanner(System.in);
		Scanner sN = new Scanner(System.in);
		
		double secretDiscount = 0; //secret discount, will be updated if user inputs "-1" on product choice
		String[] Products = {"Apples","Bananas","Potatoes","Tomatoes","Kidz Bop 13: Deleted Songs","Bag of Sugar","Chef Boyardee's Lasagna","Ground Beef","Garlic Bread","Sharpener"}; //array of product choices
		double[] Prices = {2.50,3.00,4.99,3.78,15.50,18.79,19.00,12.29,5.00,6.50}; //prices of products
		int[] Quantities = {0,0,0,0,0,0,0,0,0,0}; //qty of products bought
		int shopLoop; //used to put product choice back up if user wants to buy more items
		
		do { //runs the code inside brackets as long as the while statement is not fulfilled
		for(int i = 0; i < Products.length; i++) { //lists all products w/ their prices
		System.out.println(i + ". " + Products[i] + " $" + Prices[i]);
		}//end for
		
		System.out.println("Please enter the number of the product you want to purchase."); //tells user to type in the number of the product they would like to buy
		int productChoice = sN.nextInt(); //user input updates productChoice
		if(productChoice == -1) { //unlocks secret discount
			secretDiscount = 0.10; //sets secret discount to 0.10
			System.out.println("Secret discount is now being used."); //tells user that the secret discount is now in effect for the products they buy
		}//end if
		
		if(productChoice != -1) { //if product choice is not -1 continue
		System.out.println("How many of the product: " + Products[productChoice] + ", would you like to buy?"); //asks user how much of the product they would like to buy
		int qty = sN.nextInt(); //user input updates qty
		Quantities[productChoice] = qty; //stores qty value inside the specified index of the quantities array
		}//end if
		
		System.out.println("Would you like to continue shopping? \n1 = Yes\n2 = No"); //asks user if they want to continue shopping
		shopLoop = sN.nextInt(); //user input updates shopLoop
		
		} while(shopLoop != 2); //while user continues to not input 2 (to exit shopping), it will run all the code inside the "do"
		for(int i = 0; i < Products.length; i++) { //bill shown after all user exits shop
			if(Quantities[i] > 0) { //if user bought more than 0 of the product continue
				double totalPrice = Prices[i] * Quantities[i]; //calculates sum of price
				if(secretDiscount == 0.10) { //if they used the secret discount continue
					double discount = totalPrice * secretDiscount; //multiples total price by discount
					totalPrice = totalPrice - discount; //updates price, subtracts price by discount value
				}//end if
				System.out.println("Product: " + Products[i] + " Price: $" + Prices[i] + " Num Bought: " + Quantities[i] + " Total: " + totalPrice); //displays bill
			}//end if 
		}//end for
		
	}//end main
	
/**  //OUTPUT
* 0. Apples $2.5
1. Bananas $3.0
2. Potatoes $4.99
3. Tomatoes $3.78
4. Kidz Bop 13: Deleted Songs $15.5
5. Bag of Sugar $18.79
6. Chef Boyardee's Lasagna $19.0
7. Ground Beef $12.29
8. Garlic Bread $5.0
9. Sharpener $6.5
Please enter the number of the product you want to purchase.
-1
Secret discount is now being used.
Would you like to continue shopping? 
1 = Yes
2 = No
1
0. Apples $2.5
1. Bananas $3.0
2. Potatoes $4.99
3. Tomatoes $3.78
4. Kidz Bop 13: Deleted Songs $15.5
5. Bag of Sugar $18.79
6. Chef Boyardee's Lasagna $19.0
7. Ground Beef $12.29
8. Garlic Bread $5.0
9. Sharpener $6.5
Please enter the number of the product you want to purchase.
8
How many of the product: Garlic Bread, would you like to buy?
10
Would you like to continue shopping? 
1 = Yes
2 = No
1
0. Apples $2.5
1. Bananas $3.0
2. Potatoes $4.99
3. Tomatoes $3.78
4. Kidz Bop 13: Deleted Songs $15.5
5. Bag of Sugar $18.79
6. Chef Boyardee's Lasagna $19.0
7. Ground Beef $12.29
8. Garlic Bread $5.0
9. Sharpener $6.5
Please enter the number of the product you want to purchase.
7
How many of the product: Ground Beef, would you like to buy?
1
Would you like to continue shopping? 
1 = Yes
2 = No
2
Product: Ground Beef Price: $12.29 Num Bought: 1 Total: 11.061
Product: Garlic Bread Price: $5.0 Num Bought: 10 Total: 45.0
 */
}