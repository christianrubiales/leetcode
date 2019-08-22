import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	private static final class Node {
		int key;
		int value;
		Node prev;
		Node next;
		
		Node(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}
	
	private final int size;
	private final Map<Integer, Node> map = new HashMap<>();
	private final Node head = new Node(0, 0);
	private final Node tail = new Node(0, 0);
	private int count = 0;
	
	public LRUCache(int size) {
		this.size = size;
		head.next = tail;
		tail.prev = head;
	}
	
	private void remove(Node node) {
		Node before = node.prev;
		Node after = node.next;
		before.next = after;
		after.prev = before;
	}
	
	private void addFirst(Node node) {
		Node after = head.next;
		head.next = node;
		after.prev = node;
		node.prev = head;
		node.next = after;
	}
	
	public int get(int key) {
		Node node = map.get(key);
		if (node != null) {
			remove(node);
			addFirst(node);
			return node.value;
		}
		
		return -1;
	}
	
	public void set(int key, int value) {
		Node node = map.get(key);
		if (node != null) {
			node.value = value;
			remove(node);
			addFirst(node);
		} else {
			Node newNode = new Node(key, value);
			map.put(key, newNode);
			if (size == count) {
				map.remove(tail.prev.key);
				remove(tail.prev);
				addFirst(newNode);
			} else {
				addFirst(newNode);
				count++;
			}
		}
	}
	
//	private void update(Node node) {
//		remove(node);
//		addFirst(node);
//	}

	public static void main(String[] args) {
		LRUCache cache = null;
		// test 1
		cache = new LRUCache(2);
		cache.set(2,1);
		cache.set(1,1);
		System.out.println(cache.get(2));
		cache.set(4,1);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println();
		// 1,-1,1
		
		// test 2
		cache = new LRUCache(2);
		cache.set(2,1);
		cache.set(1,1);
		cache.set(2,3);
		cache.set(4,1);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println();
		// -1, 3
		
		// test 3
		cache = new LRUCache(2);
		System.out.println(cache.get(2));
		cache.set(2,6);
		System.out.println(cache.get(1));
		cache.set(1,5);
		cache.set(1,2);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		System.out.println();
		// -1, -1, 2, 6
	}

}
