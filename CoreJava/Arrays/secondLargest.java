import java.util.Arrays;
class SecondLargest
{
	public static int findSecondLargest(int[]arr)
	{
		Arrays.sort(arr);
		for(int i=arr.length-1;i>0;i--)
		{
			if(arr[i]!=arr[i-1])
			{
				return arr[i-1];
			}
		}
		return Integer.MIN_VALUE;
	}
	public static void main(String[]args)
	{
		int[] arr={2,13,4,1,3,28};
		System.out.println(findSecondLargest(arr));
	}
}

//complexity O(n log n) 



// ______________________________________
//second approch 
//_______________________________________

// import java.util.*;
// class SecondLargest
// {
	// public static int findSecondLargest(int[]arr)
	// {
		// int max,secMax;
		// max=secMax=Integer.MIN_VALUE;
		// for(int x:arr)
		// {
			// if(x>max)
			// {
				// secMax=max;
				// max=x;
			// }else{
				// if(x>secMax && x!=max)
				// {
					// secMax=x;
				// }
			// }
		// }
		// return secMax;
	// }
	// public static void main(String[]args)
	// {
		// int[] arr={2,13,4,1,3,28};
		// System.out.println(findSecondLargest(arr));
	// }
// }

//complexity  O(n)