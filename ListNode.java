

/**
 * AC12001 Lab 1 Starting files
 * 
 * @author Jodie Laurenson
 * @version v1.0
 */
public class ListNode    
{
    // fields to store the data being held in this list node)
    private int data;
    private ListNode next;
  

    /**
     * Default constructor. Initialise fields to default values
     */
    public ListNode()
    {
        // set id and mark to default / empty values 
        data = 0;
        
        next = null;
        
    }

    /**
     * Alternative constructor. Set fields to given values.
     *
     * @param data numbers used in equation
     */
    public ListNode(int data)
    {
        // set id and mark to values provided
        this.data = data;

        next = null;
       
    }


    /**
     * Get the data contained in this list node
     * 
     * @return The data
     */
    public int getData()
    {
        return data;
    }

    /**
     * Get the next node in the list after this one
     * 
     * @return A reference to the next node (or null if
     *         there is no next node)
     */
    public ListNode getNext()
    {
       return next;
    }

    /**
     * Set the next node in the list after this one
     * 
     * @param next A reference to a ListNode object which 
     *             represents the next node in the list after
     *             this one.
     */
    public void setNext(ListNode node)
    {
    	next = node;
    }

    
}
