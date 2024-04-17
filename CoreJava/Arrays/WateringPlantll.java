class WateringPlantII{
	public static int minimunRefill(int[] plants,int capacityA, int capacityB){
		int i=0; int j=plants.length-1;
		int canA=capacityA, canB=capacityB;
		int refillA=0; int refillB=0;
		while(i<j){
			if(canA<plants[i]){
				refillA++;
				canA=capacityA;
			}
			if(canB<plants[j]){
				refillB++;
				canB=capacityB;
			}
			canA=canA-plants[i];
			canB=canB-plants[j];
			i++;
			j--;
		}
		if(i==j){
			if(canA<plants[i]&&canB<plants[j])
				refillA++;
		}
		return refillA+refillB;
	}
	public static void main(String[]args){
		int[]plants={5};
		System.out.println(minimunRefill(plants,10,8));
	}
}


//Case1- plants=[2,2,3,3], capacityA=5, capacityB=5 / output=1.
//Case2- plants=[2,2,3,3], capacityA=3, capacityB=4 / output=2.
//Case3- plants=[5], capacityA=10, capacityB=8 / output=0.