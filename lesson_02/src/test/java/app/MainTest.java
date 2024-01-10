package app;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    // 1. Проверяем, действительно ли метод выдаёт ошибку при отриц.значении.
    // 2. Проверим, правильный ли размер массива.
    // 3. Проверим работу метода при граничных значениях (0).
    // 4. Проверим, действительно ли соседние элементы отличаются на 1.
    // 5. Точечно проверим внутренние значения в массиве.
    // 6. Проверим, что метод возвращает не null.

    //1
    @Test(expected = IllegalArgumentException.class)
    public void checkExpectedException() {
        Main.getArray(-1);
    }

    //2
    @Test
    public void checkIfArraySizeIsCorrect() {
        int[] result = Main.getArray(7);
        int expectedSize = 7;
        int actualSize = result.length;
        Assert.assertEquals(expectedSize, actualSize);
    }

    //3
    @Test
    public void checkBoundaryValues () {
        int[] result = Main.getArray(0);
        int expectedSize = 0;
        int actualSize = result.length;
        Assert.assertEquals(expectedSize, actualSize);
    }

    //4
    @Test
    public void checkThatDifferenceBetweenElementsIsByOne(){
        int[] result = Main.getArray(5);
        for (int i = 0; i < result.length; i++) {
            int expectedValue = i + 1;
            Assert.assertEquals(expectedValue, result[i]);
        }
    }

    //5
    @Test
    public void checkValues() {
        int[] result = Main.getArray(4);
        int[] expectedValues = {1, 2, 3, 4};
        Assert.assertArrayEquals(expectedValues, result);
    }

    //6
    @Test
    public void checkReturnNull() {
        int[] result = Main.getArray(3);
        Assert.assertNotNull(result);
    }


}