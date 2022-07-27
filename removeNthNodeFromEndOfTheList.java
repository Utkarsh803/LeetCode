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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode p = head;
        ListNode a = head;
        
        int length=0;
        
         if(a.next==null){
            ListNode out = new ListNode();
            return out.next;
        }
     
        
        while(p.next!=null){
            length++;
            p=p.next;
        }
        
        
        length = length+1;
        
        if(n>=length){
        return a.next;
        }
        
        System.out.println(length);
    
        int diff = length - n;
        System.out.println(diff);
        
        for(int i=0;i<diff-1;i++){
            a=a.next;
        }
        System.out.println(a.val);
        a.next=a.next.next;
         
        
        return head;
    
    }
}