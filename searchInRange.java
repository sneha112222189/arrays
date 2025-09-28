class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int start=3, end=10;
        System.out.println(searchInRange(arr,start,end,target));
    }

    static boolean searchInRange(int[] arr,int start,int end, int target){
        if(arr.length == 0) return false;
        for(int i=start;i<=end;i++){
            if(target==arr[i]) return true;
        }
    return false;
    }
}
