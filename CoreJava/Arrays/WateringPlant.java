class WateringPlant{
	public static int wateringPlant(int []plants, int capacity){
		int can=capacity;
		int i=0;
		int noOfSteps=0;
		while(i<plants.length)
		{
			if(can>=plants[i]){
				can=can-plants[i];
				++noOfSteps;
				++i;
			}
			else{
				can=capacity;
				noOfSteps=noOfSteps+i*2;
			}
		}
		return noOfSteps;
	}
	public static void main(String[]args)
	{
		int []plants={2,2,3,3};
		System.out.println(wateringPlant(plants,5));
	}
}