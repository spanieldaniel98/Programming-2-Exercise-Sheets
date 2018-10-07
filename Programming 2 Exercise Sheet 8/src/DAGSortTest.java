/* JUnit4 test suite to test a unit of code that generates a topological ordering of a directed
 * acyclic graph (DAG).
 */

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

public class DAGSortTest {

    //Declaring a DAGSort object and 2D integer array for edges.
    DAGSort testDAGSort;
    int[][] edges;

    //setUp method that instantiates the declared DAGSort object for testing upon.
    @Before
    public void setUp() {
        testDAGSort = new DAGSort();
    }

    /* Test method to test that a NullPointerException is thrown if null is provided as a parameter
     * to the sortDAG method.
     */
    @Test(expected = NullPointerException.class)
    public void testNullPointerException() throws NullPointerException, InvalidNodeException, CycleDetectedException {

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that an InvalidNodeException is thrown if the edges parameter contains an
     * edge that is 1 less than 0.
     */
    @Test(expected = InvalidNodeException.class)
    public void testInvalidNodeExceptionWhereiOneLessThanZero() throws InvalidNodeException, CycleDetectedException {
    	
    	edges = new int[][] {
            {1, -1}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that an InvalidNodeException is thrown if the edges parameter contains an
     * edge that is 10 less than 0.
     */
    @Test(expected = InvalidNodeException.class)
    public void testInvalidNodeExceptionWhereiTenLessThanZero() throws InvalidNodeException, CycleDetectedException {

    	edges = new int[][] {
            {1, -1}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that an InvalidNodeException is thrown if the edges parameter contains an
     * edge that is 1 more than (edges.length - 1).
     */
    @Test(expected = InvalidNodeException.class)
    public void testInvalidNodeExceptionWhereiExceedsEdgesLengthByOne() throws InvalidNodeException, CycleDetectedException {

    	edges = new int[][] {
            {},
            {2,3},
            {4,6},
            {5},
            {6,8},
            {6},
            {},
            {}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that an InvalidNodeException is thrown if the edges parameter contains an
     * edge that is 10 more than (edges.length - 1).
     */
    @Test(expected = InvalidNodeException.class)
    public void testInvalidNodeExceptionWhereiExceedsEdgesLengthByTen() throws InvalidNodeException, CycleDetectedException {

    	edges = new int[][] {
            {},
            {2,3},
            {4,6},
            {5},
            {6,18},
            {6},
            {},
            {}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test if a CycleDetectedException is thrown even when no cycles exist in the DAG
     * (if the exception is incorrectly thrown, the test fails).
     */
    @Test
    public void testCycleDetectedExceptionNotThrownIncorrectly() throws CycleDetectedException, InvalidNodeException {

    	edges = new int[][] {
            {}  ,
            {2,3},
            {4,6},
            {5},
            {6,7},
            {4},
            {},
            {}
    	};
    	
        boolean cycleNotThrown = true;

        try {
            DAGSort.sortDAG(edges);
        } catch (CycleDetectedException e) {
           cycleNotThrown = false;
        }
        assertTrue(cycleNotThrown);
    }

    /* Test method to test that a CycleDetectedException is thrown if a graph that contains a self cycle
     * is passed as input to the sortDAG method.
     */
    @Test(expected = CycleDetectedException.class)
    public void testCycleDetectedExceptionForSelfCycle() throws CycleDetectedException, InvalidNodeException {

    	edges = new int[][] {
            {0}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that a CycleDetectedException is thrown if a graph that contains a simple
     * non-self cycle is passed as input to the sortDAG method.
     */
    @Test(expected = CycleDetectedException.class)
    public void testCycleDetectedExceptionForSimpleCycle() throws CycleDetectedException, InvalidNodeException {

    	edges = new int[][] {
            {1},
            {0}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that a CycleDetectedException is thrown if a graph that contains a longer
     * non-self cycle is passed as input to the sortDAG method.
     */
    @Test(expected = CycleDetectedException.class)
    public void testCycleDetectedExceptionForLongerCycle() throws CycleDetectedException, InvalidNodeException {
    	
    	edges = new int[][] {
            {1},
            {5},
            {0},
            {},
            {},
            {2}
    	};

        DAGSort.sortDAG(edges);
    }

    /* Test method to test that the sortDAG method returns a valid topological sort of the nodes of
     * the graph passed thereto.
     */
    @Test
    public void testValidTopologicalSort() throws CycleDetectedException, InvalidNodeException {

        edges = new int[][] {
                {},
                {2,3},
                {4,6},
                {5},
                {6,7},
                {6},
                {},
                {}
        };
        
        int[] expectedSort = new int[]{1,3,5,2,4,7,6,0};
        assertArrayEquals(expectedSort, DAGSort.sortDAG(edges));
    }
}