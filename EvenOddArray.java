import java.util.Scanner;
public class EvenOddArray{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
           arr[i]=sc.nextInt();
        
        int count=0;
        if(arr[i]%2==0){
            System.out.println(arr[i]+":Even Number");
        }
        else {
            System.out.println(arr[i]+":Odd Number");
        }
    }
}
}