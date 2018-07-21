package test;

public class KthtoLast {
	
	public ListNode traverseLL(int k, ListNode head) {
		ListNode p1 = head;
		ListNode p2 = head;
		for(int i = 0; i<k; i++) {
			p1 = p1.next;
		}
		while(p1!=null) {
			p1= p1.next;
			p2 = p2.next;
		}
		return p2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
