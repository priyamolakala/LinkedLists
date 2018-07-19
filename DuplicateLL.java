package test;
import java.util.HashSet;


public class DuplicateLL {
	HashSet<Integer> set = new HashSet<Integer>();
	ListNode previous;
	public void removedup(ListNode current) {
		while(current!=null) {
		if(set.contains(current.data)) {
			previous.next = current.next;
		}
		else {
			set.add(current.data);
			previous=current;
		}
		current = current.next;
	}
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
