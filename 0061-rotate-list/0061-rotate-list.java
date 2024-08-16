class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
        {
            return null;
        }
        ListNode temp=head;
        int len=0;
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        int rot = k%len;
        for(int i=0;i<rot;i++)
        {
            temp = head;
            while(temp.next.next!=null)
            {
                temp= temp.next;
            }
            ListNode tail = temp.next;
            temp.next=null;
            tail.next=head;
            head=tail;
        }return head;        
    }
}