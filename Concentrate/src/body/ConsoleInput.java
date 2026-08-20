package body;
import java.util.Scanner;

public class ConsoleInput {
	Scanner myObj = new Scanner(System.in);
	private float amount = 0; //How much is the amount transacted?
	private String type = ""; //Is this income or expense?
	private String category = ""; //Groceries, Rent, Salary, etc.
	private String date = ""; //MM/DD/YYYY format is preferable.
	private String description = ""; //A short note detailing what the expense/income is.
	private String saveline = ""; //Line to combine amount, type, category, date, and description into one uniform string.
	public String inputStringInfo() {
		System.out.println("How much is the amount transacted?");
		this.amount = myObj.nextFloat();
		System.out.println("Is this income or expense?");
		this.type = myObj.nextLine();
		this.type = myObj.nextLine(); //Redundancy due to nextFloat
		System.out.println("What type of category can this fit into?  (Groceries, Rent, Salary, etc.)");
		this.category = myObj.nextLine();
		System.out.println("What date did this transaction occur?  (MM/DD/YYYY format preferable)");
		this.date = myObj.nextLine();
		System.out.println("Describe what the transaction is.");
		this.description = myObj.nextLine();
		myObj.close();
		this.saveline = amount + ", " + type + ", " + category + ", " + date + "; " + description;
		System.out.println(saveline);  //For testing purposes
		return saveline;
	}
	
}
