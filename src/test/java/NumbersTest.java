import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class NumbersTest {

  @Test
  public void numbersToWords_returnsTheWrittenFormOfAnInteger_1() {
  Numbers numbers = new Numbers();
  String written = " thirty five";
  assertEquals(written, numbers.lessThanThousand(35));
  }

  @Test
  public void numbersToWords_returnsTheWrittenFormOfAnInteger_2() {
    Numbers numbers = new Numbers();
    String written = " nine hundred ninety nine";
    assertEquals(written, numbers.lessThanThousand(999));
  }
}
