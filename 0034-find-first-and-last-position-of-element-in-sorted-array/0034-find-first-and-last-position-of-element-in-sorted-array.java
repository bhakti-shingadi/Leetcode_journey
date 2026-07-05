class Solution {
    public int[] searchRange(int[] arr, int target) {
        
         int[] ans = {-1, -1};
        //check for first occurrance if target first
        int start = search(arr, target, true);
        int end =search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
        
    
    //this funcion just return the index value of target 
    int search(int[]arr, int target , boolean findstartindex){
        int ans=-1;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //potential ans is found
                ans = mid;
                if(findstartindex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    
}