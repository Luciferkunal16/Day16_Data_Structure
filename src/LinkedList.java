package unorderedList;

public class LinkedList {
	Node head;
	Node tail;
	
	/* Append Method For  inserting element  in right-most corner  */

	public void append(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

	}

	public Node push(String data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;

		} else {
			newNode.next = head;
			head = newNode;
		}
		return newNode;

	}

	public void insertBetweenValue(String data, int position) {
		Node currNode = new Node(data);

		Node temp = head;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;

		}
		currNode.next = temp.next;
		temp.next = currNode;
	}

	public void popFirstElement() {

		if (head == null)
			System.out.println("No Element in Linked LIst");
		Node temp = head;
		head = head.next;

	}

	public void popLastElement() {
		if (head == null)

			if (head.next == null) {

			}

		// Find the second last node
		Node second_last = head;
		while (second_last.next.next != null)
			second_last = second_last.next;

		// Change next of second last
		second_last.next = null;

	}

	int search( String x) {
		Node current = head;// Initialize current
		int position = 1;
		while (current != null) {
			if (current.data.equals(x)) {
				
				return position;
			} else {
				current = current.next;
				position++;
			}
		}return -1;

	}
	   void deleteNode(int position)
	    {
	        // If linked list is empty
	        if (head == null)
	            return;
	  
	        // Store head node
	        Node temp = head;
	  
	        // If head needs to be removed
	        if (position == 0)
	        {
	            head = temp.next;   // Change head
	            return;
	        }
	  
	        // Find previous node of the node to be deleted
	        for (int i=0; temp!=null && i<position-1; i++)
	            temp = temp.next;
	  
	        // If position is more than number of nodes
	        if (temp == null || temp.next == null)
	            return;
	  
	        // Node temp->next is the node to be deleted
	        // Store pointer to the next of node to be deleted
	        Node next = temp.next.next;
	  
	        temp.next = next;  // Unlink the deleted node from list
	    }

	/*void insertBetweenTwoNodeByValue(int data1, int element1, int element2) {
		Node temp = head;
		Node temp1 = null;
		;// Initialize current
		Node newNode = new Node(data1);
		while (newNode != null) {

			if (temp.data == element1 && temp.next.data == element2) {
				temp.next = temp1;
				temp.next = newNode;
				newNode.next = temp1;
				return;

			} else {
				temp = temp.next;

			}
		}
	}*/

	 public void sortList()
	    {
	 
	        // Node current will point to head
	        Node current = head, index = null;
	 
	        String temp;
	 
	        if (head == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                // Node index will point to node next to
	                // current
	                index = current.next;
	 
	                while (index != null) {
	                    /* If current node's data is greater
	                    // than index's node data, swap the data
	                     between them*/
	                    if (current.data.compareTo(index.data) ==1) {
	                        temp = current.data;
	                        current.data = index.data;
	                        index.data = temp;
	                    }
	 
	                    index = index.next;
	                }
	                current = current.next;
	            }
	        }
	    }

	public void display() {
		Node n = head;
		if (head == null) {
			System.out.println("Linked list is Empty");

		} else {
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
		}
	}
	

}
