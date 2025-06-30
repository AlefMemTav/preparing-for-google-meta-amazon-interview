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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return soma(l1, l2, 0);
    }

    private ListNode soma(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int v1 = l1 != null ? l1.val : 0;
        int v2 = l2 != null ? l2.val : 0;
        int total = v1 + v2 + carry;

        ListNode node = new ListNode(total % 10);
        node.next = soma(
            l1 != null ? l1.next : null,
            l2 != null ? l2.next : null,
            total / 10
        );
        return node;
    }
}
