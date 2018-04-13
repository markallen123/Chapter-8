

/**
 * Write a description of class money here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class money
{
    int hun = 0, twe = 0, fiv = 0, one = 0, total;
    
    public money(int value)
    {
        total = value;
        method(total);
    }
    
    public void method(int t)
    {
        if (t >= 100)
        {
            hun += 1;
            total -= 100;
            method(total);
        }
        else if (t >= 20)
        {
            twe += 1;
            total -= 20;
            method(total);
        }
        else if (t >= 5)
        {
            fiv += 1;
            total -= 5;
            method(total);
        }
        else if (t >= 1)
        {
            one += 1;
            total -= 1;
            method(total);
        }
        else 
            return;
    }
    
    public String toString()
    {
        String result = "Hundreds: "+hun+"\tTwenties: "+twe+"\tFives: "+fiv+"\tOnes: "+one;
        return result;
    }

}
