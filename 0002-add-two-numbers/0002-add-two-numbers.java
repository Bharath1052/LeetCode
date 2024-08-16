class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(-1);
      ListNode current = dummy;
      int carry = 0;
      while(l1!=null || l2!=null)
     {
        int dig1=0,dig2=0;
        if(l1!=null)
        {
            dig1=l1.val;
        }if(l2!=null)
        {
            dig2=l2.val;
        }
        int rem = (dig1+dig2+carry)%10;
        ListNode temp = new ListNode(rem);
        carry=(dig1+dig2+carry)/10;
        current.next = temp;
        current = current.next;
        if(l1!=null)
       {
        l1=l1.next;
       }if(l2!=null)
        l2=l2.next;
     }
       if(carry==1)
       {
        current.next = new ListNode(carry);
       }
       return dummy.next;  
    }
}