import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,352,76,837,88};
        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        if(linear(arr,target) != -1){
            System.out.println("element is present in array");
        }
        else{
            System.out.println("element is not present");
        }
        
    }

    static int linear(int[] arr,int target){
    if(arr.length == 0) return -1;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==target) return target;
    }
        return -1;
    }
}
