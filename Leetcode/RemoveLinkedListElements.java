package LeetCode;

public class RemoveLinkedListElements {

	public static void main(String[] args) {

	}

	public ListNode removeElements(ListNode head, int val) {

		//check nicks video
		//https://www.youtube.com/watch?v=gfFn-OXxcgU
		
		ListNode currentNode;

		//probability that first node i.e head can be the value
		while (head != null && head.val == val) {

			head = head.next;
		}

		// if not traverse further nodes
		currentNode = head;
		while (currentNode != null && currentNode.next != null) {

			if (currentNode.next.val == val) {

				currentNode.next = currentNode.next.next;
			}

			else {

				currentNode = currentNode.next;
			}

		}

		return head;

	}
}
