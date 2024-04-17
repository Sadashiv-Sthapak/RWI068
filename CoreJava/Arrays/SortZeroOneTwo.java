import java.util.*;
class SortZeroOneTwo
{
	public static void Sort012(int[]arr)
	{
		int left=0,right=arr.length-1;
		int temp;
		int current=0;
		while(current<=right){
			if(arr[current]==0){
				temp=arr[left];
				arr[left]=arr[current];
				arr[current]=temp;
				left++;
				current++;
			}else if(arr[current]==2){
				temp=arr[current];
				arr[current]=arr[right];
				arr[right]=temp;
				right--;
			}else{
				current++;
			}
		}
	}
	public static void main(String[]args)
	{
		int []arr={0,1,2,2,1,0};
		Sort012(arr);
		System.out.println(Arrays.toString(arr));
	}
}