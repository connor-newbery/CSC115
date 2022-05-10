// Name: Connor Newbery
// Student number: V00921605

import java.util.*;
public class WordFrequencyReport<K extends Comparable<K>, V> {
	private static final int CAPACITY = 5;

	/*
	 * Purpose: Obtain the 5 most frequent words found
	 * Parameters: MaxFrequencyHeap h - the heap containing all the word entry data
	 * Returns: Entry[] - an array containing the top 5 entries (which are the
	 *     word, frequency pairs with the maximum frequency values)
	 */
	public static List<Entry<String, Integer>> overallMostFrequent(MaxFrequencyHeap<String,Integer> h) {
		List<Entry<String, Integer>> top5 = new ArrayList<Entry<String,Integer>>(CAPACITY);
		MaxFrequencyHeap N = new MaxFrequencyHeap();
		Entry<String, Integer> n;
		int i = 0;
		while(i < 5){
		if(h.isEmpty()){
			break;
		}
		n = h.removeMax();
			top5.add(n);
			N.insert(n);
			i++;
		}
		while(!N.isEmpty()){
			h.insert(N.removeMax());
		}

		return top5;
	}

	/*
	 * Purpose: Obtain the 5 most frequent words found that are at least n charaters long
	 * Parameters: MaxFrequencyHeap h - the heap containing all the word entry data
	 *             int n - minimum word length to consider
	 * Returns: Entry[] - an array containing the top 5 entries (which are the
	 *     word, frequency pairs with the maximum frequency values of words
	 *     that are at least n characters long)
	 */
	public static List<Entry<String, Integer>> atLeastLength(MaxFrequencyHeap<String,Integer> h, int n) {
		List<Entry<String, Integer>> top5 = new ArrayList<Entry<String,Integer>>(CAPACITY);

		MaxFrequencyHeap N = new MaxFrequencyHeap();
		Entry<String, Integer> newEntry;
		int i = 0;
		while(top5.size() < 5){
			if(h.isEmpty()){
				break;
			}
			newEntry = h.removeMax();
			if(newEntry.getKey().length() >= n){
				top5.add(newEntry);
			}
			N.insert(newEntry);
			i++;
		}
		while(!N.isEmpty()){
			h.insert(N.removeMax());
		}

		return top5;
	}


	/*
	 * Purpose: Obtain the 5 most frequent words found that begin with the given letter
	 * Parameters: MaxFrequencyHeap h - the heap containing all the word entry data
	 *             char letter - only words that begin with given letter are considered
	 * Returns: Entry[] - an array containing the top 5 entries (which are the
	 *     word, frequency pairs with the maximum frequency values of words
	 *     that begin with the given letter)
	 */
	public static List<Entry<String, Integer>> startsWith(MaxFrequencyHeap<String,Integer> h, char letter) {
		List<Entry<String, Integer>> top5 = new ArrayList<Entry<String,Integer>>(CAPACITY);
		MaxFrequencyHeap N = new MaxFrequencyHeap();
		Entry<String, Integer> newEntry;
		int i = 0;
		while(top5.size() < 5){
			if(h.isEmpty()){
				break;
			}
			newEntry = h.removeMax();
			if(newEntry.getKey().charAt(0) == letter){
				top5.add(newEntry);
			}
			N.insert(newEntry);
			i++;
		}
		while(!N.isEmpty()){
			h.insert(N.removeMax());
		}

		return top5;
	}

}
