/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        if (l1.val > l2.val) return mergeTwoLists(l2, l1);
        ListNode head = l1;
        while (l2 != null) {
            if (l1.next == null) {
                l1.next = l2;
                break;
            }
            else if (l1.val <= l2.val && l1.next.val > l2.val) {
                ListNode tmp = l1.next;
                l1.next = l2;
                l2 = l2.next;
                l1 = l1.next;
                l1.next = tmp;
            } else {
                l1 = l1.next;
            }
        }
        return head;
    }
}
