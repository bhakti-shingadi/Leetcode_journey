 class Solution {
        public List<Integer> findDuplicates(int[] arr) {
            int i=0;
            while(i<arr.length){
                int correctIndex= arr[i]-1;
                if(arr[i]!= arr[correctIndex]){
                    swap(arr,i,correctIndex);
                }else{
                    i++;
                }
            }
            List<Integer> ans = new ArrayList<>();
            //serach for first missing no.
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                    ans.add(arr[index]);
                }
            }
            //case2
            return ans;
        }
        static void swap(int[] arr, int first, int second) {
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
 }
 
