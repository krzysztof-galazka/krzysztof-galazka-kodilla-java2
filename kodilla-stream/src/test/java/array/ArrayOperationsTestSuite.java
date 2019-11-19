package array;

import com.kodilla.stream.array.ArrayOperations;
import org.junit.Assert;
import org.junit.Test;


public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers[] = {1, 9, 4, 6, 4, 5, 1, 3};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(4.125, average, 0.01);
    }
}

