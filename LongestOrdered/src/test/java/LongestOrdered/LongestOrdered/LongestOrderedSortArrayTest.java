package LongestOrdered.LongestOrdered;

import org.junit.Test;

import static LongestOrdered.LongestOrdered.LongestOrdered.sortArrayByLongestOrderedv2;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


public class LongestOrderedSortArrayTest {

//	public LongestOrderedSortArrayTest(String testName) {
//		super(testName);

//	}


	@Test


	public void ShouldSortByLongest() {
		String[] arrayToBeSorted = new String[5];
		String[] sortedArray = new String[5];
		arrayToBeSorted[0] = "aaa";
		arrayToBeSorted[1] = "aaa1212";
		arrayToBeSorted[2] = "122221111";
		arrayToBeSorted[3] = "0";
		arrayToBeSorted[4] = "!@";
		sortedArray = sortArrayByLongestOrderedv2(arrayToBeSorted);

		assertEquals("Array is not sorted correctly", "0", sortedArray[0]);
		assertEquals("Array is not sorted correctly", "!@", sortedArray[1]);
		assertEquals("Array is not sorted correctly", "aaa", sortedArray[2]);
		assertEquals("Array is not sorted correctly", "aaa1212", sortedArray[3]);
		assertEquals("Array is not sorted correctly", "122221111", sortedArray[4]);


	}


	@Test
		public void ShouldDetectNullValuesInArray() {
		String[] arrayToBeSorted = new String[5];
		String[] sortedArray;
		sortedArray = sortArrayByLongestOrderedv2(arrayToBeSorted);
		for (int i = 0; i < sortedArray.length; i++) {
			assertNull(sortedArray[i]);
		}



		}

	@Test
	public void ShouldDetectNullValuesInsteadOfArray() {
		String[] arrayToBeSorted = null;
		String[] sortedArray;
		sortedArray = sortArrayByLongestOrderedv2(arrayToBeSorted);
		assertNull(sortedArray);




	}
	}





