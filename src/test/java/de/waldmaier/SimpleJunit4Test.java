package de.waldmaier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class SimpleJunit4Test {

  @InjectMocks
  @Spy
  private TestHelloWorld testHelloWorld;

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
