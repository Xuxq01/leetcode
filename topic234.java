class Solution {
    public boolean isPalindrome(ListNode head) {
        List<ListNode> nums = new ArrayList<>();
        while(head!=null){
            nums.add(head);
            head=head.next;
        }
        for(int i = 0;i < nums.size();i++){
            if(nums.get(i).val != nums.get(nums.size()-i-1).val){
                return false;
            }
        }
        return true;
    }
}
