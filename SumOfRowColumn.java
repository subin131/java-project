import java.util.Scanner;
public class SumOfRowColumn{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int [] [] arr=new int[m][n];
        System.out.printf("Enter the number");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("array [%d][%d]:",i, j);
                arr[i][j]=sc.nextInt();
            }
        }
        int sumRow=0;
        for(int i=0;i<m;i++){
            sumRow=0;
            for(int j=0;j<n;j++){
                sumRow+=arr[i][j];
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(sumRow+"  ");
        }
        int sumCol=0;
        int sum=0;
        for(int j=0;j<n;j++){
            sumCol=0;
            for(int i=0;i<m;i++){
                sumCol+=arr[i][j];
                sum+=sumCol;
            }
            System.out.print(sum+" ");
            
        }
    }
}