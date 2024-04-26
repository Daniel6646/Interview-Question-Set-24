package LeetCode;

public class DuplicateFromSinglyLinkedNode {

//	Input: head = [1,1,2,3,3]
//			Output: [1,2,3]
//					
//	Input: head = [1,1,2]
//			Output: [1,2]
	
	
	public static void main(String[] args) {
		
	}
	
	public ListNode deleteDuplicates(ListNode head) {public ListNode deleteDuplicates(ListNode head) {
        
		ListNode current = head ;
		
		while( current !=null && current.next != null ) {
			
			if(current.val == current.next.val) {
				
				current.next = current.next.next;
				
			}
			
			else {
				
				current = current.next;
			}


		}
		
        return head;   

    }
	
	
}
