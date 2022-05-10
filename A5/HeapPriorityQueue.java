/*

Connor Newbery
V00921506

*/

/*
 * HeapPriorityQueue.java
 *
 * An implementation of a minimum PriorityQueue using a heap.
 * based on the implementation in "Data Structures and Algorithms
 * in Java", by Goodrich and Tamassia
 *
 * This implementation will throw a Runtime, HeapEmptyException
 *	if the heap is empty and removeLow is called.
 *
 * This implementation will throw a Runtime, HeapFullException
 *	if the heap is full and insert is called.
 *
 */

public class HeapPriorityQueue implements PriorityQueue {

	protected final static int DEFAULT_SIZE = 10000;

	protected Comparable[] storage;
	protected int currentSize;

	/* constructor
	 *
	 * PURPOSE:
	 *  initializes storage to new Comparable[] of DEFAULT_SIZE
	 *      and initializes currentSize to 0
	 *
	 * PARAMETERS:
	 *  none
	 */
   public HeapPriorityQueue(){
    storage = new Comparable[DEFAULT_SIZE+1];
     currentSize = 1;
   }

	/* constructor
	 *
	 * PURPOSE:
	 *  initializes storage to new Comparable[] of given size
	 *      and initializes currentSize to 0
	 *
	 * PARAMETERS:
	 *  int size
	 */

   public HeapPriorityQueue(int size){
    storage = new Comparable[size+1];
    currentSize = 1;

   }

	public void insert(Comparable element){
    if(currentSize == storage.length){
      throw new HeapFullException();
    }
   storage[currentSize] = element;
   int n = currentSize;
  Comparable t;

    while(n > 1 && storage[n].compareTo(storage[(n)/2]) < 0){
      t = storage[n];
      storage[n] = storage[(n)/2];
      storage[(n)/2] = t;

      n = (n)/2;
    }
    currentSize++;
  }



 public Comparable removeMin(){
    if(currentSize == 1){
      throw new HeapEmptyException();
  }
  Comparable min = storage[1];
  storage[1] = storage[currentSize-1];
  storage[currentSize-1] = min;
  currentSize--;



  pushdown(1);


    return min;
  }

  public void pushdown(int i){
			if((2*i) == currentSize-1 &&
			storage[i].compareTo(storage[2*i]) > 0){
				Comparable temp = storage[i];
        storage[i] = storage[(2*i)];
        storage[(2*i)] = temp;
        pushdown(2*i);
			}
      if((2*i) < currentSize && (2*i)+1 <= currentSize &&
			storage[(2*i)].compareTo(storage[(2*i)+1]) <= 0
			&& storage[i].compareTo(storage[2*i]) > 0){
        Comparable temp = storage[i];
        storage[i] = storage[(2*i)];
        storage[(2*i)] = temp;
        pushdown(2*i);
      }
      if((2*i) < currentSize && (2*i)+1 < currentSize &&
			 storage[(2*i)].compareTo(storage[(2*i)+1]) > 0 &&
			 storage[i].compareTo(storage[(2*i)+1]) > 0){
        Comparable temp = storage[i];
        storage[i] = storage[(2*i)+1];
        storage[(2*i)+1] = temp;
        pushdown((2*i)+1);
      }
			else{
				return;
			}
    }


  public boolean isEmpty(){
    if(currentSize == 1){
      return true;
    }else{
    return false;
  }
  }

  public int	size (){

    return currentSize-1;
  }



	/*
	 * PURPOSE:
	 *    constructs a String representation of the elements in storage
	 *      ordered by their position in storage NOT by priority
	 *
	 * PARAMETERS:
	 *    None.
	 *
	 * RETURNS:
	 *    String - the String representation
	 *
	 */
	public String toString() {
		String s = "";
		String sep = "";
		for(int i=0;i<currentSize;i++) {
			s+= sep + storage[i];
			sep = " ";
		}
		return s;
	}

}
