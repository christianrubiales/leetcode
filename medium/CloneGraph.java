import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


/**
 * FIXME
 */
public class CloneGraph {

    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	UndirectedGraphNode clone = null;
    	if (node != null) {
    		clone = new UndirectedGraphNode(node.label);
    		clone.neighbors = new ArrayList<UndirectedGraphNode>(node.neighbors);
    	
	    	Deque<UndirectedGraphNode> deque = new ArrayDeque<UndirectedGraphNode>();
	    	deque.addAll(node.neighbors);
	    	
	    	while (!deque.isEmpty()) {
	    		UndirectedGraphNode temp = deque.removeFirst();
	    		UndirectedGraphNode copy = new UndirectedGraphNode(temp.label);
	    		copy.neighbors = new ArrayList<UndirectedGraphNode>(temp.neighbors);
	    		deque.remove(temp);
	    		deque.addAll(copy.neighbors);
	    	}
    	}
    	
    	return clone;
    }
    
	public static void main(String[] args) {
		UndirectedGraphNode node;
		
		node = new UndirectedGraphNode(0);
		UndirectedGraphNode node1 = new UndirectedGraphNode(0);
		UndirectedGraphNode node2 = new UndirectedGraphNode(0);
		
		List<UndirectedGraphNode> neighbors = new ArrayList<UndirectedGraphNode>();
		neighbors.add(node1);
		neighbors.add(node2);
		node.neighbors = neighbors;
		
		CloneGraph cloneGraph = new CloneGraph();
		UndirectedGraphNode clone = cloneGraph.cloneGraph(node);
		System.out.println(clone.neighbors);
	}

}


class UndirectedGraphNode {
	int label;
	List<UndirectedGraphNode> neighbors;

	UndirectedGraphNode(int x) {
		label = x;
		neighbors = new ArrayList<UndirectedGraphNode>();
	}
};