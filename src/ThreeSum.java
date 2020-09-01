import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum 
{	
	public static List<List<Integer>> threeSum(int[] n) 
	{
		ArrayList<List<Integer>> result = new ArrayList<>();
		
		if (n == null || n.length == 0) return result;
		
		Arrays.sort(n);
	 
	    for (int i = 0; i < n.length && n[i] < 0; i++) 
	    {
	        int j = i + 1;
	        int k = n.length - 1;
	 
	        if (i > 0 && n[i] == n[i - 1]) 
	        {
	            continue;
	        }
	 
	        while (j < k) 
	        {
	            if (n[i] + n[j] + n[k] == 0)
				{
	            	 result.add(new ArrayList<>(Arrays.asList(n[i], n[j], n[k])));
	            	 j++;
	            	 k--;
				}
				else if (n[i] + n[j] + n[k] < 0)
				{
					++j;
				}
				else
				{
					--k;
				}
	        }
	    }
	 
	    return result;
	}
	
	private static int findThreeSum(int[] n)
	{
		int count = 0;
		
		if (n == null || n.length == 0) return count;
		
		Arrays.sort(n);
		
		for(int i = 0; i < n.length && n[i] < 0; i++)
		{
			if (i > 0 && n[i] == n[i - 1]) continue;
			
			int j = i + 1;
			int k = n.length - 1;
			
			while (j < k)
			{
				if (n[i] + n[j] + n[k] == 0)
				{
					++count;
					++j;
					--k;
				}
				else if (n[i] + n[j] + n[k] < 0)
				{
					++j;
				}
				else
				{
					--k;
				}
			}
		}
		
		return count;
	}

	public static void main(String[] args) 
	{
		int[] n = new int[] {-1, 0, 1, 2, -1, -4, 2};
		
		System.out.println(findThreeSum(n));
		System.out.println(threeSum(n));
	}
}
