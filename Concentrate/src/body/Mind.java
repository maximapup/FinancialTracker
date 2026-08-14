package body;
import java.util.Scanner;

public class Mind {
	public static void main (String[] args) {
//Financial Tracker, start with Amount, Type, Category, Date, Description inputs, and output them to start, then upload to github.
	Scanner myObj = new Scanner(System.in);
	float amount = 0; //How much is the amount transacted?
	String type=""; //Is this income or expense?
	String category=""; //Groceries, Rent, Salary, etc.
	String date=""; //MM/DD/YYYY format is preferable
	String description=""; //A short note detailing what the expense/income is.
	
	System.out.println("How much is the amount transacted?");
	amount = myObj.nextFloat();
	System.out.println("Is this income or expense?");
	type = myObj.nextLine();
	type = myObj.nextLine(); //Redundancy due to nextFloat
	System.out.println("What type of category can this fit into?  (Groceries, Rent, Salary, etc.)");
	category = myObj.nextLine();
	System.out.println("What date did this transaction occur?  (MM/DD/YYYY format preferable)");
	date = myObj.nextLine();
	System.out.println("Describe what the transaction is.");
	description = myObj.nextLine();
	
	System.out.println(amount + ", " + type + ", " + category + ", " + date + "; " + description);
	}
}
