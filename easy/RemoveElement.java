import java.util.Arrays;


public class RemoveElement {

    public static int removeElement(Integer[] A, int elem) {
    	int size = A.length;
    	int last = last(A, elem, A.length - 1);

    	for (int i = 0; i < A.length; i++) {
    		if (A[i] == elem) {
    			size--;
    		}
    	}
    	for (int i = 0; i < A.length; i++) {
    		if (A[i] == elem) {
    			if (i < last) {
    				// swap
    				int t = A[i];
    				A[i] = A[last];
    				A[last] = t;
    				
    				last = last(A, elem, last - 1);
    			}
    		}
    	}
        
    	return size;
    }
    
    public static int last(Integer[] A, int elem, int start) {
    	for (int i = start; i > 0; i--) {
    		if (A[i] != elem) {
    	    	return i;
    		}
    	}
    	return start;
    }

//    public static int removeElement(Integer[] A, int elem) {
//        int size = A.length;
//    	for (int i = 0; i < A.length; i++) {
//    		if (A[i] == elem) {
//    			size--;
//    		}
//    	}
//    	return size;
//    }
	
	public static void main(String[] args) {
		Integer[] A = new Integer[]{1,2,3,2};
		
		System.out.println(removeElement(A, 2));
		System.out.println(Arrays.deepToString(A));
		
		A = new Integer[]{4,5};
		System.out.println(removeElement(A, 4));
		System.out.println(Arrays.deepToString(A));
	}

}
