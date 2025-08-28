class ListNode206 {
    int val;
    ListNode206 next;
    ListNode206(int x) {
        val = x;
    }
}

class Solution206 {
    public ListNode206 reverseList(ListNode206 head) {
        ListNode206 prev = null;
        ListNode206 curr = head;
        while (curr != null) {
            ListNode206 nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void printList(ListNode206 node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode206 head = new ListNode206(1);
        head.next = new ListNode206(2);
        head.next.next = new ListNode206(3);
        head.next.next.next = new ListNode206(4);
        head.next.next.next.next = new ListNode206(5);

        Solution206 sol = new Solution206();
        ListNode206 result = sol.reverseList(head);

        System.out.print("Reversed: ");
        printList(result);
    }
}
