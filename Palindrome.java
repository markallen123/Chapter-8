

/**
 * Write a description of class Palindrome here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindrome
{
    private int count = 0;
    public Palindrome(String word)
    {
        method(word);
        count = 0;
    }
    
    public void method(String a)
    {
        if ((a.length()-1) <= 0)
        {
            System.out.println("Done");
        }
        else
        {
            return;
        }
        
    }

}
