import java.util.Scanner;
public class ArraySumAverage{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        double sum=0,average=0;
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
             sum+=arr[i];
             average=sum/num;
        }
        System.out.printf("The sum of the numbers are %f and average is %f",sum,average);
    }
}