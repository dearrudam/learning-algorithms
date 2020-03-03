package learning.algorithms.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ArrayTest {

    @Test
    public void testA() {
        final int[] test = { 1, 2, -3, 4, 5, -6
                // | positive slice| p<=q | | | |
                // (a[0],a[0]) = ( 1, 1) | true | true | 1 | | |
                // (a[0],a[1]) = ( 1, 2) | true | true | 1 e 2 | 1 e 2 | 3 |
                // (a[1],a[1]) = ( 2, 2) | true | true | 2 | | |
                // (a[1],a[2]) = ( 2,-3) | false | false | 2 e -3 | | |
                // (a[2],a[2]) = (-3,-3) | false | true | -3 | | |
                // (a[2],a[3]) = (-3, 4) | true | true | -3 e 4 | -3 | -3 |
                // (a[3],a[3]) = ( 4, 4) | true | true | 4 | | |
                // (a[3],a[4]) = ( 4, 5) | true | true | 4 e 5 | 4 e 5 | 9 | 9
                // (a[4],a[4]) = ( 5, 5) | true | true | 5 | | |
                // (a[4],a[5]) = ( 5,-6) | false | false | 5 e -6 | | |
                // (a[5],a[5]) = (-6,-6) | false | true | -6 | | |
        };
        Assert.assertEquals(9, new Solution().solution(test));

    }

    @Test
    public void testB() {
        final int[] test = { 1, 2, -3, 4, 5, -6, 3
                // | positive slice| p<=q | | | |
                // (a[0],a[0]) = ( 1, 1) | true | true | 1 | | |
                // (a[0],a[1]) = ( 1, 2) | true | true | 1 e 2 | 1 e 2 | 3 |
                // (a[1],a[1]) = ( 2, 2) | true | true | 2 | | |
                // (a[1],a[2]) = ( 2,-3) | false | false | 2 e -3 | | |
                // (a[2],a[2]) = (-3,-3) | false | true | -3 | | |
                // (a[2],a[3]) = (-3, 4) | true | true | -3 e 4 | -3 | -3 |
                // (a[3],a[3]) = ( 4, 4) | true | true | 4 | | |
                // (a[3],a[4]) = ( 4, 5) | true | true | 4 e 5 | 4 e 5 | 9 |
                // (a[4],a[4]) = ( 5, 5) | true | true | 5 | | |
                // (a[4],a[5]) = ( 5,-6) | false | false | 5 e -6 | | |
                // (a[5],a[5]) = (-6,-6) | false | true | -6 | | |
                // (a[5],a[6]) = (-6, 3) | false | false | | | |
                // (a[6],a[6]) = ( 3, 3) | true | true | 3 | 3 | 3 | 12

        };
        Assert.assertEquals(12, new Solution().solution(test));
    }

    @Test
    public void testC() {
        final int[] test = { 1
                // | positive slice| p<=q | | | |
                // (a[0],a[0]) = ( 1, 1) | true | true | 1 | | | 1
        };
        Assert.assertEquals(1, new Solution().solution(test));

    }

    @Test
    public void testD() {
        final int[] test = { -1
                // | positive slice| p<=q | | | |
                // (a[0],a[0]) = ( 1, 1) | false | true | | | |
        };
        Assert.assertEquals(0, new Solution().solution(test));

    }

    @Test
    public void testE() {
        final int[] test = {};
        Assert.assertEquals(0, new Solution().solution(test));

    }

    @Test
    public void testF() {
        final int[] test = { -3, 2, 1, -6, 5, 4, 3
                // | positive slice| p<=q | |
                // (a[0],a[0]) = (-3,-3) | false | true | |
                // (a[0],a[1]) = (-3, 2) | false | true | |
                // (a[1],a[1]) = ( 2, 2) | true | true | 2 |
                // (a[1],a[2]) = ( 2, 1) | true | false | |
                // (a[2],a[2]) = ( 1, 1) | true | true | 1 |
                // (a[2],a[3]) = ( 1,-6) | false | false | |
                // (a[3],a[3]) = (-6,-6) | false | true | |
                // (a[3],a[4]) = (-6, 5) | false | true | |
                // (a[4],a[4]) = ( 5, 5) | true | true | |
                // (a[4],a[5]) = ( 5, 4) | true | true | 5 + 4 |
                // (a[5],a[5]) = ( 4, 4) | true | true | |
                // (a[5],a[6]) = ( 4, 3) | true | false | |
                // (a[6],a[6]) = ( 3, 3) | true | true | 3 |
        };
        Assert.assertEquals((0 + (2) + (1) + (5) + (4) + (3)), new Solution().solution(test));
    }

    public class Solution {

        public int solution(final int[] A) {
            final Set<Integer> indexesToBeSummarized = new LinkedHashSet<>();
            for (int q = 0; q < A.length; q++) {
                int p = q;
                if (PIsLessOrEqualsToQ(A[p], A[q]) && isPositiveSlice(A[p], A[q])) {
                    indexesToBeSummarized.add(p);
                    indexesToBeSummarized.add(q);
                }
                p = q - 1;
                if (p >= 0) {
                    if (PIsLessOrEqualsToQ(A[p], A[q]) && isPositiveSlice(A[p], A[q])) {
                        indexesToBeSummarized.add(p);
                        indexesToBeSummarized.add(q);
                    }
                }
            }
            final int amount = indexesToBeSummarized.stream().map(i -> A[i]).reduce(0, (a, b) -> a += b);
            return amount;
        }

        boolean PIsLessOrEqualsToQ(final int p, final int q) {
            return p <= q;
        }

        private boolean isPositiveSlice(final int p, final int q) {
            return (p + q) >= 0;
        }
    }

}
