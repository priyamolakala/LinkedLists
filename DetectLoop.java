package test;

public class DetectLoop {
	
	public boolean checkloop(ListNode node) {
		ListNode fast = node;
		ListNode slow = node;
		if(node == null || node.next == null) {
			return false;
		}
		while(node!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow = node;
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
			}
		return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
