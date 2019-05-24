import java.util.*;

public class UserMainCode {
    
    public static Integer addOdd(ArrayList<Integer> numbers) {
    	Integer sum=0;
    	for(Integer i:numbers)
    	{
    		if(i%2!=0)
    		{
    			sum=sum+i;
    		}
    			
    	}
		return sum;
//fill code here
    }
    
}
