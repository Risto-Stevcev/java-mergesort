import mergesort.MergeSort;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestMergeSort extends junit.framework.TestCase {

    private MergeSort<Integer> ms;
    
    @BeforeClass
    public void setUp() {
        ms = new MergeSort<Integer>();
    }

    public void testMerge() {
        Integer[] left  = new Integer[] {1,4,6};
        Integer[] right = new Integer[] {2,3,5};
        Integer[] expected = new Integer[] {1,2,3,4,5,6};

        assertArrayEquals(expected, ms.merge( left, right ));
    }
    
    public void testMergeSort() {
        Integer[] list     = new Integer[] {7, 2, 1, 5, 77, 23, 12};
        Integer[] expected = new Integer[] {1, 2, 5, 7, 12, 23, 77};
        
        assertArrayEquals(expected, ms.mergeSort( list ));
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestMergeSort.class);
            for (Failure failure : result.getFailures()) {
                  System.out.println(failure.toString());
        }
    }
}
