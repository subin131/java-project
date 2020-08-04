import java.util.Scanner;
public class MatrixPrint2D{
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
        System.out.println("\n array Elements are:");
        int sum=0;
        for(int i=0;i<m;i++){
            sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[i][j];
            }
            System.out.println("The sum is: "+sum);
        }
    }
}