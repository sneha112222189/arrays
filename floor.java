import java.util.*;

class Main {

    static int floor(int[] arr,int low,int high,int target){
            while(low<high){
            int mid = (low+(high-low))/2;
            if(arr[mid]==target)
                return arr[mid];
            else if(arr[mid]<target){
                return floor(arr,mid+1,high,target);
            }
            else{
                return floor(arr,low,mid,target);
            }
        }
        return arr[high];
        }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={10,20,30,40,50};
        System.out.println("enter the target element: ");
        int target = sc.nextInt();
        System.out.println(floor(arr,0,arr.length-1,target));
    }
}