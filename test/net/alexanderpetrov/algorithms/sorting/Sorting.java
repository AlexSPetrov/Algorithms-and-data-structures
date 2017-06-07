package net.alexanderpetrov.algorithms.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Sorting {

	Integer[] MEDIUM_UNSORTED = { -62, 2, 17, -14, 5, 34, 2, 4, 8, 26, 0 };
	Integer[] MEDIUM_SORTED = { -62, -14, 0, 2, 2, 4, 5, 8, 17, 26, 34 };

	Integer[] SINGLE_ELEMENT = { 6 };

	Integer[] EMPTY_ARRAY = {};

	@Test
	public void testSelectionSort() {
		Integer[] result = SelectionSort.sort(MEDIUM_UNSORTED.clone());
		assertTrue("Selection sort, MEDIUM_UNSORTED: "+printResult(result), isEqual(result, MEDIUM_SORTED));

		result = SelectionSort.sort(SINGLE_ELEMENT.clone());
		assertTrue("Selection sort, SINGLE_ELEMENT: "+printResult(result), isEqual(result, SINGLE_ELEMENT));

		result = SelectionSort.sort(EMPTY_ARRAY.clone());
		assertTrue("Selection sort, EMPTY_ARRAY: "+printResult(result), isEqual(result, EMPTY_ARRAY));

	}

	private boolean isEqual(Integer[] first, Integer[] second) {
		for (int i = 0; i < first.length; i++)
			if (first[i] != second[i])
				return false;
		return true;
	}

	private String printResult(Integer[] array) {
		StringBuilder result = new StringBuilder("{ ");
		for (int i = 0; i < array.length; i++)
			result.append(array[i] + " ");
		result.append("}");
		return result.toString();
	}
}