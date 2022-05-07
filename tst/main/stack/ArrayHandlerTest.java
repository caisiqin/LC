package main.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArrayHandlerTest {
    @Test
    void
    Given_132PatternArray_When_is132Pattern_THEN_returnTrue() {
        var arrayHandler = new ArrayHandler();
        assertFalse(arrayHandler.is132Pattern(new int[] {1,2}));
        assertFalse(arrayHandler.is132Pattern(new int[]{1, 2, 3, 4}));
        assertTrue(arrayHandler.is132Pattern(new int[]{3, 1, 4, 2}));
        assertTrue(arrayHandler.is132Pattern(new int[]{-1, 2, 3, 2, 0}));
    }

}