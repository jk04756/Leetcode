class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int longest =0;

        for(int num:set){

            if(!set.contains(num-1)){
                int CurrentNum= num;
                int CurrentLength = 1;
            

            while(set.contains(CurrentNum+1)){
                CurrentNum++;
                CurrentLength++;
            }

            longest= Math.max(longest, CurrentLength);
        }
        }
        return longest;
    }
}

