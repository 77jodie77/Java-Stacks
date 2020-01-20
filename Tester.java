import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

/**
 * 
 */

/**
 * @author jodielaurenson
 *
 */
public class Tester {
	private String testData = "5,6,4,+,-,3,*";
	/**
	 * constructor for tester class
	 */
	public Tester() {
		String [] splitString;
	}

	/**
	 * main method that opens menu
	 * @param args contains main arguments 
	 * @throws StackOverflowException exception handler that checks if stacks empty
	 */
	public static void main(String[] args) throws StackOverflowException {
		
		Menu myMenu = new Menu();
		try {
			myMenu.mainMenu();
		} catch (EmptyStackException e) {
			
			e.printStackTrace();
		}

	}
	
	/**
	 * Used to run automated tests to check if push/pop methods work
	 * @throws StackOverflowException exception handler if stack is full
	 */
	public void initialise() throws StackOverflowException
	{

		
		Tester parser = new Tester();
        String[] splitString = null;
        String deliminator = ",";
		try {
			splitString = parser.runSplit(testData,deliminator);
			System.out.println("Tests passed");
		} catch (EmptyStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

    /**
     *Use String.split to parse the test data
     * @throws StackOverflowException exception handler if stack is full
     * @throws EmptyStackException exception handler if stack is empty
     */
    public String[] runSplit(String testData, String deliminator) throws StackOverflowException, EmptyStackException
    {
    	String[] splitString = null;
    	RPNCalculator myCalc = new RPNCalculator();
    	try {
    		 splitString = testData.split(deliminator);
    	} catch(PatternSyntaxException e) {
    		System.out.println("Error: Wrong deliminator entered");
    		System.out.println("Error: " + e);
    	}
       
        
		myCalc.calculateEquation(splitString);
        
        return splitString;
    }  

}



