import java.util.Scanner;
public class EqualityTest{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arrayOne=new int[num];
        int[] arrayTwo=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
           arrayOne[i]=sc.nextInt();
           arrayTwo[i]=sc.nextInt();
        }
        boolean equalOrNot=false;
        if(arrayOne.length==arrayTwo.length){
            for(int i=0;i<arrayOne.length;i++){
                if(arrayOne[i]!=arrayTwo[i]){
                    equalOrNot=true;
                }
            }
        }
        else{
            equalOrNot=false;
        }
        if(equalOrNot){
            System.out.println("two array are equal");
        }
        else{
            System.out.println("two array arenot equal");
        }
    }
}
        