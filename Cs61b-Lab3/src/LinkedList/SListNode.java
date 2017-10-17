package LinkedList;

/* SListNode.java */

/**
 *  SListNode is a class used internally by the SList class.  An SList object
 *  is a singly-linked list, and an SListNode is a node of a singly-linked
 *  list.  Each SListNode has two references:  one to an object, and one to
 *  the next node in the list.
 *
 *  @author Kathy Yelick and Jonathan Shewchuk
 */

class SListNode {
	private Object item;
	private SListNode next;


  /**
   *  SListNode() (with two parameters) constructs a list node referencing the
   *  item "obj", whose next list node is to be "next".
   */

	SListNode(Object obj, SListNode next) {
		this.item = obj;
		this.next = next;
	}

  /**
   *  SListNode() (with one parameter) constructs a list node referencing the
   *  item "obj".
   */

	SListNode(Object obj) {
		this(obj, null);
	}
  
	public Object getItem() {
		return this.item;
	}
  
	public SListNode getNext() {
		return next;
	}
  
	public void deleteNext() {
		this.next = next.getNext();
	 
	}
  
	public void changeNext(SListNode newNode) {
		this.next = newNode;  
	}
  
	public void changeNode(SListNode newNode, SListNode next) {
		this.item = newNode;
		this.next.changeNext(next);
	}
}