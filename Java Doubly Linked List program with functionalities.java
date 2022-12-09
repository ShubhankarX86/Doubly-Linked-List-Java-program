
import java.util.Scanner;
class ListNode{
	
	Scanner s = new Scanner(System.in);
	
	int data;
	ListNode next;
	ListNode prev;
	
	ListNode(int data){
		this.data = data;
	}
	
	public void printDLL(ListNode A) { // This method prints the DLL on the console.
		
		System.out.print("The Doubly Linked List in this source code is: ");
		
		ListNode current = A;
		while(current != null) {
			System.out.print(current.data + "-->");
			
			current = current.next;
		}
		if(current == null) {
			System.out.print("null");
		}
		
		System.out.println();
		System.out.println("");
		
		
	}
	
	public void printDLLREVERSED(ListNode A, ListNode E) { // This method prints the DLL in reversed order on the console.
		
		System.out.print("The Doubly Linked List (in reverse order) in this source code is: ");
		
		
		ListNode initial = E;
		while(initial != null) {
			if(initial == E) {
				System.out.print("null");
			}
			System.out.print("<--");
			System.out.print(initial.data);
			
			initial = initial.prev;
		}
		
		
	
		
		
		
	}
	
	public void countNodes(ListNode A) { // This method counts the number of nodes in the DLL.
		ListNode first = A;
		int nodeCount = 0;
		while(first != null) {
			nodeCount = nodeCount + 1;
			first = first.next;
			
		}
		
		System.out.println();
		System.out.println();
		System.out.print("The length of this DLL is: " + nodeCount);
		System.out.println();
		System.out.println();
		
		
	}
	
	public void findNumber(ListNode A, ListNode E) { //This method finds the user input number in the DLL and responds with positive or negative affirmation. 
		System.out.print("Enter the number you desire to find in the DLL: ");
		System.out.println("");
		
		ListNode last = E;
		ListNode one = A;
		int number = s.nextInt();
		while(one != null) {
			if(one.data == number) {
				System.out.print("Yes, " + number + " does exist in the DLL.");
				break;
			}
			else if(one == last && last.data != number) {
				System.out.print("No, " + number + " does not exist in the DLL.");
			}
			
			one = one.next;
		}
		System.out.println();
		System.out.println();
		
		
	}
	    
	public void insertNodeBeginning(ListNode A) { // This method inserts a new single node, in the beginning, into the DLL;
		   
		   System.out.print("Enter the value of the node that is to be inserted in the beginning of the DLL: ");
		   
		   int insert = s.nextInt();
		   ListNode first = new ListNode(insert);
		   first.next = A;
		   A = first;
		   
		   System.out.println();
		   System.out.print("After inserting the desired node in the beginning, the DLL now looks like: ");
		   
		   
		   ListNode current = A;
		   while(current != null) {
			   System.out.print(current.data + "-->");
			   current = current.next;
		   }
		   System.out.print("null");
		   System.out.println();
		   System.out.println();
	   }
	
	
public void insertNodeEnd(ListNode A, ListNode E) { // This method inserts a new single node, at the end, into the DLL;
		
		System.out.print("Enter the value of the node that is to be inserted at the end of the DLL: ");
		System.out.println();
		int value = s.nextInt();
		ListNode F = new ListNode(value);

        ListNode Current = A;
        while(Current.next != null) {
        	Current = Current.next;
        }
		Current.next = F;
		
		System.out.print("After inserting the desired node at the end, the DLL now looks like: ");
		ListNode current = A;
		while(current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		
		System.out.print("null");
		
		System.out.println();
		System.out.println();
	}
	  
		
	
	
	
	public void reverseDLL(ListNode A, ListNode E) { // This method reverses the DLL and print it on the console.
		
		ListNode next = null;
		ListNode current = A;
		ListNode prev = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		ListNode nex = null;
		ListNode now = E;
		ListNode pre = null;
		
		while(now != null) {
			nex = now.prev;
			now.prev = pre;
			pre = now;
			now = nex;
			
		}
		
		System.out.print("After reversing, the DLL looks like: ");
		
		ListNode ini = E;
		while(ini != null) {
			System.out.print(ini.data + "-->");
			ini = ini.next;
			}
		System.out.print("null");
		System.out.println();
		System.out.println();


	}
	
	
	

}
public class singlyLinkedList {

	
	
public static void main(String args[]) {
	
	Scanner s = new Scanner(System.in);
	
	System.out.println();
	
	
	ListNode A = new ListNode(6);
	ListNode B = new ListNode(1);
	ListNode C = new ListNode(5);
	ListNode D = new ListNode(4);
	ListNode E = new ListNode(3);
	
	A.next = B;
	B.next = C;
	C.next = D;
	D.next = E;
	
	
	E.prev = D;
	D.prev = C;
	C.prev = B;
	B.prev = A;
	
	A.printDLL(A);  // this line of code calls the printDLL() method in the class ListNode.
	
	A.printDLLREVERSED(A, E);  // this line of code calls the printDLLREVERSED() method in the class ListNode.
	
	A.countNodes(A);  // this line of code calls the countNodes() method from the class ListNode.
	
	A.findNumber(A, E);  // this line of code calls the findNumber() method from the class ListNode.
	
	A.insertNodeBeginning(A);  // this line of code calls the insertNodeBeginning() method in the class ListNode.
	
	A.insertNodeEnd(A, E);  // this line of code calls the insertNodeEnd() method in the class ListNode.
	
	A.reverseDLL(A,  E);  // this line of code calls the reverseDLL() method in the class ListNode.
	
	    
	
}
	

}
