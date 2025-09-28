class Main {
    public static void main(String[] args) {
        int[][] arr = { { 1,2,3},{4,5,6},{7,8,9}};
        int target = 50;
        System.out.println(search2Darray(arr,target));
    }

    static boolean search2Darray(int[][] arr, int target){
        if(arr.length == 0) return false;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target == arr[i][j]) return true;
            }
        }
        

        return false;
    }
}
