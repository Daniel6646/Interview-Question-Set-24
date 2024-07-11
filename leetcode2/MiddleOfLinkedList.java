package LeetCode2;

public class MiddleOfLinkedList {

//	Given the head of a singly linked list, return the middle node of the linked list.
//
//			If there are two middle nodes, return the second middle node.
//
//			Example 1:
//
//			Input: head = [1,2,3,4,5]
//			Output: [3,4,5]
//			Explanation: The middle node of the list is node 3.
//			Example 2:
//
//
//			Input: head = [1,2,3,4,5,6]
//			Output: [4,5,6]
//			Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one.
//			 
//
//			Constraints:
//
//			The number of nodes in the list is in the range [1, 100].
//			1 <= Node.val <= 100
	
	
	public static int size(ListNode head) {
        int cnt=0;
        while(head!=null){
            head = head.next;
            cnt++;
        }
        return cnt;
  }
	
    public ListNode middleNode(ListNode head) {

        ListNode temp = head;
    
        int size = size(head);

        for(int i=0; i<size/2; i++){
            temp=temp.next;
        }

        return temp;
    
    }
	
    
    
    public ListNode2 middleNode(ListNode head) {
   
    	ListNode fast = head;
        
    	while(fast != null && fast.next != null){
        
    		head = head.next;
    		fast = fast.next.next;
        }
        
    	return head;
    }
    
}
