package com.training.solving.cases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class FindSumPairsTest {

    @Test
    void findSumPairsTest() {
        FindSumPairsNonOptimal pairs = new FindSumPairsNonOptimal(new int[]{1,1,2,2,2,3}, new int[]{1,4,5,2,5,4});
        Assertions.assertEquals(8, pairs.count(7));
        pairs.add(3, 2);

        Assertions.assertEquals(2, pairs.count(8));
        Assertions.assertEquals(1, pairs.count(4));
        pairs.add(0, 1);
        pairs.add(1, 1);

        Assertions.assertEquals(11, pairs.count(7));
    }

    @Test
    void findSumPairsTestOptimal() {
        FindSumPairsOptimal pairs = new FindSumPairsOptimal(new int[]{1,1,2,2,2,3}, new int[]{1,4,5,2,5,4});
        Assertions.assertEquals(8, pairs.count(7));
        pairs.add(3, 2);
        Assertions.assertEquals(2, pairs.count(8));
        Assertions.assertEquals(1, pairs.count(4));
        pairs.add(0, 1);
        pairs.add(1, 1);

        Assertions.assertEquals(11, pairs.count(7));
    }
}