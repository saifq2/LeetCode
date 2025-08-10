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
    public ListNode reverseList(ListNode head) {
         ListNode newList = null;
        ListNode currentNode = head;
        while(currentNode!=null){
            ListNode nextNode = currentNode.next;//2,3,4
            currentNode.next = newList;//1
            newList = currentNode;//2,1
            currentNode = nextNode;//3,4
        }
        
        return newList;
    }
}