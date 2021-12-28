package com.myhashmap;

public class LinkedList {
	
	public static void main(String[] args) {
		
		INode<Integer> myFirstNode = new MyNode<Integer>(56);
		INode<Integer> mySecondNode = new MyNode<Integer>(30);
		INode<Integer> myThirdNode = new MyNode<Integer>(70);
	
		MyLinkedList<Integer> intLinkedList = new MyLinkedList<>();
		intLinkedList.add(myFirstNode);
		intLinkedList.add(mySecondNode);
		intLinkedList.add(myThirdNode);
	
		System.out.println("Nodes avaliable after adding :");
		intLinkedList.printMyNodes();
		
		
		System.out.println("searching for the node value of 40 :" +intLinkedList.search(40));
		
		INode<Integer> myFourthNode = new MyNode<Integer>(40);
		System.out.println("After adding for the fourth node value 40" );
		intLinkedList.insert(30, myFourthNode);
		
		intLinkedList.printMyNodes(); 
		
		System.out.println("Removing the fourth Node "+intLinkedList.remove(40)); 
		
		intLinkedList.printMyNodes(); 

		intLinkedList.insert(30, myFourthNode);
		
		intLinkedList.printMyNodes(); 
		
	}
}

 