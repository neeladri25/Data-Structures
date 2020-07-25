package LinkedList;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class EndNthNode {
	static void nthNodefromEnd(Node head, int n) {
		Node curr = head;
		int c=0;
		while(curr!=null)
		{
			curr=curr.next;
			c++;
		}
		if(c<n) {
			return;
		}
		for(int i = 1;i<(c-n+1);i++) {
			head=head.next;
		}
		System.out.println(head.data);
	}
	
	static void nthNodefromEndTwoPointerRef(Node head, int n) {
		if(head == null) return;
		Node first = head;
		Node second = head;
		int i;
		for(i=0;i<n;i++) {
			if(first == null) return;
			first=first.next;
		}
		while(first!=null){
			second=second.next;
			first=first.next;
		}
		System.out.println(second.data+" ");
	}
	
	static Node insertAtEnd(Node head, int data) {
		if(head == null) {
			return new Node(data);
		}
		Node newNode = new Node(data);
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newNode;
		return head;
	}
	
	static void printData(Node head){
		Node c =head;
		while(c!=null) {
			System.out.println(c.data+ " ");
			c=c.next;
		}
		System.out.println();
		
	}
	
	public static void main(String args[]) {
		Node head = null;
		head = insertAtEnd(head,8);
		head = insertAtEnd(head,10);
		head = insertAtEnd(head,11);
		head = insertAtEnd(head,20);
		head = insertAtEnd(head,30);
		head = insertAtEnd(head,33);
		printData(head);
		nthNodefromEnd(head,5);
		nthNodefromEndTwoPointerRef(head,3);
	}

}
