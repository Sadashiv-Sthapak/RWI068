import java.util.*;
class FindDuplicate{
	public static void findDup(int[]arr)
	{
		int i;
		Arrays.sort(arr);
		for(i=0;i<arr.length-1;i++){
			if(arr[i]==arr[i+1]){
				System.out.println(arr[i]);
				break;
			}
		}
	}
	public static void main(String[]args)
	{
		int[]arr={0,2,1,3,1};
		findDup(arr);
		System.out.println(Arrays.toString(arr));
	}
}