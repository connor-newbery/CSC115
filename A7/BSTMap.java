//Connor Newbery
//V00921506


import java.util.*;

public class BSTMap<K extends Comparable<K>, V > implements  Map<K, V>  {

	BinarySearchTree<K,V> bst;

	public BSTMap () {
		bst = new BinarySearchTree<K,V>();
	}

	public boolean containsKey(K key) {
		try{
		V val = bst.find(key);
		bst.insert(key, val);
		if(val != null){
			return true;
		}
		else{
			return false; // so it compiles
		}
	}catch(KeyNotFoundException e){
		return false;
	}

}

	public V get (K key) throws KeyNotFoundException {

		return bst.find(key);


	}

	public List<Entry<K,V>>	entryList() {
		return bst.entryList(); // so it compiles
	}

	public void put (K key, V value) {
		bst.insert(key, value);
	}

	public int size() {
		return bst.size(); // so it compiles
	}

	public void clear() {
		bst.clear();
	}


	// The remaining methods are for Part III:
	public long getGetLoopCount() {
		return bst.getFindLoopCount();
	}

	public long getPutLoopCount() {
		return bst.getInsertLoopCount();
	}

	public void resetGetLoops() {
		bst.resetFindLoops();
	}
	public void resetPutLoops() {
		bst.resetInsertLoops();
	}
}
