import java.util.Scanner;
public class RemoveDuplicate{
    public static void main(String [] args){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num=sc.nextInt();
        int[] arr=new int[num];
        int[] newArr=new int[arr.length];
        System.out.printf("Enter %d numbers: ",num);
        for(int a=0;a<num;a++){
            arr[a]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int no_unique_elements=arr.length;
        int size=0;
        for(int i=0;i<arr.length;i++){
            boolean copy=true;
            for(int j=0;j<size;j++){
                if(arr[i]==newArr[j]){
                copy=false;
                break;
            }
            }
             if(copy==true){
            newArr[size]=arr[i];
            size++;
            }
        }
        int[]array1=new int[size];
        for(int i=0;i<size;i++){
            array1[i]=newArr[i];
        }
        System.out.println();
        System.out.println("Array with unique values: ");
        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        }
    }
        