package main.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringHandlerTest {

  @Test
  void
      Given_stringWithAdjacentDuplicates_When_removeAllKAdjacentDuplicates_THEN_returnModifiedString() {
    var stringHandler = new StringHandler();
    assertEquals("d", stringHandler.removeAllKAdjacentDuplicates("abbccad", 2));
    assertEquals("bbccad", stringHandler.removeAllKAdjacentDuplicates("baabbbabccad", 3));
  }
}
