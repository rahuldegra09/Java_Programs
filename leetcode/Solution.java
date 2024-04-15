
class Solution {
public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
    public static void main(String args[])
    {

        ListNode l1=new ListNode(3);
        l1.next
        ListNode l3=new ListNode(1);
        l1.next=l2;
        l2.next=l3;
        while (l1.next!=null){
            l1.next=l1.next.next;
            System.out.println(l1.val+" ");
        }




    }
}

