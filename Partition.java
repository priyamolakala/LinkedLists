package test;

public class Partition {
	
	public void division(ListNode node, int x) {
		ListNode head = node;
		ListNode tail = node;
		while(node!=null) {
			ListNode next = node.next;
			if(node.data<x) {
				node.next = head;
				head = node;
			}
			else {
				tail.next = node;
				tail= node;
			}
			node = next;
		}
		tail.next = null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
