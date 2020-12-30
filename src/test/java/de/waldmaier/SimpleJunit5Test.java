package de.waldmaier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleJunit5Test {

  @Test
  public void testSimple() {
    assertTrue(true, "simple assert true");
  }

  @Test
  public void testException() {
    assertThrows(IllegalStateException.class, () -> {
      throw new IllegalStateException("l,l,l");
    }, "exception test");
  }


  @Test
  public void testNoException() {
    assertDoesNotThrow(() -> {
      throw new Exception("l,l,l");
    }, "no exception test");
  }

}
