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
    public ListNode mergeKLists(ListNode[] lists) {
  
     ListNode mergedArray = new ListNode(0);
    
    if(lists.length==0){
        ListNode out = new ListNode();
        return out.next;
    }
        
    if(lists.length==1){
        return lists[0];
    }
        
    else if(lists.length==2){
        return mergeTwoLists(lists[0], lists[1]);
    }
        
    else{    
        
    for(int i =0; i<lists.length-1;i++){
    
        if(i!=0){
            mergedArray = mergeTwoLists(mergedArray, lists[i+1]);
        }
        else{
            mergedArray = mergeTwoLists(lists[i], lists[i+1]);
        }
    }    
        
    return mergedArray;
        }
       // return mergedArray;
    }
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
    ListNode head = new ListNode(0);
    ListNode p = head;
    ListNode l1 = list1;
    ListNode l2 = list2;
    
        
        while(l1!=null && l2!=null){
            
            if (l1.val <l2.val) {
                p.next=l1;
                l1=l1.next;
            }
            else{
                p.next=l2;
                l2=l2.next;
            }
            
            p = p.next;
        }
    
        
        if(l1!=null){
            p.next=l1;
            }
            else{
              p.next=l2;
            }
    return head.next;    
    }
}