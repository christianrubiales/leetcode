import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCache {

	private final LinkedHashMap<Integer, Integer> map;
	
    public LRUCache(int capacity) {
    	final int max = capacity;
    	// initial capacity, default load factor, true - access order (false - insertion order)
    	this.map = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true) {
    		protected boolean removeEldestEntry(Map.Entry<Integer, Integer> entry) {
    			return size() > max;
    		}
    	};
    }
    
    public int get(int key) {
    	return map.containsKey(key) ? map.get(key) : -1;
    }
    
    public void set(int key, int value) {
		map.put(key, value);
    }

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
		// 1, 3
		
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
