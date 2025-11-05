
class Main {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=position(nums,target,0,nums.length-1);
        System.out.println(ans);
        
    }
    int[] position(int[] nums,int target,int low,int high){
        int[] arr = {-1,-1};
        int start = ans(nums,target,true,0,nums.length-1);
        int end = ans(nums,target,false,0,nums.length-1);
        arr[0]=start;
        arr[1]=end;
        return arr;
    }

    int ans(int[] nums,int target,boolean startIndex,int low,int high){
        int ans = -1;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(target>nums[mid]){
                low=mid+1;
            }
            else if(target<nums[mid]){
                high=mid-1;
            }
            else{
                ans=mid;
                if(startIndex){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return ans;
    }
}