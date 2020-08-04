import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int num=sc.nextInt();
        int [] arr=new int[num];
        System.out.printf("Enter %d  numbers:",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
            
        }
        int size=arr.length;
        for(int i=0;i<size/2;i++){
                int a=arr[i];
                arr[i]=arr[arr.length-i-1];
                arr[arr.length-i-1]=a;
        }
        System.out.println("Reverse value:"+Arrays.toString(arr));
    }
}
        