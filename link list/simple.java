

class simple{
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args)
    {
        ListNode l=new ListNode();
        l=new ListNode(4);

        System.out.println(l.next);
        l.next=new ListNode(3);

        ListNode kl=l;
        while(kl!=null)
        {
            System.out.println(kl.val);
            kl=kl.next;
        }
        System.out.println(l.val);
        System.out.println(kl.next);
      

}
}