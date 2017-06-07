package net.alexanderpetrov.algorithms.sorting;

/**
 * Selection sort
 * 
 * Time complexity:
 * 	Average: O(n^2)
 * 	Best:    O(n^2)
 * 	Worst:   O(n^2)
 *
 * Memory: O(1) 
 * Stable: No
 *
 */
public class SelectionSort<T extends Comparable<T>> {

	public static <T extends Comparable<T>> T[] sort(T[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = i;
			
			for (int j = i + 1; j < array.length; j++)
				if (array[j].compareTo(array[min]) < 0)
					min = j;
			
			T aux = array[i];
			array[i] = array[min];
			array[min] = aux;
		}
		return array;
	}

}