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
class Solution 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        ListNode li1=new ListNode(0);
        ListNode li2= li1;
        while(l1!=null && l2!=null)
        {
            if(l1.val <= l2.val)
            {
                li2.next=l1;
                l1=l1.next;
            }
            else
            {
                li2.next=l2;
                l2=l2.next;
            }
            li2=li2.next;
        }
        li2.next=l1!=null ? l1:l2;
        return li1.next;
    }
}