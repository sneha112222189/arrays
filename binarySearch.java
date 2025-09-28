class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int target=5;
        int ans=binarySearch(arr, target, 0, arr.length-1);
        System.out.println("element found at index : "+ans);
    }
    //ascending order 
    static int binarySearch(int[] arr,int target,int low,int high){
        low=0; 
        high=arr.length-1;
        
        while(low<=high){
            int mid = (low+(high-low))/2;
            if(target == arr[mid]){ 
                return mid;
            }

            else if(target>mid){
                binarySearch(arr,target,mid+1,high);
            }
            
            else{
                binarySearch(arr, target, low, mid);
            }
        }
        return -1;
    }
    
}
