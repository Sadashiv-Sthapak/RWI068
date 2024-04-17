class AlternateSwap
{
	public static void swapAlternate(int[]arr)
	{
		int temp;
		for(int i=0;i<arr.length-1;i+=2)
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	public static void main(String []args)
	{
		int[]arr={9,3,6,12,4,32,11};
		System.out.println("Before swapping");
		for(int x:arr)
		{
			System.out.println(x);
		}
		swapAlternate(arr);
		System.out.println("After Swapping");
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
}

//complexity  O(n)