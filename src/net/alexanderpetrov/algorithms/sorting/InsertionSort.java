package net.alexanderpetrov.algorithms.sorting;

/**
 * Insertion sort
 * 
 * Time complexity: 
 * 	Average: O(n^2)
 * 	Best: O(n) - if array is sorted Worst:
 * 	O(n^2) - if array is sorted in reverse order
 *
 * Memory: O(1)
 * Stable: Yes
 *
 */
public class InsertionSort<T extends Comparable<T>> {
	public static <T extends Comparable<T>> T[] sort(T[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0 && array[j].compareTo(array[j - 1]) < 0; j--) {
				T aux = array[j];
				array[j] = array[j - 1];
				array[j - 1] = aux;
			}
		}
		return array;
	}
}