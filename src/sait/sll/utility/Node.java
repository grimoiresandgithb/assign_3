package sait.sll.utility;


/**
 * Represents single node in a singly linked list
 * Stores generic Object data and a reference to the next node
 */
public class Node {

	private Object data;
	private Node next;
	
	/**
	 * Creates a node containing the given data
	 * @param data The data stored in this node
	 */
	
	public Node (Object data) {
		this.data = data;
		this.next = null;
	}
	
	/**
	 * Gets the data stored in the node
	 * @return The data object
	 */
	public Object getData() {
		return data;
	}
	
	/**
	 * Gets the next node in the list
	 * @return The next node
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * Sets the next node reference
	 * @param next The next node
	 */
	public void setNext(Node next) {
		this.next = null;
	}
	
}
