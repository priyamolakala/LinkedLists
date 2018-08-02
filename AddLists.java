package test;

public class AddLists {
	
	public ListNode addlists(ListNode p, ListNode q) {
		ListNode current = new ListNode(0); 
		int carry = 0;
		while(p != null || q != null) {
			int x = p!=null?p.data:0;
			int y = q!=null?q.data:0;
			int sum = x + y + carry;
			carry = sum/10;
			int left = sum%10;
			current = new ListNode(left);
			current = current.next;
			while(p!=null) { p = p.next;}
			while(q!=null) { q = q.next;}
			
		}
		if(carry>0) {
			current.next = new ListNode(carry);
			}
		current.next = null;
		return current;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
