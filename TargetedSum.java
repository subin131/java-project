import java.util.Scanner;
public class TargetedSum{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum value:");
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    System.out.println(arr[i]+"+"+arr[j]+ " ="+x);
                }
            }
        }
    }
}
