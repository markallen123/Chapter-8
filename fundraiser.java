

/**
 * Write a description of class fundraiser here.
 * 
 * @author (Mark Allen)  
 * @version (a version number or a date)
 */
public class fundraiser
{
    private int number;
    private int money;
    
    public fundraiser(int num)
    {
        number = 0;
        money = num;
        fund(money);
    }
    
    public void fund(int money)
    {
        if (money <=1)
        {
            number += 1;
            return;
        }
        
        else
        {
            //System.out.println(number)
            for (int i = 0; i < 10; i++)
            {    
                System.out.println(money);
                fund(money/10);
            }
        }
    }

}
