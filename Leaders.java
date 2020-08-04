import java.util.Scanner;
public class Leaders{
    public static void main(String [] args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        System.out.printf("Enter %d numbers: ",num);
        for(int a=0;a<num;a++){
            arr[a]=sc.nextInt();
        }
        int size=arr.length;
        for (int i = 0; i < size; i++) 
        {
            int j;
            for (j = i + 1; j < size; j++) 
            {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size) 
                System.out.print(arr[i] + " " +"is the leaders.");
        }
    }
}
