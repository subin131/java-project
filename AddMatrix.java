import java.util.Scanner;
public class AddMatrix{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of matrix:");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int [] [] a=new int[row][column];
        int [] [] b=new int[row][column];
        int [] [] c=new int[row][column];
        System.out.printf("Enter element:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.printf("array [%d][%d]:",i, j);
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter another matrix:");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.printf("array [%d][%d]:",i, j);
                b[i][j]=sc.nextInt();
                
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println("The sum of two matrix is: "+c[i][j]);
            }
        }
    }
}