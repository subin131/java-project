import java.util.Scanner;
public class TransposeAMatrix{
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
        int transpose[][]=new int [n][m];
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=arr[i][j];
            }
        }
        System.out.println("Transpose of the given matrix is:  ");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
            