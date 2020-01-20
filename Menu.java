import java.util.Scanner;

public class Menu {

	/**
	 * 
	 */
	public Menu() {
		
	}

	

	/**
	 * Displays menu choices
	 */
	public void displayMenu()
	{
	System.out.println();
			System.out.println("Please select one of the options below");
			System.out.println("1. Instructions");
			System.out.println("2. Use calculator");
			System.out.println("3. Run automated tests");
			System.out.println("0. Exit");
	System.out.println();	
	}
	
	/**
	 * one of the menu choices that displays the instructions
	 */
	public void displayInstructions()
	{
		System.out.println();
		System.out.println("INSTRUCTIONS");
		System.out.println();
		System.out.println( "To use the reverse polish notation calculator you need to enter a series of numbers and operands and the result will be calculated.");
		System.out.println("Every number will be added to a list and when an operand (e.g. ‘+’) is entered the last two numbers will be taken out and a new number");
		System.out.println("will be calculated using the operand and the new number will then be added to the list. (e.g. 5 , 6 + will equal 11 and 4 , 3 , * , 6 , - will equal 6).");
		
	}

	/**
	 * Gives user a choice to use calculator, display instructions etc
	 * @throws EmptyStackException exception handler if stack is empty
	 * @throws StackOverflowException exception handler if stack is full
	 */
	public void mainMenu() throws EmptyStackException, StackOverflowException
	{
		System.out.println("Welcome to the Reverse Polish Notation Calculator");
		
		boolean exit = false;
		
		
		do
		{
			Tester myTester = new Tester();
			Menu myMenu = new Menu();
			myMenu.displayMenu();
			int choice=0;
			try {
				Scanner s1 = new Scanner(System.in);
				System.out.println("Please enter a number: ");
				choice = s1.nextInt();
			
			
				System.out.println();
				if (choice == 1)
				{
					myMenu.displayInstructions();
					
				}
				else if (choice==2)
				{
					Scanner s2 = new Scanner(System.in);
					System.out.println("Enter equation (Use deliminating character to separate operands and operators): ");
					String testData = s2.nextLine();
					System.out.println();
					System.out.println("Enter the deliminating character (e.g. ','): ");
					String deliminator = s2.nextLine();
					try {
						myTester.runSplit(testData,deliminator);
					} catch (StackOverflowException e) {
						e.printStackTrace();
					}
				}
				else if (choice == 3)
				{
					Tester testStack = new Tester();
					testStack.initialise();
				}
				else if (choice == 0)
				{
					System.out.println("Closing");
					exit = true;
				}
				else 
				{
					System.out.println("Invalid - please try again");
				}
			}
				catch (NumberFormatException e) {
					System.out.println("wrong format - must be int");
					System.out.println("Error: e");
				}
			}
			while (exit == false); //part of the do while loop
		}

		
}
