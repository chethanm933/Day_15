package com.myhashmap;

public class MyLinkedList<K> {

	INode<K> head;
	INode<K> tail;
	
	void add (INode<K> newNode)  {
		if(tail == null) {
			tail = newNode;
		} else {
			tail.setNext(newNode);
		}
		
		if(head == null) {
			head = newNode;
		} else { 
			tail = newNode;
		}
	}
	   
	INode<K> popLast() { 
		INode<K> tempNode = head;
		while(tempNode.getNext().getNext() != null) {
		tempNode = tempNode.getNext();
		}
		INode<K> lastNode = tempNode.getNext();
		tempNode.setNext(null);
		return lastNode;
	}
		

	public INode<K> search(K key) {
		INode<K> tempNode = head;
		while(tempNode != null) {
		if(tempNode.getKey().equals(key)){
			return tempNode;
		}
		tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public boolean insert(K after, INode<K> newNode) {
		INode<K> tempNode = head;
		while(tempNode != null) {
			if(tempNode.getKey().equals(after)) {
				INode<K> insertNode = tempNode.getNext();
				tempNode.setNext(newNode);
				newNode.setNext(insertNode);
				return true;
			} 
				tempNode= tempNode.getNext();
			}
			return false;
		}
	
	public boolean remove(K value) {
		INode<K> tempNode = head;
		while(tempNode != null) {
			if(tempNode.getNext().getKey().equals(value) ) {
				tempNode.setNext(tempNode.getNext().getNext());
				return true;
			}
			tempNode = tempNode.getNext();
		}
		return false;
	}
	
	
	public void sorting() {
		INode<K> tempNode = head;
		
		while(tempNode.getNext() != null) {
		}
		 
	}
	
	 public void printMyNodes() {
		 System.out.println("my nodes :"+head);
		 
		 
	 }
} 
