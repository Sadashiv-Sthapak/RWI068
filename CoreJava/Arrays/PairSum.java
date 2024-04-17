class PairSum
{
	//PairSum utilizes nested loops, which takes more time to execute.
	public static int pairSum(int[]arr,int target)
	{
		int count=0;
		int sum;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				sum=arr[i]+arr[j];
				if(sum==target)
				{
					++count;
				}
			}
		}
		return count;
	}
	//This approach is efficient, taking less time to execute and requiring fewer iterations.
	public static int betterPairSum(int[]arr,int target)
	{
		int count=0;
		int sum;
		int start=0,end=arr.length-1;
		while(start<end)
		{
			sum=arr[start]+arr[end];
			if(sum==target)
			{
				++count;
				start++;
				end--;
			}
			else if(sum>target){
				end--;
			}
			else{
				start++;
			}
		}
		return count;
	}
	public static void main(String []args)
	{
		int []arr={1,2,3,4,5};
		System.out.println(pairSum(arr,10));
		System.out.println(betterPairSum(arr,10));
	}
}