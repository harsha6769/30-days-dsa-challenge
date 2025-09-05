class Node {
    int val;
    Node next;
    Node random;
    Node(int x) { val = x; }
}

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Insert copy nodes
        Node curr = head;
        while (curr != null) {
            Node newNode = new Node(curr.val);
            newNode.next = curr.next;
            curr.next = newNode;
            curr = newNode.next;
        }

        // Step 2: Assign random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate lists
        curr = head;
        Node copyHead = head.next;
        Node copy = copyHead;
        while (curr != null) {
            curr.next = curr.next.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            curr = curr.next;
            copy = copy.next;
        }

        return copyHead;
    }
}

public class Main {
    public static void printList(Node head) {
        while (head != null) {
            int rand = (head.random != null) ? head.random.val : -1;
            System.out.println("Val: " + head.val + ", Random: " + rand);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        n1.next = n2;

        // Random pointers
        n1.random = n2;
        n2.random = n2;

        Solution sol = new Solution();
        Node copied = sol.copyRandomList(n1);

        System.out.println("Original list:");
        printList(n1);

        System.out.println("Copied list:");
        printList(copied);
    }
}
