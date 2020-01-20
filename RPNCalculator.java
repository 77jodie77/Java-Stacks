
public class RPNCalculator {

	
	/**
     * Constructor for objects of class RPNCalculator
     */
    public RPNCalculator()
    {
    	
    }
	
    /**
     * uses a condition to either add numbers to stack or runs pop methods and uses the operator to calculate new number to add to the string
     * @param splitString the array of strings which is the equation
     */
    public void calculateEquation(String[] splitString)
    {
    	Stack myStack = new Stack();
        int operand;
		int num1 = 0;
		int num2 = 0;
    	
    	
    	for(int i=0;i<splitString.length; i++)
        {
            if (splitString[i].equals("+"))
            {
                
                num1 = myStack.pop();
                num2 = myStack.pop();
                
                int newNum = num1 + num2;
                myStack.push(newNum);
                
                
            }
            else if (splitString[i].equals("-"))
            {
                num1 = myStack.pop();
                num2 = myStack.pop();
                int newNum = num2 - num1;
                myStack.push(newNum);
            }
            else if (splitString[i].equals("*"))
            {
                num1 = myStack.pop();
                num2 = myStack.pop();
                int newNum = num2 * num1;
                myStack.push(newNum);
            }
            else if (splitString[i].equals("/"))
            {
                num1 = myStack.pop();
                num2 = myStack.pop();
                int newNum = num2 / num1;
                newNum = (int)newNum;
                myStack.push(newNum);
            }
            else
            {
                operand = Integer.parseInt(splitString[i]);
                
                myStack.push(operand);  
               
                
            }
        }
    	
    	 myStack.getResult();
    }
	
    
    	
    	
    	
    	
}
