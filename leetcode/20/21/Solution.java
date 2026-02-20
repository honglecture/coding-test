import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode();
        List<Integer> mergeList = new ArrayList<>();
        getList(list1, mergeList);
        getList(list2, mergeList);
        Collections.sort(mergeList);
        ListNode currentNode = answer;
        for (int i = 0; i < mergeList.size(); i++) {
            currentNode.val = mergeList.get(i);
            if(i != mergeList.size() - 1){
                currentNode.next = new ListNode();
                currentNode = currentNode.next;
            }
        }
        if(mergeList.size() == 0){
            answer = null;
        }
        return answer;
    }
    private void getList(ListNode listNode, List<Integer> mergeList){
        if(listNode == null){
            return;
        }
        while (true) {
            int n = listNode.val;
            mergeList.add(n);
            if(listNode.next == null){
                break;
            }
            listNode = listNode.next;
        }
    }
}