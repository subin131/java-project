import java.util.Scanner;
public class IndexOfArray{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the position of index: ");
        int x=sc.nextInt();
        System.out.println("In this index position it present "+arr[x]);
    }
}