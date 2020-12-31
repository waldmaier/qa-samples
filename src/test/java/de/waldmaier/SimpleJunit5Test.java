package de.waldmaier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
class SimpleJunit5Test {

  @InjectMocks
  @Spy
  private TestHelloWorld testHelloWorld;

  @Test
  void testSimple() {
    assertTrue(true, "simple assert true");
  }

  @Test
  void testException() {
    assertThrows(IllegalStateException.class, () -> {
      throw new IllegalStateException("l,l,l");
    }, "exception test");
  }


  @Test
  void testNoException() {
    assertDoesNotThrow(() -> "ok", "no exception test");
  }

  @Test
  void testHelloWorlJacoco() {
    assertEquals(testHelloWorld.xyz(), "xyz");
  }

  @Test
  void assert_all_test() {
    assertAll(
        () -> assertTrue(true, "first"),
        () -> assertTrue(true, "second"),
        () -> assertTrue(true, "third"),
        () -> assertTrue(true, "four")
    );
  }
}
