import java.util.Scanner;
public class CopyingArray{
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] firsta=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int i=0;i<num;i++){
            firsta[i]=sc.nextInt();
        }
        int [] seconda=new int[num]; 
        for(int i=0;i<firsta.length;i++){
        seconda[i]=firsta[i];
        System.out.println("The copy part of first array of index "+i+" is "+seconda[i]);
    }
}
}
