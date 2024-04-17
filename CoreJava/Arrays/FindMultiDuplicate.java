import java.util.*;
class FindMultiDuplicate{
	public static void findDup2(int[]arr){
		for(int i=0;i<arr.length;i++){
			int x=Math.abs(arr[i]);         //`Math.abs()` is a Java method that returns the absolute value of a numeric expression, effectively removing its sign.
			if(arr[x]>0){
				arr[x]=-arr[x];
			}
			else{
				System.out.println(x);
			}
		}
	}

public static void main(String[]args)
{
	int[]arr={4,3,2,7,5,2,3,1};
	findDup2(arr);
}
}

//Above Approach is not applied for '0'.
//---------------------------------------------

//Second approach for Zero


// import java.util.*;
// class FindMultiDuplicate{
	// public static void findDup3(int[]arr){
		// for(int i=0;i<arr.length;i++)
		// {
			// int x=arr[i]%arr.length;
			// arr[x]=arr[x]+arr.length;
		// }
		// boolean found=false;
		// for(int i=0;i<arr.length;i++){
			// if(arr[i]/arr.length>=2){
				// System.out.println(i);
				// found=true;
			// }
		// }
		// if(!found)
			// System.out.println("No Repeating Elements");
	// }
	// public static void main(String[]args)
	// {
		// int[]arr={4,3,2,1,0};
		// findDup3(arr);
	// }
// }