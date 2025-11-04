import java.util.*;

class Main {

    static int binarySearch(int[] arr,int low,int high,int target){
        int mid = (low+(high-low))/2;
            while(low<high){
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]<target){
                //low=mid+1;
                binarySearch(arr,mid+1,high,target);
            }
            else{
                //high=mid-1;
                binarySearch(arr,low,mid,target);
            }
        }
        return arr[low];
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("enter the target element: ");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr,0,5,50));
    }
}
