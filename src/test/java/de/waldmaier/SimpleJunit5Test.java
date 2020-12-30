package de.waldmaier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class SimpleJunit5Test {

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
