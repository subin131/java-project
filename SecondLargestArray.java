import java.util.Arrays;
public class SecondLargestArray {
   public static void main(String args[]){
      int array[] = {10, 20, 25, 63, 6, 57};
      int size = array.length;
      Arrays.sort(array);
      System.out.println("sorted Array ::"+Arrays.toString(array));
      int res = array[size-2];
      System.out.println("2nd largest element is ::"+res);
   }
}