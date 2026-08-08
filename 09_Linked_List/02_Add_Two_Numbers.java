/*
LeetCode 2 - Add Two Numbers

Approach: Linked List Traversal with Carry
Description:

- Create a dummy head node to build the result linked list.
- Initialize carry as 0.
- Traverse both linked lists while at least one node is present or carry is not 0.
- Take the values from l1 and l2; use 0 if a list has ended.
- Add both values along with the carry.
- Store the last digit of the sum in a new node.
- Update carry using sum / 10.
- Move l1 and l2 to their next nodes.
- Continue until both lists and carry are processed.
- Return the result list starting from tempHead.next.

Time Complexity: O(max(n, m))
Space Complexity: O(max(n, m))
*/



class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tempHead = new ListNode(0);
        ListNode current = tempHead;

        int carry = 0;
        while(l1 != null || l2 != null || carry != 0){
            int a;
            if(l1 != null){
            a = l1.val;
            }else{
            a = 0;}

            int b;
            if(l2 != null){
            b = l2.val;
            }else{
            b = 0;}

            int sum = carry + a + b;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if(l1 != null){
                l1 = l1.next;
            }

            if(l2 != null){
                l2 = l2.next;
            }
         }
        return tempHead.next;
    }
}