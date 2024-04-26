package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

//	Example 1:
//
//
//		Input: head = [3,2,0,-4], pos = 1
//		Output: true
//		Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
//		Example 2:
//
//
//		Input: head = [1,2], pos = 0
//		Output: true
//		Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
//		Example 3:
//
//
//		Input: head = [1], pos = -1
//		Output: false
//		Explanation: There is no cycle in the linked list.
//		 
//
//		Constraints:
//	

	// Two pointer solution

	public boolean hasCycle(ListNode head) {

		ListNode slow_pointer = head, fast_pointer = head;

		while (fast_pointer != null && fast_pointer.next != null) {

			slow_pointer = slow_pointer.next;
			fast_pointer = fast_pointer.next.next;

			if (slow_pointer == fast_pointer) {
				return true;
			}

		}

		return false;

	}

	// Hashtable / hashset solution

	public boolean hasCycle2(ListNode head) {

		HashSet<ListNode> listNodes = new HashSet<>();
		ListNode current_node = head;

		while (current_node != null) {

			if (listNodes.contains(current_node)) {

				return true;
			}

			listNodes.add(current_node);
			current_node = current_node.next;
		}
		return false;

	}

}
