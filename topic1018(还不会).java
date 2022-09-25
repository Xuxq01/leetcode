class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
		int len = nums.length;
        int num = nums[0];
        if(len == 1){
            if(nums[0] == 1){
                result.add(false);
                return result;
            }
            else{
                result.add(true);
                return result;
            }
        }
        if(nums[0] == 1){
            result.add(false);
        }else{
            result.add(true);
        }
        for(int i = 1; i < len; i++){
            num = num * 2;
            num = num + nums[i];
            int t = num % 5;
			result.add(t == 0);
        }
        return result;
    }
}
