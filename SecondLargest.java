
public class SecondLargest{
    public static void main(String [] args){
        int  arr[]={2,66,4,8,555}; 
        int largest=arr[0];
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>secondLargest){
                secondLargest=arr[i];
            }
        }
        System.out.println("The second highest value is: "+secondLargest);
    }
}