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

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(3));
        ListNode l2 = new ListNode(2, new ListNode(3));
        ListNode l3 = addTwoNumbers(l1, l2);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        ListNode currentNode = answer;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
            int result = sum;
            if(sum >= 10){
                carry = 1;
                result = sum % 10;
            } else {
                carry = 0;
            }
            currentNode.val = result;
            l1 = l1 == null ? l1 : l1.next;
            l2 = l2 == null ? l2 : l2.next;
            if(l1 == null && l2 == null){
                break;
            }
            currentNode.next = new ListNode();
            currentNode = currentNode.next;
        }
        if(carry == 1){
            currentNode.next = new ListNode(carry);
        }
        return answer;
    }
}

// public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }