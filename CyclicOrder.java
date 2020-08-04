public class CyclicOrder{
    public static void main(String [] args){
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
      int n = arr.length;
      int last, i=0;
      System.out.print("The original array is: ");
      for (i = 0; i < n; ++i){
      System.out.print(arr[i] + " ");
    }
      last = arr[n-1];
      for (i = n-1; i > 0; i--){
      arr[i] = arr[i-1];
      
    }
    System.out.print("\nThe rotated Array is: ");
    arr[0] = last;
      for (i = 0; i < n; ++i){
      System.out.print(arr[i]+" ");
    }
}
}
   
