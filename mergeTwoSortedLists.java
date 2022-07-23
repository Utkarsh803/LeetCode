public class mergeTwoSortedLists {
    
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    ListNode head = new ListNode(list2.val, null);
        
    if( list1.val==list2.val || list1.val>list2.val){
    list2=list2.next;
    }
    else{
    head.val=list1.val;  
    list1=list1.next;
    }
        
        while(list1.next!=null || list2.next !=null){
            
            if( list1.val==list2.val){
                head.next=list1.next;
                head=head.next;
                list1=list1.next;
            }
            else if ( list1.val < list2.val) {
                head.next=list1.next;
                head=head.next;
                list1=list1.next;
            }
            else{
                head.next=list2.next;
                head=head.next;
                list2=list2.next;
            }
        }
        
        if(list1.next==null){
            if(list1.val<=list2.val){
                head.next=list1.next;
                head=head.next;
                while(list2.next!=null){
                    head.next=list2.next;
                    head=head.next;
                }
            }
            else{
                while(list1.val>list2.val){
                    head.next=list2.next;
                    head=head.next;
                }
            }
        }
        
        else{
             if(list2.val<=list1.val){
                head.next=list2.next;
                head=head.next;
                while(list1.next!=null){
                    head.next=list1.next;
                    head=head.next;
                }
            }
            else{
                 while(list2.val>list1.val){
                    head.next=list1.next;
                    head=head.next;
                }
            }
        }
        return head;
    }
    
}