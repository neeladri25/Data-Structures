package HomeWork;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class MyLinkedList {
	
	static Node insertAtHead(Node head, int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		return head;
	}
	
	static Node insertAtEnd(Node head, int data) {
		if(head == null) {
			return new Node(data);
		}
		Node newNode = new Node(data);
		Node last = head;
		while(last.next!=null) 
			last=last.next;
		last.next=newNode;
		return head;		
	}
	
	static Node insertAtPosition(Node head, int data, int pos) {
		if(pos==1) {
			Node newN = new Node(data);
			newN.next=head;
			head = newN;
			return head;
		}
		Node newN = new Node(data);
		Node move = head;
		for(int i = 1;i<pos-1;i++) {
			move = move.next;
		}
		newN.next=move.next;
		move.next=newN;
		
		return head;
	}
	
	static void printLinkedList(Node head){
		Node curr = head;
		while(curr != null) {
			System.out.println(curr.data+" ");
			curr=curr.next;
		}
		System.out.println();
	}
	
	public static void main(String args[]) {
		Node head = null;
		head = insertAtHead(head,1);
		head = insertAtPosition(head,2,2);
		head = insertAtEnd(head,3);
		head = insertAtHead(head,5);
		head = insertAtPosition(head,9,4);
		head = insertAtEnd(head,88);
		printLinkedList(head);
		
	}

}
