package Daily_Challenge_2024;
//You are given an array arr containing n-1 distinct integers taken from the range 1 to n, meaning one integer is missing from this sequence. Your task is to find the missing integer.
public class MissingNumber
{
    public static int findMissingNumber(int arr[]){
     for(int i=0;i<arr.length-1;i++){
         if(arr[i+1]-arr[i]>1){
             return arr[i]+1;
         }
     }
     return 0;
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5};
        System.out.println("The Missing Number is "+findMissingNumber(arr));
    }
}
