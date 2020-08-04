public class DiffOfMaxMin{
    public static void main(String []args){
        int[] arr=new int[]{5,66,8,9,3};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The difference between maximum and minimum value is "+(max-min));
    }
}