class Main {
    public static void main(String[] args) {
        int arr[] = {12,42,2,54,1};
        System.out.println("Min element in array is "+ minNum(arr));
    }

    static int minNum(int[] arr){
        // int min = Integer.MAX_VALUE;   [max value in integer range]
        int min = arr[0]; 
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min) {
                min=arr[i];
        }
    }
    return min;
}
}
