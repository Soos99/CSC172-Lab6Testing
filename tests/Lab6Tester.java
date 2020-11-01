import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;
import org.apache.commons.io.FileUtils;

/*
	Tests for Lab 1 of CSC172 Fall 2020
	Methods tested: Lab1.isAnagram(String, String) and Lab1.isRotation(String, String)

	Made by: Pavlo Pastaryev
	Email: ppastary@u.rochester.edu 
*/
public class Lab6Tester {
	Sorting tester;
	int[] test1, test2, test3, test4, test5, test6;
	int[] result1, result2, result3, result4, result5, result6;

	@Before
	public void init() throws FileNotFoundException {
		tester = new Sorting();

		// read input
		File f1 = new File("tests/input/1Kints.txt");
		File f2 = new File("tests/input/2Kints.txt");
		File f3 = new File("tests/input/4Kints.txt");
		File f4 = new File("tests/input/8Kints.txt");
		File f5 = new File("tests/input/16Kints.txt");
		File f6 = new File("tests/input/32Kints.txt");

		// process input
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(f2);
		Scanner sc3 = new Scanner(f3);
		Scanner sc4 = new Scanner(f4);
		Scanner sc5 = new Scanner(f5);
		Scanner sc6 = new Scanner(f6);

		// put into array
		test1 = new int[1000];
		test2 = new int[2000];
		test3 = new int[4000];
		test4 = new int[8000];
		test5 = new int[16000];
		test6 = new int[32000];
		
		for (int i = 0; i < 1000; i++) {
			test1[i] = sc1.nextInt();
		}
		for (int i = 0; i < 2000; i++) {
			test2[i] = sc2.nextInt();
		}
		for (int i = 0; i < 4000; i++) {
			test3[i] = sc3.nextInt();
		}
		for (int i = 0; i < 8000; i++) {
			test4[i] = sc4.nextInt();
		}
		for (int i = 0; i < 16000; i++) {
			test5[i] = sc5.nextInt();
		}
		for (int i = 0; i < 32000; i++) {
			test6[i] = sc6.nextInt();
		}

		// close scanner
		sc1.close();
		sc2.close();
		sc3.close();
		sc4.close();
		sc5.close();
		sc6.close();

		// get result
		result1 = test1.clone();
		result2 = test2.clone();
		result3 = test3.clone();
		result4 = test4.clone();
		result5 = test5.clone();
		result6 = test6.clone();
		Arrays.sort(result1);
		Arrays.sort(result2);
		Arrays.sort(result3);
		Arrays.sort(result4);
		Arrays.sort(result5);
		Arrays.sort(result6);
	}

	@Test
	public void testDefaultSort1K() {
		int[] input = test1.clone();
		Sorting.defaultSort(input);
		boolean compare = compareArray(input, result1);
		assertEquals(true, compare);
	}

	@Test
	public void testDefaultSort2K() {
		int[] input = test2.clone();
		Sorting.defaultSort(input);
		boolean compare = compareArray(input, result2);
		assertEquals(true, compare);
	}

	@Test
	public void testDefaultSort4K() {
		int[] input = test3.clone();
		Sorting.defaultSort(input);
		boolean compare = compareArray(input, result3);
		assertEquals(true, compare);
	}

	@Test
	public void testDefaultSort8K() {
		int[] input = test4.clone();
		Sorting.defaultSort(input);
		boolean compare = compareArray(input, result4);
		assertEquals(true, compare);
	}

	@Test
	public void testDefaultSort16K() {
		int[] input = test5.clone();
		Sorting.defaultSort(input);
		boolean compare = compareArray(input, result5);
		assertEquals(true, compare);
	}

	@Test
	public void testDefaultSort32K() {
		int[] input = test6.clone();
		Sorting.defaultSort(input);
		boolean compare = compareArray(input, result6);
		assertEquals(true, compare);
	}

	@Test
	public void testBubbleSort1K() {
		int[] input = test1.clone();
		Sorting.bubbleSort(input);
		boolean compare = compareArray(input, result1);
		assertEquals(true, compare);
	}

	@Test
	public void testBubbleSort2K() {
		int[] input = test2.clone();
		Sorting.bubbleSort(input);
		boolean compare = compareArray(input, result2);
		assertEquals(true, compare);
	}

	@Test
	public void testBubbleSort4K() {
		int[] input = test3.clone();
		Sorting.bubbleSort(input);
		boolean compare = compareArray(input, result3);
		assertEquals(true, compare);
	}

	@Test
	public void testBubbleSort8K() {
		int[] input = test4.clone();
		Sorting.bubbleSort(input);
		boolean compare = compareArray(input, result4);
		assertEquals(true, compare);
	}

	@Test
	public void testBubbleSort16K() {
		int[] input = test5.clone();
		Sorting.bubbleSort(input);
		boolean compare = compareArray(input, result5);
		assertEquals(true, compare);
	}

	@Test
	public void testBubbleSort32K() {
		int[] input = test6.clone();
		Sorting.bubbleSort(input);
		boolean compare = compareArray(input, result6);
		assertEquals(true, compare);
	}

	@Test
	public void testSelectionSort1K() {
		int[] input = test1.clone();
		Sorting.selectionSort(input);
		boolean compare = compareArray(input, result1);
		assertEquals(true, compare);
	}

	@Test
	public void testSelectionSort2K() {
		int[] input = test2.clone();
		Sorting.selectionSort(input);
		boolean compare = compareArray(input, result2);
		assertEquals(true, compare);
	}

	@Test
	public void testSelectionSort4K() {
		int[] input = test3.clone();
		Sorting.selectionSort(input);
		boolean compare = compareArray(input, result3);
		assertEquals(true, compare);
	}

	@Test
	public void testSelectionSort8K() {
		int[] input = test4.clone();
		Sorting.selectionSort(input);
		boolean compare = compareArray(input, result4);
		assertEquals(true, compare);
	}

	@Test
	public void testSelectionSort16K() {
		int[] input = test5.clone();
		Sorting.selectionSort(input);
		boolean compare = compareArray(input, result5);
		assertEquals(true, compare);
	}

	@Test
	public void testSelectionSort32K() {
		int[] input = test6.clone();
		Sorting.selectionSort(input);
		boolean compare = compareArray(input, result6);
		assertEquals(true, compare);
	}

	@Test
	public void testInsertionSort1K() {
		int[] input = test1.clone();
		Sorting.insertionSort(input);
		boolean compare = compareArray(input, result1);
		assertEquals(true, compare);
	}

	@Test
	public void testInsertionSort2K() {
		int[] input = test2.clone();
		Sorting.insertionSort(input);
		boolean compare = compareArray(input, result2);
		assertEquals(true, compare);
	}

	@Test
	public void testInsertionSort4K() {
		int[] input = test3.clone();
		Sorting.insertionSort(input);
		boolean compare = compareArray(input, result3);
		assertEquals(true, compare);
	}

	@Test
	public void testInsertionSort8K() {
		int[] input = test4.clone();
		Sorting.insertionSort(input);
		boolean compare = compareArray(input, result4);
		assertEquals(true, compare);
	}

	@Test
	public void testInsertionSort16K() {
		int[] input = test5.clone();
		Sorting.insertionSort(input);
		boolean compare = compareArray(input, result5);
		assertEquals(true, compare);
	}

	@Test
	public void testInsertionSort32K() {
		int[] input = test6.clone();
		Sorting.insertionSort(input);
		boolean compare = compareArray(input, result6);
		assertEquals(true, compare);
	}
	

	@Test
	public void testMergeSort1K() {
		int[] input = test1.clone();
		Sorting.mergeSort(input);
		boolean compare = compareArray(input, result1);
		assertEquals(true, compare);
	}

	@Test
	public void testMergeSort2K() {
		int[] input = test2.clone();
		Sorting.mergeSort(input);
		boolean compare = compareArray(input, result2);
		assertEquals(true, compare);
	}

	@Test
	public void testMergeSort4K() {
		int[] input = test3.clone();
		Sorting.mergeSort(input);
		boolean compare = compareArray(input, result3);
		assertEquals(true, compare);
	}

	@Test
	public void testMergeSort8K() {
		int[] input = test4.clone();
		Sorting.mergeSort(input);
		boolean compare = compareArray(input, result4);
		assertEquals(true, compare);
	}

	@Test
	public void testMergeSort16K() {
		int[] input = test5.clone();
		Sorting.mergeSort(input);
		boolean compare = compareArray(input, result5);
		assertEquals(true, compare);
	}

	@Test
	public void testMergeSort32K() {
		int[] input = test6.clone();
		Sorting.mergeSort(input);
		boolean compare = compareArray(input, result6);
		assertEquals(true, compare);
	}

	@Test
	public void testQuickSort1K() {
		int[] input = test1.clone();
		Sorting.quickSort(input);
		boolean compare = compareArray(input, result1);
		assertEquals(true, compare);
	}

	@Test
	public void testQuickSort2K() {
		int[] input = test2.clone();
		Sorting.quickSort(input);
		boolean compare = compareArray(input, result2);
		assertEquals(true, compare);
	}

	@Test
	public void testQuickSort4K() {
		int[] input = test3.clone();
		Sorting.quickSort(input);
		boolean compare = compareArray(input, result3);
		assertEquals(true, compare);
	}

	@Test
	public void testQuickSort8K() {
		int[] input = test4.clone();
		Sorting.quickSort(input);
		boolean compare = compareArray(input, result4);
		assertEquals(true, compare);
	}

	@Test
	public void testQuickSort16K() {
		int[] input = test5.clone();
		Sorting.quickSort(input);
		boolean compare = compareArray(input, result5);
		assertEquals(true, compare);
	}

	@Test
	public void testQuickSort32K() {
		int[] input = test6.clone();
		Sorting.quickSort(input);
		boolean compare = compareArray(input, result6);
		assertEquals(true, compare);
	}

	public boolean compareArray(int[] a, int[] b) {
		if (a.length != b.length)
			return false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}

}