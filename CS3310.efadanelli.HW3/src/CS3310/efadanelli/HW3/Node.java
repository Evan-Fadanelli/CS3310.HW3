package CS3310.efadanelli.HW3;

import java.util.*;

public class Node<K, E> {
	K key;//the key inside the node
	Node<K, E> next;//next pointer
	ArrayList<E> bucket = new ArrayList<E>();
	
	Node(K keyValue){
		key = keyValue;	//data inside the node
	}
	
	Node(K keyValue, Node<K, E> nextNode){
		key = keyValue;//what inside the node
		next = nextNode;//what the node points to next
	}
	
	public E getBucketElement(int index) {
		return bucket.get(index);
	}
	
	public int getBucketSize() {
		return bucket.size();
	}
	
	public ArrayList<E> getBucket() {
		return bucket;
	}
	
	public K getKey() {
		return key;//return data
	}

	public Node<K,E> getNext() {
		
		return next; //return next
	}

	public void setNext(Node<K,E> next) {
		
		this.next = next; // this.next points to the next node "next"
	}
}
