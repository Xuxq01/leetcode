class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode list = head;
        while(list.next != null){
            if(list.next.val == list.val){
                list.next = list.next.next;
            }else{
                list = list.next;
            }
        }
        return head;
    }
}
