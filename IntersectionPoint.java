package test;

public class IntersectionPoint {
	int count = 0;
	
	public ListNode intersectionpq(ListNode p, ListNode q) {
		int diff = length(p) - length(q);
		
		ListNode larger = diff>0? p : q;
		ListNode smaller = diff>0?q : p;
		
		while(diff>0) {
			larger = larger.next;
			diff--;
		}
		
		while(larger!=smaller) {
			larger = larger.next;
			smaller = smaller.next;
		}
		return larger;
		
			
		}
	
	public int length(ListNode p) {
		while(p!=null) {
			p=p.next;
			count++;
		}
		return count;
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
