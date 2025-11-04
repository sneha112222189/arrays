import java.util.*;

class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("enter the target element: ");
        int target = sc.nextInt();
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr,int target){
        if(target>arr[arr.length-1]) return -1;
        int low=0;
        int high=arr.length-1;
            while(low<=high){
            int mid = (low+(high-low))/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}
