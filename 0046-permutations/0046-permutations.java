class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        swapmtd(0, nums, ans);
        return ans;
    }
    public void swapmtd(int idx, int[] nums, List<List<Integer>> ans){
        if( idx == nums.length){                       // base case when idx is reached last element in array
            List<Integer> temp = new ArrayList<>();        
            for(int i =0; i< nums.length; i++){
                temp.add(nums[i]);                         // add each elements in temporary list
            }
            ans.add(new ArrayList(temp));                   // after adding all elements add temp to main list ans 
            return;
        }
        for(int i=idx; i<nums.length; i++){                      //idx will be stable in 0 index ans i will go throught 0 to n
            swap(i, idx, nums);                                  // swap num[idx] with all possible elements by nums[i]
            swapmtd(idx+1,nums, ans);                            // recursion to iterate and increase idx+1
            swap(i, idx, nums);                              // again if we swap when in backtrack it will come to normal state
        }
    }
    public void swap(int i , int j, int[] nums){              // fun to swap to elements
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    
}