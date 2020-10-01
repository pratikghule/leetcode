// #143 Reorder_List
// Java
// pratik ghule

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
    public void reorderList(ListNode head) {
        ListNode start = head;
        //ListNode end = tail;
        ListNode current = head;
        int n=0;
        
        while(current != null)
        {
            //System.out.print(current.val + " ");    
            current = current.next;
            n++;
        }
        
        System.out.println("n = "+n);
        if(n>=3)
        {
            int t = 0;
            if(n%2==0)
                t=(n/2)-1;
            else
                t=n/2;
            for(int i=0;i<=t;i++)
            {
                //System.out.println("i = "+i);
                current = head;
                for(int j=0;j<n-1;j++)
                {
                    //System.out.println("j = "+j);
                    current = current.next;
                    //System.out.println("current = "+current.val);
                }

                ListNode temp = start.next;
                start.next = current;
                current.next = temp;
                start =temp;
                if(i==t)
                {
                    start.next.next = null;
                }

            }
            current = head;
            while(current != null)
            {
                //System.out.print(current.val + " ");    
                current = current.next;
                n++;
            }

        }
    }
}
