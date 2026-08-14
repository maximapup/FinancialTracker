package body;
import java.util.Scanner;
import java.io.*;

public class Mind {
	public static void main (String[] args) {
		//Financial Tracker, start with Amount, Type, Category, Date, Description inputs, and output them to start, then upload to github.
		//Save these inputs to a separate file to be used for later, then output all lines within the folder.
		Scanner myObj = new Scanner(System.in);
		float amount = 0; //How much is the amount transacted?
		String type = ""; //Is this income or expense?
		String category = ""; //Groceries, Rent, Salary, etc.
		String date = ""; //MM/DD/YYYY format is preferable.
		String description = ""; //A short note detailing what the expense/income is.
		String saveline = ""; //Line to combine amount, type, category, date, and description into one uniform string.
		
		String savefile = "transactions.txt"; //Text file name for saving and loading data
	
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
	
		saveline = amount + ", " + type + ", " + category + ", " + date + "; " + description;
		System.out.println(saveline);
		
		try (PrintWriter writer = new PrintWriter(new FileWriter(savefile))) {
			writer.println(saveline);
		} catch (IOException e) {
			System.err.println("Error writing to file: " + e.getMessage());
		}
		
		try (BufferedReader reader = new BufferedReader(new FileReader(savefile))) {
			String loadline = reader.readLine();
			System.out.println(loadline);
		} catch (IOException e) {
			System.err.println("Error writing from file:" + e.getMessage());
		}
	}
}
