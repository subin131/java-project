import java.util.Scanner;
public class AscendingArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array:");
        int num=sc.nextInt();
        int [] arr=new int[num];
        System.out.printf("Enter %d  numbers:",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before sorting");
        int size=arr.length;
        for(int n:arr){
            System.out.print(n+" ");
        }
        for (int i=0;i<size;i++){
            for(int j=0;j<size-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            System.out.println("\nArray after Sorting "+(i+1));
            for(int n:arr){
                System.out.print(n+" ");
            }
        }
        
    }
}