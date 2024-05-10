package LeetCode;

public class PalindromeLinkedList {

//	Given the head of a singly linked list, return true if it is a 
//			palindrome
//			 or false otherwise.
	
//	Example 1:
//
//
//		Input: head = [1,2,2,1]
//		Output: true
//		Example 2:
//
//
//		Input: head = [1,2]
//		Output: false
//		 
//
//		Constraints:
//
//		The number of nodes in the list is in the range [1, 105].
//		0 <= Node.val <= 9
//		 
//
//		Follow up: Could you do it in O(n) time and O(1) space?
	
	 public boolean isPalindrome(ListNode head) {

	     
	        ListNode slow = head, fast = head, prev, temp;
	       
	        // loop the end of node  
	        while (fast != null && fast.next != null) {
	        	
	        	//here slow will be at middle
	            slow = slow.next;
	            
	            //fast will be at the end
	            fast = fast.next.next;
	        }
	        
	        prev = slow;
	        slow = slow.next;
	        prev.next = null;
	        while (slow != null) {
	            temp = slow.next;
	            slow.next = prev;
	            prev = slow;
	            slow = temp;
	        }
	        fast = head; // head means first value fast will start from the very first element and slow from mid [ slow got reversed ]
	        slow = prev; // value of changed right half starting from mid will be slow
	      
	        while (slow != null) { // slow starts from mid to end of loop
	         
	        	if (fast.val != slow.val) {
	            //means values are not equal	
	            	 return false;
	            }
	        	
	            fast = fast.next;// moving ahead to check for next element
	            slow = slow.next;// moving ahead to check for next element
	        }
	        
	        return true;
	    }

	 
	
	
//	public boolean isPalindrome2(ListNode head) {
//    
//		ListNode slow = null;
//		ListNode fast = null;
//		
//		while(fast !=null && fast.next !=null) {
//			
//			fast = fast.next.next; // it will reach end of listnode
//			slow = slow.next; // will reach mid of listnode
//		}
//		
//		slow =  reverse(slow);
//		fast = head;
//   
//		while (slow != null) {
//			
//			if(slow.val != fast.val) {
//				
//				return false;
//			}
//			slow = slow.next;
//			fast = fast.next;
//		}
//		
//		return true;
//	}
//	
//	
//	//reverse method to reverse a Linked list/ ListNode for eg 123 321 right half will become 123 123 then we can compare from starting pointer head to middle pointer which is slow [ variable ] which is middle 1
//	
//	public ListNode reverse(ListNode head) {
//		
//		ListNode prev = null;   //reverse right half of our linked list
//		
//		while(head != null) {
//			
//			ListNode next = head.next;
//			head.next = prev;
//			prev = head;
//			head = next;
//		}
//		return prev;
//	}
	
	
	
	
	
	
}
