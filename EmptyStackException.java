/**
 * Example class to demonstrate creating your own exception handling class.
 */
public class EmptyStackException extends Exception
{

    public EmptyStackException()
    {
       System.out.println("Pop attempt on empty stack");
     
    }


}
