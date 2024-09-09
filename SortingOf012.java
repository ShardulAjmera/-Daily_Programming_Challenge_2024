// Sorting of array contains 0,1 and 2  using Dutch National Flag Algorithm where time complexity is linear

class SortingOf012{
    public static void main(String args[]){
        int arr[]={0,1,2,1,0,2,1,0};
        int n=arr.length; 
        System.out.println();
        DutchNationalFlagAlgo(arr,n);
        System.out.println("Sorted array is using linear time complexity and no space is used");
        for (int i =0; i<arr.length; i++){
            
            System.out.print(arr[i] + " ");
        }
    }

    public static void DutchNationalFlagAlgo(int arr[], int n){
        int low=0, mid =0, high=n-1;
        while(mid<=high){
            if (arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;

            }else if (arr[mid]==1){
                mid++;
            }else {
                int temp = arr[mid];
                arr[mid]= arr[high];
                arr[high]=temp;
                high--;

            }
        }

    }
}
