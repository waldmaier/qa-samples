package de.waldmaier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleJunit5Test {

  private TestHelloWorld testHelloWorld;

  @BeforeEach
  public void init() {
    testHelloWorld = new TestHelloWorld();
  }


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
    assertDoesNotThrow(() -> "ok", "no exception test");
  }

  @Test
  public void testHelloWorlJacoco() {
    assertEquals(testHelloWorld.xyz(), "xyz");
  }
}
