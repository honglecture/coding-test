import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode answer = new ListNode();
        Set<Integer> set = new HashSet<>();
        while (true) {
            if(head == null){
                break;
            }
            set.add(head.val);
            if(head.next == null){
                break;
            }
            head = head.next;
        }
        List<Integer> list = new ArrayList<>();
        for (int n : set) {
            list.add(n);
        }
        Collections.sort(list);
        ListNode currentNode = answer;
        for (int i = 0; i < list.size(); i++) {
            currentNode.val = list.get(i);
            if(i != list.size() - 1){
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            } 
        }
        if(list.size() == 0){
            answer = null;
        }
        return answer;
    }
}