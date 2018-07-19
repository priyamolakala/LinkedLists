package test;

public class DeleteMiddle {
	
	public boolean delete(ListNode current) {
		ListNode previous = null;
		if(current.next == null || current == null || current.next.next == null) {
			return false;
		}
		
		while (current!=null && current.next !=null) {
			previous = current;
			previous.next = current.next;
			current = current.next;
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
