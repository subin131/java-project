import java.util.Scanner;
public class TwoSpecifiedNum{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        boolean checkOne=false,checkTwo=false;
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<num;i++){
            if(arr[i]==65){
                checkOne=true;
            }
            else if(arr[i]==77){
                checkTwo=true;
            }
        }
        if(checkOne==true &&checkTwo==true){
            System.out.println("array contain 65 & 77.");
        }
        else{
            System.out.println("array dosen't contain 65 & 77.");
        }
    }
}
