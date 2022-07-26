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