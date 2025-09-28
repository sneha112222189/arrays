class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 2;
        int ans = linearsearch(arr,target);
        System.out.println(ans);
    }   

    static int linearsearch(int[] arr, int target){
        
        if(arr.length==0) return -1;

        for(int i=0;i<arr.length;i++){
            int e = arr[i];
            if(target==e) {
                return arr[i];
        }
    }
        return -1;
    }
}
