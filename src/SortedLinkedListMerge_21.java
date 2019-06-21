import __HELPER_CLASSES__.ListNode;


public class SortedLinkedListMerge_21 {
    public static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null && l2 != null) {
            return l2;
        }
        else if (l1 != null && l2 == null) {
            return l1;
        }
        else if (l1 == null && l2 == null){
            return null;
        }


        ListNode res;
        ListNode pointer1;
        ListNode pointer2;
        if (l1.val > l2.val) {
            res = new ListNode(l2.val);
            pointer1 = l1;
            pointer2 = l2.next;
        }
        else {
            res = new ListNode(l1.val);
            pointer1 = l1.next;
            pointer2 = l2;
        }

        ListNode res_ptr = res;

        while(pointer1 != null && pointer2 != null) {
            if (pointer1.val > pointer2.val) {
                res_ptr.next = new ListNode(pointer2.val);
                pointer2 = pointer2.next;
            }
            else {
                res_ptr.next = new ListNode(pointer1.val);
                pointer1 = pointer1.next;
            }

            res_ptr = res_ptr.next;
        }

        if (pointer1 == null && pointer2 != null) {
            res_ptr.next = pointer2;
        }
        else {
            res_ptr.next = pointer1;
        }

        return res;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.build(args[0]);
        ListNode l2 = ListNode.build(args[1]);

        System.out.println(mergeTwoList(l1, l2));
    }
}
