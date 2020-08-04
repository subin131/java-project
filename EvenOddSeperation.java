
public class EvenOddSeperation{
    public static void main(String [] args){
        int[] arr={50,7,6,8,4,31,1};
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2== 0) {
               arr[j++] = arr[i];
           }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] %2!= 0) {
               arr[j++] = arr[i];
           }
        }
        for(int k = 0; k < arr.length; k++) {
             System.out.print(arr[k] + " ");
         }
     }
}
        