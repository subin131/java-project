import java.util.Scanner;
public class PairOfSum{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int a=0;a<num;a++){
            arr[a]=sc.nextInt();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==arr[a]){
                    System.out.println(arr[i]+"+"+arr[j]+ " ="+arr[a]);
                }
            }
        }
    }
}
}