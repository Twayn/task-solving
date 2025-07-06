package com.training.solving;

import com.training.solving.cases.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TwoSumTest {

	@Test
	void hasSumEqualTest() {
		var objUnderTest = new TwoSum();

		Assertions.assertArrayEquals(objUnderTest.twoSum(new int[]{-3,-4,-8,-10}, -7), new int[]{1,0});


		int[] array = new int[]{-3};
		int num = -8;

		System.out.println(num - array[0]);
	}

}
