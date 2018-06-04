/* This is teh solution for maximun sum possible with contigous sub arry */
import java.util.*;
public class MaxContSumSubArrayCalculator
{
    public static void main(String[] args)
    {
        List<Integer> v = new ArrayList<Integer>();
        v.add(-2);
        v.add(-5);
        v.add(6);
        v.add(-2);
        v.add(-3);
        v.add(1);
        v.add(5);
        v.add(6);
        maxContSum(v);
    }
    
    static void maxContSum(List<Integer> v)
    {
    int maxSofar = v.get(0);	
	int cmax = v.get(0);	
	int cmax_start = 0;
	int cmax_end = 0;
	int max_start = 0;
	int max_end = 0;
	int len = v.size();
        
	if (len == 0)
	{
		System.out.println("input collection is empty");
	}
	if (len > 1)
	{
		for (int i = 1; i < v.size(); i++)
		{

			if (v.get(i) > (v.get(i) + cmax))
			{
				cmax_start = i;
				cmax_end = i;
				cmax = v.get(i);
			}
			else
			{
				cmax_end++;
				cmax = (v.get(i) + cmax);
			}
			if (cmax > maxSofar)
			{
				maxSofar = cmax;
				max_start = cmax_start;
				max_end = cmax_end ;
			}		
		}
	}

	System.out.println("max continous sum is "+ maxSofar);
	System.out.println("Starts at index at " + max_start + " and ends at index " + max_end);
    }
   
}