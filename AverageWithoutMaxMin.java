public class AverageWithoutMaxMin{
public static void main(String[] args)
 {
    int[] arr = {9, 6, 26, 48, 98}; 
	int max = arr[0];
	int min = arr[0];
	float sum = arr[0];
	for(int i = 1; i < arr.length; i++)
	{
		sum  += arr[i];
		if(arr[i] > max)
			max = arr[i];
		else if(arr[i] < min)
			min = arr[i];
	}
	System.out.printf("The maximum value is %d and minimum value is %d.",max,min);
	System.out.println();
	float x = ((sum-max-min) / (arr.length - 2));
	System.out.printf("The average value of an array of integers except the largest and smallest values: %.2f",x);
	System.out.print("\n");	
  }
}
