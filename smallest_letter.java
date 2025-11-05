class Main{
    public static char nextGreatestLetter(char[] letters, char target){
        char ans = letters[ceiling(letters,target,0,letters.length-1)];
        return ans;
    }
    static int ceiling(char[] letters,char target,int low,int high){
        if(target>=letters[letters.length-1]) return 0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==letters[mid]){
                return ceiling(letters,target,mid+1,high);
            }
            else if(target>letters[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }
}