
public class App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Intro to Java week 1 coding assignment
		
				//Creating 2 variables and assigning values for question 3 of assignment 1
				
			double itemPrice = 11.99;//question 3a of the assignment
			double walletBalance = 21.23;//question 3b wallet balance
		   	
			//question 3 part c and d of assignment created 2 variables
			int numberOfFriends = 12; //part 3c. of assignment
			int age = 34;// part 3d. of assignment
				
			
			//question 3 parts e,f,g created variables
			String first = "Juan ";//part 3e. allows me to do multiple characters
			String last = " Hernandez";//part 3f.
			char middle = 'C';//part 3g. this gives me a single character
			
			//this is question 4 parts a,b,c
			double newWalletBalance = walletBalance - itemPrice;//4a this will give me the new balance after the purchase made
			int avgFriendsPerYear = age / numberOfFriends;// 4b this gives me the average of friends made 
			String fullName = first + middle + last;//question 4 c  using (concatenation)
			
			// this is question 5 to print every variable to the console that we have made using System.out.println()
			System.out.println("I bought an Item that was $"+ itemPrice + " and my wallet balance before the purchase was $"+ walletBalance + ".");// this will show item price and previous wallet balance
			System.out.println("My new wallet balance after the purchase is $" + (newWalletBalance) + ".");//this will give me new balance after the purchase of the item
			System.out.println();// this will space out my created balances to make it easier to read

			System.out.println("In my"+ " " + age + " " + "years of age I have made a total of" + " " + avgFriendsPerYear + " " + "friends each year.");// question 4b this will show number of friends 
			System.out.println();
			System.out.println("My full name is" + " " + fullName + ".");//4c this will print out my full name in the application
	}

}
