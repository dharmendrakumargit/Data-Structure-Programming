package com.programming.linkedList;

/* Author Dharmendra Kumar 
   24  Feb 2021

   LinkedList Nodes Creation &&
   Linkage of Nodes && 
   Nodes Printing
*/

public class LinkedList {
	private LinkedList next;
	private int data;

	public LinkedList(int data) {
		this.data = data;
		this.next = null;
	}

	public static void createNode() {

	// Creation Of Nodes
		LinkedList nodeOne = new LinkedList(1);
		LinkedList nodeTwo = new LinkedList(2);
		LinkedList nodeThree = new LinkedList(3);
		LinkedList nodeFour = new LinkedList(4);

	// Linking of Nodes
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = nodeFour;

   // Printing/Iteration of Nodes
		   printNode(nodeOne);

	}

	public static void printNode(LinkedList head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	public static void main(String[] args) {
		createNode();
	}

}
