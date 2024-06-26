package LeetCode;

import java.util.List;

public class DesignHashSet {

//	Design a HashSet without using any built-in hash table libraries.
//
//	Implement MyHashSet class:
//
//	void add(key) Inserts the value key into the HashSet.
//	bool contains(key) Returns whether the value key exists in the HashSet or not.
//	void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
//	 
//
//	Example 1:
//
//	Input
//	["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
//	[[], [1], [2], [1], [3], [2], [2], [2], [2]]
//	Output
//	[null, null, null, true, false, null, true, null, false]
//
//	Explanation
//	MyHashSet myHashSet = new MyHashSet();
//	myHashSet.add(1);      // set = [1]
//	myHashSet.add(2);      // set = [1, 2]
//	myHashSet.contains(1); // return True
//	myHashSet.contains(3); // return False, (not found)
//	myHashSet.add(2);      // set = [1, 2]
//	myHashSet.contains(2); // return True
//	myHashSet.remove(2);   // set = [1]
//	myHashSet.contains(2); // return False, (already removed)
//	 
	
	
    private int size;
    private List<List<Integer>> buckets;

    public MyHashSet() {
        size = 1000;
        buckets = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            buckets.add(new LinkedList<>());
        }
    }

    public void add(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }

    public void remove(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        bucket.remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int index = hash(key);
        List<Integer> bucket = buckets.get(index);
        return bucket.contains(key);
    }

    private int hash(int key) {
        return key % size;
    }
	
    
    //SOLUTIION 2
    
//    The implementation that I thought was to go for a boolean array with size 10^6 +2.
//
//    And this is easy to add and remove the element in the boolean array.
//
//    Just return that boolean element to find whether it contains in set function.
//
//    Please upvote if this helps..

//    	int size = (int)Math.pow(10, 6)+1;
//    	boolean[] flag;
//        public MyHashSet() {
//    		flag = new boolean[size];
//    	}
//        
//        public void add(int key) {
//            flag[key]=true;
//        }
//        
//        public void remove(int key) {
//            flag[key]=false;
//        }
//        
//        public boolean contains(int key) {
//            return flag[key];
//        }
//    
    
}
