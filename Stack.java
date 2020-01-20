import java.lang.Exception;
    
    
/**
 * A class which implements a stack using an array.
 * Uses custom exception handling.
 * 
 * @author Computing Team
 * @version 1.0
 */
public class Stack
{
	private ListNode top; // used to hold a reference to an instance of a ListNode object
    // which will be the first item in the list, i.e. at the 'top'
    // of the list

    /**
     * Default constructor. Initialise fields to default values.
     */
    public Stack()
    {
        // set the list to be empty, i.e. not referring to anything valid yet
        top = null;
    }
    
    

    /**
     * Get the list node which is at the 'top' of the list
     * 
     * @return A reference to a ListNode object which represents the node at the
     *         top of the list (or null if the list is empty, i.e. no 'top' has
     *         been set yet).    
     */
    public ListNode getTop()
    {
        return top;
    }

    /**
     * Set the 'top' of the list to the given node
     * 
     * @param  newTop A reference to a ListNode object which will be
     *                 the top of the list. 
     *                 
     * NOTE: if a list already exists, the existing listing will be 
     * lost since the head is being assigned to something new.
     */
    public void setTop(ListNode newTop)
    {
        top = newTop;
    }

    /**
     * Add a new node to the start of the list which will contain
     * the data provided.
     * 
     * @param data The number in the equation 
     */
    public void push(int data)
    {

        ListNode newNode; //creates local ListNode object
        newNode = new ListNode(data); //uses constructor to set data to variables
        newNode.setNext(top); //calls setNext method that sets next to head
        top = newNode; //changes head to new ListNode
    }
    
    /**
     * deletes top value from stack and returns the value of it
     * @return the int of the top value being deleted
     */
    public int pop()
    {
    	ListNode nodeToDelete = top;
    	int popped = 0;

        if (isStackEmpty())
        {
            top = nodeToDelete.getNext();
            popped = nodeToDelete.getData();
        }
        else
        {
        	System.out.println("Error: stack is empty");
            System.exit(0);
        }
            
        
        
        return popped;
    }
    
    /**
     * Prints out final result after calculation
     */
    public void getResult()
    {
    	System.out.println();
    	ListNode marker;
    	marker = getTop();
    	    	
    	int result = marker.getData();
    	marker.getNext();
    	if(marker==null)
    	{
    		System.out.println("Incorrect format - multiple operands left");
    	}
    	else
    	{
    		System.out.println("Result = " + result);
    	}
    }

   
    /**
     * calculates whether stack has any values or not
     * @return true or false depending if stack is empty
     */
    public boolean isStackEmpty()
    {
    	if (top==null)
    	{
    		return false;
    	}
    	else
    	{
    		return true;
    	}
    }
    
    

}
