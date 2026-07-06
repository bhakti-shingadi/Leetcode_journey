class Solution {
    public int findPeakElement(int[] arr) {
         int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part, this may be the ans but look for left
                //this is why end!=mid-1
                end=mid;
            }else{
                //you are in asce part 
                start=mid+1; // coz we know that mid +1 ele > mid ele
            }
        }
        //in the end start==end and pointing to the largest number coz of 2 checks above 
        return  start ;

    
    }
}