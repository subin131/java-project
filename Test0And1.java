import java.util.Scanner;
public class Test0And1{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        boolean checkZero=false,checkOne=false;
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            if(arr[i]==0){
                checkZero=true;
            }
            else if(arr[i]==-1){
                checkOne=true;
            }
        }
        if(checkZero==true &&checkOne==true){
            System.out.println("array contain 0 & -1.");
        }
        else{
            System.out.println("array dosen't contain 0 & -1.");
        }
    }
}
