import java.util.Scanner;
public class ArrayPrint{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The number you have entered is: ");
        for(int i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
}