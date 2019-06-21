import __HELPER_CLASSES__.ListNode;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null) {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasCycle(ListNode.build(args[0], Integer.parseInt(args[1]))));
    }
}
