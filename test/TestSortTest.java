
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TestSortTest{

    @Test
    public void testBubbleSort(){
        int[] input = new int[]{14,33,27,35,10,19,42,44};
        BubbleSort bubbleSort = new BubbleSort();
        int[] sortedArray = bubbleSort.sort(input);
        Arrays.sort(input);
        assertArrayEquals(input,sortedArray);

    }
    @Test
    public void testInsertionSort (){
        int[] input = new int[]{14,33,27,35,10,19,42,44};
        InsertionSort insertionSort = new InsertionSort();
        int[] sortedArray = insertionSort.sort(input);
        Arrays.sort(input);
        assertArrayEquals(input, sortedArray);

    }
}