import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[][] arr = { { 1,2,3},{4,5,6},{7,8,9}};
        int target = 6;
        int[] ans1 =search2Darray(arr, target);
        System.out.println("Searching element is: "+Arrays.toString(ans1));

        int ans2 = max2Darray(arr);
        System.out.println("maximum element in array is: "+ ans2);
    }

    static int[] search2Darray(int[][] arr, int target){
        if(arr.length == 0) return new int[]{-1,-1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]) return new int[]{i,j};
            }
        }
        

        return new int[]{-1,-1};
    }

    static int max2Darray(int[][] arr){
        if(arr.length == 0) return -1;;

        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(max < arr[i][j]){ 
                    max=arr[i][j];
                }
            }
        }
        

        return max;
    }
}
