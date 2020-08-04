
public class SmallAndSecondSmall{
    public static void main(String [] args){
        int  arr[]={22,66,4,8,555}; 
        int small=arr[0];
        int secondSmall=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<small){
                secondSmall=small;
                small=arr[i];
            }
            else if(arr[i]<secondSmall){
                secondSmall=arr[i];
            }
        }
        System.out.printf("The lowest is %d and second lowest value is %d. ",small,secondSmall);
    }
}