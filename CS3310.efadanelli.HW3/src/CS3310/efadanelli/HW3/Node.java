package CS3310.efadanelli.HW3;

import java.util.*;
//
public class Node<K, V> {
	K key;//the key inside the node
	Node<K, V> next;//next pointer
	ArrayList<V> bucket = new ArrayList<V>();
	
	Node(K keyValue, V value){
		key = keyValue;	//data inside the node
		this.bucket.add(value);
	}

	public V getBucketElement(int index) {
		return bucket.get(index);
	}
	
	public int getBucketSize() {
		return bucket.size();
	}
	
	public ArrayList<V> getBucket() {
		return bucket;
	}
	
	public K getKey() {
		return key;//return data
	}

	public Node<K,V> getNext() {
		
		return next; //return next
	}

	public void setNext(Node<K,V> next) {
		
		this.next = next; // this.next points to the next node "next"
	}
}