package main.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCalTest {

  @Test
  void add() {
      var simpleCal = new SimpleCal();
      assertEquals(5,simpleCal.add(2,3));


  }
}
