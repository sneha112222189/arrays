class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(maxRange(arr,1,3));
    }
    //max element in array
    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int e=arr[0];
        for(int i=1;i<=arr.length;i++){
            if(e<arr[i]) e=arr[i];
        }
        return e;
    }
    //max element in range 
    static int maxRange(int[] arr,int index1, int index2)
    {
        if (arr==null){
            return -1;
        }
        int e = arr[index1];
        for(int i=index1;i<=index2;i++){
            if(arr[i]>e){
                e=arr[i];
            }
        }
        return e;
    }
}
